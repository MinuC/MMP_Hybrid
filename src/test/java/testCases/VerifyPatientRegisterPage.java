package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import factory.DataProviderFactory;
import pages.PatientRegisterPage;

public class VerifyPatientRegisterPage {
	
	WebDriver driver;
	PatientRegisterPage pRegister;
	
	@Test
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

		
	}
	

}
