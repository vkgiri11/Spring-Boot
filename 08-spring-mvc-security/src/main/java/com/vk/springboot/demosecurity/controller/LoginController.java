package com.vk.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/showLoginPage")
    public String showLogin() {
        return "fancy-login";
    }

    @GetMapping("/custom-access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }
}
