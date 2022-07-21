package com.arshaa.controller;

import java.io.IOException;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.arshaa.common.OnboardingConfirmation;
import com.arshaa.entity.PaymentRemainder;
import com.arshaa.service.EmailSender;

@RestController
@RequestMapping("/mail")
public class EmailSenderController {

	@Autowired
	EmailSender emailSender;
	@Autowired
	@Lazy
	private RestTemplate template;

	

// Test Email
	@PostMapping(value = "/postmail")
	public String send() throws AddressException, MessagingException, IOException {
		emailSender.postMail();

		return "Email Sent Successfully";
	}
//Payment Remainder Email for due Amount	
	@PostMapping("/sendPaymentRemainder")
	public ResponseEntity sendPaymentRemainder(@RequestBody PaymentRemainder sendPayRem)throws AddressException, MessagingException, IOException
	{
		 return emailSender.sendRemainder(sendPayRem.getEmail(),sendPayRem.getName(), sendPayRem.getDueAmount());
	}
	@PostMapping("/sendOnboardingConfirmation")
	public ResponseEntity sendOnboardingConfirmation(@RequestBody OnboardingConfirmation onBoard)
	{
		return emailSender.OnboardingConfirmation(onBoard.getEmail(), onBoard.getName(), onBoard.getAmountPaid(), onBoard.getBedId(), onBoard.getBuildingName());
	}
}