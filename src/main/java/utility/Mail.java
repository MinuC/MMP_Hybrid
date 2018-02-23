package utility;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Mail {
	
	public static void SendEmail() throws EmailException{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("seljava17@gmail.com", "selenium"));
		email.setSSLOnConnect(true);
		email.setFrom("minu@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail to learn selenium fw ... :-)");
		email.addTo("minucharles@gmail.com");
		email.send();
			
	}

}
