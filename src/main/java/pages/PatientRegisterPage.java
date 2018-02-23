package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatientRegisterPage {
	WebDriver driver;
	
	public PatientRegisterPage(WebDriver driver){
		this.driver = driver;
	}
		
	@FindBy(name="fname")WebElement fsname1;
	@FindBy(id="lastname") WebElement lname1;
	@FindBy(id="datepicker") WebElement dob1;
	
	@FindBy(name="license") WebElement lic1;
	@FindBy(name="ssn")WebElement ssn1;
	
	@FindBy(id="state") WebElement state1;
	@FindBy(name="city") WebElement city1;
	@FindBy(name="address") WebElement add1;
	@FindBy(id="zipcode")WebElement zip1;
	
	@FindBy(name="age") WebElement age1;
	@FindBy(name="height") WebElement ht1;
	@FindBy(id="weight") WebElement wt1;
	
	@FindBy(id="pharmacy") WebElement pharm1;
	@FindBy(id="pharma_adress") WebElement pharmAdd1;
	
	@FindBy(name="email") WebElement email1;
	@FindBy(id="password") WebElement pw1;
	@FindBy(id="username") WebElement uname1;
	@FindBy(id="confirmpassword") WebElement cfmpw1;
	
	@FindBy(id="security") WebElement qn1;
	@FindBy(name="answer") WebElement ans1;
	
	@FindBy(name="register") WebElement btnSave;
	
	public void patientRegisteration(String fsname2, String lname2, String dob2, String lic2, String ssn2, String state2, String city2,
			String add2, String zip2, String age2, String ht2, String wt2,String pharm2, String pharmAdd2, String email2, String pw2, String uname2, 
			String cfmpw2, String qn2, String ans2){
		
		fsname1.clear();
		fsname1.sendKeys(fsname2);
		
		lname1.clear();
		lname1.sendKeys(lname2);
		
		dob1.clear();
		dob1.sendKeys(dob2);
		
		lic1.clear();
		lic1.sendKeys(lic2);
		
		ssn1.clear();
		ssn1.sendKeys(ssn2);
		
		state1.clear();
		state1.sendKeys(state2);
		
		city1.clear();
		city1.sendKeys(city2);
		
		add1.clear();
		add1.sendKeys(add2);
		
		zip1.clear();
		zip1.sendKeys(zip2);
		
		age1.clear();
		age1.sendKeys(age2);
		
		ht1.clear();
		ht1.sendKeys(ht2);
		
		wt1.clear();
		wt1.sendKeys(wt2);
		
		pharm1.clear();
		pharm1.sendKeys(pharm2);
		
		pharmAdd1.clear();
		pharmAdd1.sendKeys(pharmAdd2);
		
		email1.clear();
		email1.sendKeys(email2);
		
		pw1.clear();
		pw1.sendKeys(pw2);
		
		uname1.clear();
		uname1.sendKeys(uname2);
		
		cfmpw1.clear();
		cfmpw1.sendKeys(cfmpw2);
		
		//Select selectqn = new Select(qn1);
		//if 
		qn1.clear();
		qn1.sendKeys(qn2);
		
		ans1.clear();
		ans1.sendKeys(ans2);
		
		btnSave.click();
			
	}
	

}
