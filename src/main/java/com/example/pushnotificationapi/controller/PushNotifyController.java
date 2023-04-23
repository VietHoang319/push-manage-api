package com.example.pushnotificationapi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/push-notify")
public class PushNotifyController {
    @GetMapping("/public-key")
    public String getPublicKey() {
        String s = "a";
        return s;
    }
}
