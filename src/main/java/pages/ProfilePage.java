package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	
	WebDriver driver;
	
	public ProfilePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(id="fname") WebElement fName;
	@FindBy(id="lname") WebElement lName;
	@FindBy() WebElement license;
	@FindBy() WebElement ssn;
	@FindBy() WebElement address;
	@FindBy() WebElement age;
	@FindBy() WebElement weight;
	@FindBy() WebElement height;
	@FindBy() WebElement city;
	@FindBy() WebElement state;
	@FindBy() WebElement zipcode;
	
	@FindBy(id="proinfo") WebElement providerInfo;
	@FindBy(id="Insinfo") WebElement insuranceInfo;
	
	@FindBy(id="Ebtn") WebElement editBtn;
	@FindBy() WebElement viewHistoryBtn;
	@FindBy() WebElement viewReportsBtn;
	@FindBy(id="Sbtn") WebElement saveBtn;
	
	public String getProfilePatientName(){
		
		String nameFirst= fName.getAttribute("value");
		String nameLast = lName.getAttribute("value");
		String name = nameFirst +" "+nameLast;
		return name;	
	}
	
	public void editProfile(){
		
		editBtn.click();
		providerInfo.clear();
		providerInfo.sendKeys("Kaiser");
		insuranceInfo.clear();
		insuranceInfo.sendKeys("KP");
		saveBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
