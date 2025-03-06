package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Arrays;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String showBlog(Model model) {
        List<String> posts = Arrays.asList("First Post", "Second Post", "Third Post");
        model.addAttribute("posts", posts);
        return "blog";
    }
}