package com.example.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.example.Project.Entity.email;
import com.example.Project.Repo.emailRepo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class emailService {

    @Autowired 
    private emailRepo emailRepo;
    
    @Autowired 
    private JavaMailSender mailSender;

    public String sendEmail(String receiver, String subject, String body) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            
            helper.setTo(receiver);
            helper.setSubject(subject);
            helper.setText(body);
            
            mailSender.send(message);

            email email = new email();
            email.setReceiver(receiver);
            email.setSubject(subject);
            email.setBody(body);
            emailRepo.save(email);

            return "Email sent successfully to " + receiver;
        } catch (MessagingException e) {
            return "Failed to send email: " + e.getMessage();
        }
    }
}
