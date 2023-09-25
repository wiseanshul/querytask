package com.example.task24092023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class controller {
    @Autowired
    services services;
    @GetMapping("/test")
    public void callQuery()
    {
        services.testrun(171, LocalDate.of(2023,9,24));
    }
}
