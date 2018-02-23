package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScheduleAppointmentPage {
	
	WebDriver driver;
	
	public ScheduleAppointmentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(linkText="Create new appointment") WebElement createNewApptmtBtn;
	
	
}

