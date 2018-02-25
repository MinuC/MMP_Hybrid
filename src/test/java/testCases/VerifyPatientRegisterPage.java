package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.MMPHomePage;
import pages.PatientLoginPage;
import pages.PatientRegisterPage;

public class VerifyPatientRegisterPage {
	
	WebDriver driver;
	MMPHomePage mmpHome;
	PatientRegisterPage pRegister;
	
	@BeforeMethod
	public void setUp() {
		driver = BrowserFactory.getBrowser("Firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}
	
	@Test
	public void confirmRegistrationPage(){
		
		mmpHome = PageFactory.initElements(driver, MMPHomePage.class);
		mmpHome.navigateToPatientRegisterPage();
		
		pRegister = PageFactory.initElements(driver, PatientRegisterPage.class);
		Assert.assertEquals(pRegister.verifyAcctDetailsLabel(), "ACCOUNT DETAILS", "labels not matching");
	}
	
	@AfterMethod
	public void tearDown(){
		BrowserFactory.closeBrowser();
	}
	
	/*@Test
	public void registerToPatientPortal(){
		pRegister = PageFactory.initElements(driver, PatientRegisterPage.class);
		pRegister.patientRegisteration(DataProviderFactory.getExcel().getCellData(1, 1, 0), 
				DataProviderFactory.getExcel().getCellData(1, 1, 1), DataProviderFactory.getExcel().getCellData(1, 1, 2), 
				DataProviderFactory.getExcel().getCellData(1, 1, 3), DataProviderFactory.getExcel().getCellData(1, 1, 4), 
				DataProviderFactory.getExcel().getCellData(1, 1, 5), DataProviderFactory.getExcel().getCellData(1, 1, 6), 
				DataProviderFactory.getExcel().getCellData(1, 1, 7), DataProviderFactory.getExcel().getCellData(1, 1, 8), 
				DataProviderFactory.getExcel().getCellData(1, 1, 9), DataProviderFactory.getExcel().getCellData(1, 1, 10), 
				DataProviderFactory.getExcel().getCellData(1, 1, 11), DataProviderFactory.getExcel().getCellData(1, 1, 12), 
				DataProviderFactory.getExcel().getCellData(1, 1, 13), DataProviderFactory.getExcel().getCellData(1, 1, 14), 
				DataProviderFactory.getExcel().getCellData(1, 1, 15), DataProviderFactory.getExcel().getCellData(1, 1, 16), 
				DataProviderFactory.getExcel().getCellData(1, 1, 17), DataProviderFactory.getExcel().getCellData(1, 1, 18), 
				DataProviderFactory.getExcel().getCellData(1, 1, 19));

		
	}*/
	

}
