package com.i2i.academy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to i2i Academy!";
    }
}
