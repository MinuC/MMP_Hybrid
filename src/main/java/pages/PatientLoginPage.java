
// ******************** PatientLoginPage ******************************

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientLoginPage {

	WebDriver driver;
	
	public PatientLoginPage(WebDriver driver) {
		 this.driver = driver;
	}
	
	//@FindBy(id="username") WebElement user;
	@FindBy(how=How.ID, using="username") WebElement user;
	@FindBy(id="password") WebElement pwd;
	@FindBy(name="submit") WebElement signIn;
	
	//@FindBy(xpath="//a/span[text()='Logout']")WebElement logoutLink;
	By forgotUserPwdLink = By.xpath("//p/a[text()='forgot Username / Password']");
	
	public void loginToAppln(String uname, String password) throws InterruptedException{
		
		user.clear();
		user.sendKeys(uname);
		pwd.clear();
		pwd.sendKeys(password);
		signIn.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public String verifyForgotUserPwdLink(){
		
		WebDriverWait wait =  new WebDriverWait(driver,30);
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(forgotUserPwdLink));
		return ele.getText();
	}
	
	/*public boolean login(String uname,String passWord)
	{
		WebElement uName= driver.findElement(By.id("username"));
		uName.clear();
		uName.sendKeys(uname);
		WebElement pWord= driver.findElement(By.id("password"));
		pWord.clear();
		pWord.sendKeys(passWord);
	   driver.findElement(By.name("submit")).sendKeys(Keys.ENTER);
	   return true;
	}*/
}
