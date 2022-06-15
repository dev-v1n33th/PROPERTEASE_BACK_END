package com.arshaa.service;

import java.util.Date;
import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.arshaa.model.Response;
import com.ctc.wstx.api.EmptyElementHandler.HtmlEmptyElementHandler;

@Service
public class EmailSender {
	@Autowired(required = true)
	private JavaMailSender mailSender;// public void sendEmail(int id,String userName,String email,String
										// password,String employeeId)
// {
//
//
//
// SimpleMailMessage msg = new SimpleMailMessage();
//
// msg.setTo(email);
// msg.setSubject("You are onboarded successfully to the SRI LAKSHMI HEAVEN'S PG");
// msg.setText("Hello "+userName+","+" Welcome to SRI LAKSHMI HEAVEN'S PG." +"\n"+"\n"+ "You are checked in to the PG successfully with the below details :"+"\n"+"\n"+
// "Employee Id: "+employeeId+"\n"+"\n");
//
// mailSender.send(msg);
//
//
//   
//
// }

	public void postMail() {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("muralikrishna.miriyala@arshaa.com");
		mail.setSubject("This is the test email");
		mail.setText("This is the message from spring boot");
		mailSender.send(mail);
	}

	public void sendEmail(String Name, String userName, String email, String password, String employeeId) {
		// TODO Auto-generated method stub
				SimpleMailMessage msg = new SimpleMailMessage();
				msg.setTo(email);
				msg.setSubject("Welcome Onboard");
				

				msg.setText("Hello " + Name + "," + "\n"+ "Welcome to Arshaa Technologies." + "\n" + "\n"
						+ "Please login with your username and password as we mentioned here, These are your credentials  UserName: "+userName+" Password: "+password + "\n" + "\n" + "Employee Id: "
						+ employeeId + "\n" + "Link to login: http://65.1.40.113"+ "\n"+
						"Kindly fill your details in Employee Profile, It doesn't take much time to fill the details please complete it by End of the Day" +"\n"+"\n"+" Note: After login, you need reset your password" +"\n"+"\n"+"Regards,"+"\n"+"Team Hr"+"\n"+"Arshaa Technologies PvtLtd");
				
				
				mailSender.send(msg);
				
			}
	
	
	public ResponseEntity sendRemainder(String email,String Name,double dueAmount) {
		// TODO Auto-generated method stub
		Response response=new Response();
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(email);
			msg.setSubject("Sree Lakshmi Heavens: Payment Reminder");
			

			msg.setText("Hi " + Name + "," + "\n"+ "\n"+"I hope you're well. This is just to remind you that payment of Due Amount: " +dueAmount +"."+"\n" +
			"I'm sure you're busy, but I'd appreciate if you could take a moment and clear the due as soon as possible." +"\n"+"\n"+"Please let me know if you have any questions" +"\n"+"\n"+"Regards,"+"\n"+"Manager"+"\n"+"Sree Lakshmi Heavens");
		
			
			mailSender.send(msg);
			response.setMessage("email sent successfully");
			response.setStatus(true);
            return new ResponseEntity(response,HttpStatus.OK);
		}
		catch(Exception e)
		{
			response.setMessage("something went wrong");
			response.setStatus(false);
            return new ResponseEntity(e.getMessage(),HttpStatus.OK);
		}
								
			}

	
//	public void sentEmail(String Name,  String email) {
//		// TODO Auto-generated method stub
//				SimpleMailMessage msg = new SimpleMailMessage();
//				msg.setTo(email);
//				msg.setSubject("Congratulations");
//				
//
//				msg.setText("Hello " + Name + "," + " Welcome to Arshaa Technologies." + "\n" + "\n"
//						+ "Please login with your username and password as we mentioned here, These are your credentials  UserName: "+userName+" Password: "+password + "\n" + "\n" + "Employee Id: "
//						+ employeeId + "\n" + "Link to login: http://65.1.40.113"+ "\n"+
//						"Kindly fill your details in Employee Profile, It does't take much time to fill the details complete it by End of the Day" +"\n"+"\n"+" Note: After login, You need reset your password" +"\n"+"\n"+"Regards,"+"\n"+"Team Hr"+"\n"+"Arshaa Technologies PvtLtd");
//				
//				
//				mailSender.send(msg);
//				
//			}
}
