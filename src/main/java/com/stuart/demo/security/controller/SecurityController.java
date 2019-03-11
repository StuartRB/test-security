package com.stuart.demo.security.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/anon")
    public String anonController() {
        System.out.println(getPrincipal());
        return "Anon endpoint";
    }

    @GetMapping("/api")
    public String authController() {
        System.out.println(getPrincipal());
        return "Auth endpoint";
    }

    private String getPrincipal() {
        String username = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        return username;

    }
}
