package utility;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;

public class BaseClass {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeMethod
	public void setUp() throws EmailException {

		driver = BrowserFactory.getBrowser("Firefox");
		Mail.SendEmail();
		//System.out.println("Email sent");
		report = new ExtentReports(".\\Reports\\MMPHomePageReport.html",true);
		logger = report.startTest("Verify MMPHome Page - Logs and reports added");

		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		logger.log(LogStatus.INFO, "Application up and running");
	}

	@AfterMethod
	public void tearDown() {

		BrowserFactory.closeBrowser();
		report.endTest(logger);
		report.flush();
	}

}
