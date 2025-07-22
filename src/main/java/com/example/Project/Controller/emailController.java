package com.example.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Project.Service.emailService;

@RestController
@RequestMapping("/email")
public class emailController {

    @Autowired 
    private emailService emailService;

    @PostMapping("/send")
    public String sendEmail(
        @RequestParam String receiver, 
        @RequestParam String subject, 
        @RequestParam String body) {
        
        return emailService.sendEmail(receiver, subject, body);
    }
}
