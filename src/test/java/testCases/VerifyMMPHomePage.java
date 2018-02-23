package testCases;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.MMPHomePage;

public class VerifyMMPHomePage {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws EmailException {
		driver = BrowserFactory.getBrowser("Firefox");
		//Helper.SendEmail();
		//System.out.println("Email sent");
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	}

	@Test
	public void verifyTitle() throws InterruptedException{
		MMPHomePage mmpHome = PageFactory.initElements(driver, MMPHomePage.class);

		String mmpTitle = mmpHome.getTitle();
		Assert.assertEquals(mmpTitle, "NAMTG");
		System.out.println("MMP Title is: "+ mmpTitle);
	}	

	@AfterTest
	public void tearDown() {
		BrowserFactory.closeBrowser();
	}
}
