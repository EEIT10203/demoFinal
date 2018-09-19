package com.example.demo.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailServer {
	@Autowired
	private JavaMailSender mailSender;

	public void sendSimpleMail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		String Subject = "";

		message.setFrom("funactivityfun@gmail.com");
		message.setTo("eeit1020505@gmail.com");

		message.setSubject("測試主題");
		message.setText("測試內文");

		mailSender.send(message);
		System.out.println("----------mailServer 發射拉-----------");
	}

}
