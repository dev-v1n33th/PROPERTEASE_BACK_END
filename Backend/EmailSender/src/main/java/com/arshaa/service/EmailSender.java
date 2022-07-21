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

import com.arshaa.model.EmailConstants;
import com.arshaa.model.EmailResponse;
import com.arshaa.model.Response;
import com.ctc.wstx.api.EmptyElementHandler.HtmlEmptyElementHandler;

@Service
public class EmailSender {
	@Autowired(required = true)
	private JavaMailSender mailSender;

	 EmailConstants eCons= new EmailConstants();

	//Test Email 
	public void postMail() {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo("muralikrishna.miriyala@arshaa.com");
		mail.setSubject("This is the test email");
		mail.setText("This is the message from spring boot");
		mailSender.send(mail);
	}


	//Payment Remainder service
	public ResponseEntity sendRemainder(String email, String Name, double dueAmount) {
		// TODO Auto-generated method stub
		EmailResponse response = new EmailResponse();
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(email);
			msg.setSubject("Sree Lakshmi Heavens: Payment Reminder");

			msg.setText("Hi " + Name + "," + "\n" + "\n"
					+ "I hope you're well. This is just to remind you that payment of Due Amount: " + dueAmount + "."
					+ "\n"
					+ "I'm sure you're busy, but I'd appreciate if you could take a moment and clear the due as soon as possible."
					+ "\n" + "\n" + "Please let me know if you have any questions" + "\n" + "\n" + "Regards," + "\n"
					+ "Manager" + "\n" + "Sree Lakshmi Heavens");
			mailSender.send(msg);
			response.setMessage("email sent successfully");
			response.setStatus(true);
			return new ResponseEntity(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setMessage("something went wrong");
			response.setStatus(false);
			return new ResponseEntity(response, HttpStatus.OK);
		}

	}

	//Onboarding confirmation email service
	public ResponseEntity OnboardingConfirmation(String email, String name, double amountPaid, String bedId,
			String buildingName) {
		// TODO Auto-generated method stub
		EmailResponse response = new EmailResponse();
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(email);
			msg.setSubject(eCons.ONBOARD_CONFIRMATION);

			msg.setText("Hi " + name + "," + "\n" + "\n"
					+ "Welcome to Sree Lakshmi Heavens, you are checked in to the PG successfully with the below details :"
					+ " buildingName : " + buildingName + ", bedId : " + bedId + ", Paid Amount : " + amountPaid + "." + "\n"
					+ "\n" + "Please let me know if you have any questions" + "\n" + "\n" + "Regards," + "\n"
					+ "Manager" + "\n" + "Sree Lakshmi Heavens");
			mailSender.send(msg);
			response.setMessage("email sent successfully");
			response.setStatus(true);
			return new ResponseEntity(response, HttpStatus.OK);
		} catch (Exception e) {
			response.setMessage("something went wrong");
			response.setStatus(false);
			return new ResponseEntity(response, HttpStatus.OK);
		}
	}

}
