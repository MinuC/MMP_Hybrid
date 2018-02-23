package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver, String ssName){
		TakesScreenshot tsh = (TakesScreenshot)driver;
		
		File src = tsh.getScreenshotAs(OutputType.FILE);
		//String destination = "./Screenshots/"+ssName+System.currentTimeMillis()+".png";
		String destination = "C:\\Minu\\Training\\H2k\\Sudheer\\Assignments\\Java\\MMP_Hybrid\\Screenshots\\"+
																		ssName+System.currentTimeMillis()+".png";
		try {
			FileUtils.copyFile(src, new File(destination));
		} catch (IOException e) {
			
			System.out.println("Failed to capture screenshot" + e.getMessage());
		}
		return destination;	
	}
	
	public static void SendEmail() throws EmailException{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("seljava17@gmail.com", "selenium"));
		email.setSSLOnConnect(true);
		email.setFrom("minu@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail regarding selenium framework...");
		email.addTo("minucharles@gmail.com");
		email.send();
			
	}

}
