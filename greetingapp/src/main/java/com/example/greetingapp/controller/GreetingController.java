package com.example.greetingapp.controller;

import com.example.greetingapp.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String showGreeting(Model model) {
        Greeting greeting = new Greeting("Chào mừng bạn!", LocalDateTime.now());
        model.addAttribute("greeting", greeting);
        return "greeting"; // Tên view (greeting.html)
    }
}