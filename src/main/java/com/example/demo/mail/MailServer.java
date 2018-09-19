package com.example.demo.mail;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailServer {
	@Autowired
	private JavaMailSender mailSender;

	public void sendOrderMail(int activityId, String activityName, String startTime, String endTime, int ticketSize,
			int ticketPrice, int total) throws Exception {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom("funactivityfun@gmail.com");
		helper.setTo("eeit1020505@gmail.com");

		helper.setSubject("參加活動通知");
		String content = "<html><body><h3>新參加活動通知</h3>" + " <p>活動名稱:" + activityName + "<p>活動開始時間:" + startTime
				+ "<p>活動結束時間:" + endTime + "<p>票卷價格:" + ticketPrice + "<p>購買張數:" + ticketSize + "<p>總金額:" + total
				+ "<p><a href='http://localhost:8080/activity/" + activityId + "/detail'>點此查看活動</a>"
				+ "</body></html> ";

		helper.setText(content, true);

		mailSender.send(message);
		System.out.println("----------mailServer 發射拉-----------");
	}

	public void sendStatusMail(int activityId, String activityName, String startTime, String endTime, int ticketSize,
			int ticketPrice, int total) throws Exception {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom("funactivityfun@gmail.com");
		helper.setTo("eeit1020505@gmail.com");

		helper.setSubject("會員認證通知");
		String content = "<html><body><h3>新參加活動通知</h3>" + " <p>活動名稱:" + activityName + "<p>活動開始時間:" + startTime
				+ "<p>活動結束時間:" + endTime + "<p>票卷價格:" + ticketPrice + "<p>購買張數:" + ticketSize + "<p>總金額:" + total
				+ "<p><a href='http://localhost:8080/activity/" + activityId + "/detail'>點此查看活動</a>"
				+ "</body></html> ";

		helper.setText(content, true);

		mailSender.send(message);
		System.out.println("----------mailServer 發射拉-----------");
	}

}
