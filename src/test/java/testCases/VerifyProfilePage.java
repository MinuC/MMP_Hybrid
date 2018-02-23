package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.MMPHomePage;
import pages.PatientHomePage;
import pages.PatientLoginPage;
import pages.ProfilePage;
import utility.Navigator;

public class VerifyProfilePage {

	WebDriver driver;

	MMPHomePage mmpHome;
	PatientLoginPage pLogin;
	PatientHomePage pHome;

	@BeforeTest
	public void setUp(){
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

		//		WebDriverWait wait = new WebDriverWait(driver,30);
		//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Patient Login']")));
		mmpHome.navigateToPatientLoginPage();

		pLogin = PageFactory.initElements(driver, PatientLoginPage.class);
		//pLogin.loginToAppln("TomBrady_123", "TomBrady@123");//passing parameter values manually

		/*loginToApp method in PatientLoginPage is returning the username. Assigning that value to string user.
		Reading login credentials from Excel sheet*/
		pLogin.loginToAppln(DataProviderFactory.getExcel().getCellData(0, 0, 0), DataProviderFactory.getExcel().getCellData(0, 0, 1));	
	}	

	@Test(description="Verify Title & Username - PatientHomePage", dependsOnMethods = {"appLogin"})
	public void validateTitleAndUsername(){
		pHome = PageFactory.initElements(driver, PatientHomePage.class);
		String pTitle = pHome.getPortalTitle();
		Assert.assertEquals(pTitle, "Patient Portal");

		String user = pHome.verifyUser();
		//System.out.println("Valid user: "+ user);
		//Assert.assertTrue(user.contains("TomBrady"));
		Assert.assertEquals(user, "Mike");
		//Assert.assertEquals(user, "Brian","User names not matching");
	}

	@Test(dependsOnMethods = {"validateTitleAndUsername"})
	public void navigateToProfilePage() throws Exception{
		Navigator.navigateToTab("Profile", driver);

		ProfilePage pProfile = PageFactory.initElements(driver, ProfilePage.class);
		String actName = pProfile.getProfilePatientName();
		Assert.assertEquals(actName, "Mike Williams");	
		pProfile.editProfile();
		Thread.sleep(3000);
	}

	@AfterTest
	public void closeReport(){
		BrowserFactory.closeBrowser();
	}
}
