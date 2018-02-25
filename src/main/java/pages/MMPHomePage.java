
// *********** MMPHomePage **********************

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MMPHomePage {		// MAIN HOME PAGE
	WebDriver driver;//global variable
	
	public MMPHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[text()='Home']") WebElement homeLink;
	@FindBy(xpath="//a[text()='Patient Login']") WebElement patientLoginLink;
	@FindBy(xpath="//a[text()='Office Login']") WebElement officeLoginLink;
	@FindBy(xpath="//a[text()='About Us']") WebElement aboutUsLink;
	@FindBy(xpath="//a[text()='Contact Us']") WebElement contactUsLink;
	
	@FindBy(xpath="//a[text()='Login'][1]") WebElement loginLink;
	@FindBy(xpath="//a[text()='Register']") WebElement registerLink;
	
	public void navigateToPatientLoginPage()
	{
		//driver.findElement(By.linkText("Patient Login")).click();
		patientLoginLink.click(); // Click on <Patient Login> tab
		loginLink.click();
		//driver.findElement(By.linkText("Login")).click(); // Click on <Login> button
		//driver.findElement(By.cssSelector(".button.button-alt")).click();
	}
	
	public void navigateToPatientRegisterPage()
	{
		//driver.findElement(By.linkText("Patient Login")).click();
		patientLoginLink.click(); // Click on <Patient Login> tab
		registerLink.click();
		//driver.findElement(By.linkText("Login")).click(); // Click on <Login> button
		//driver.findElement(By.cssSelector(".button.button-alt")).click();
	}
	
	public String getTitle(){
		
		String title =  driver.getTitle();
		return title;	
	}
	
	public void navigateToOfficeLogin(){
		
		officeLoginLink.click();
	}
	
	public void navigateToAboutUs()
	{
		aboutUsLink.click();
	}
	
	public void navigateToContactUs()
	{
		contactUsLink.click();
	}
	
	public void navigateToAdminLoginPage()
	{

	}
	
	public void navigateToDoctorLoginPage()
	{

	}

	
}
