package com.example.blog.controllers;

import com.example.blog.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/contact")
    public String showContactForm() {
        return "contact";
    }

    @PostMapping("/contact")
    public String sendEmail(@RequestParam String name, @RequestParam String email, @RequestParam String message, Model model) {
        emailService.sendEmail("your-email@example.com", "New Contact Message", "From: " + name + "\nEmail: " + email + "\nMessage: " + message);
        model.addAttribute("success", "Your message has been sent!");
        return "contact";
    }
} 