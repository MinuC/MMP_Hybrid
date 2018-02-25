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

public class VerifyPatientLoginPage {

	WebDriver driver;
	MMPHomePage mmpHome;
	PatientLoginPage pLogin;
	

	@BeforeMethod
	public void setUp() {
		driver = BrowserFactory.getBrowser("Firefox");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

	@Test(priority=0)
	public void verifyTitle() throws InterruptedException{
		mmpHome = PageFactory.initElements(driver, MMPHomePage.class);

		String mmpTitle = mmpHome.getTitle();
		Assert.assertEquals(mmpTitle, "NAMTG");
		//System.out.println("MMP Title is: "+ mmpTitle);
	}	

	@Test(priority=1)
	public void appLogin() throws InterruptedException{
		mmpHome = PageFactory.initElements(driver, MMPHomePage.class);
		mmpHome.navigateToPatientLoginPage();
		
		pLogin = PageFactory.initElements(driver, PatientLoginPage.class);
		
		String linkText = pLogin.verifyForgotUserPwdLink();
		Assert.assertEquals(linkText, "forgot Username / Password");

		//pLogin.loginToAppln("TomBrady_123", "TomBrady@123");//passing parameter values manually
		//Reading login credentials from Excel sheet
		pLogin.loginToAppln(DataProviderFactory.getExcel().getCellData(0, 0, 0), DataProviderFactory.getExcel().getCellData(0, 0, 1));
		  
	}	

	@AfterMethod
	public void tearDown(){
		BrowserFactory.closeBrowser();
	}

}
