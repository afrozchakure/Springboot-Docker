package com.beginsecure.hw.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hwController {

    @GetMapping("/api/hw")
    public String hwMessage() {
        return "This is a new world";
    }
}