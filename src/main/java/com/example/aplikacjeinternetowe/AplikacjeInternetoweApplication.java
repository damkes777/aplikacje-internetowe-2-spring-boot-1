package com.example.aplikacjeinternetowe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AplikacjeInternetoweApplication {

    public static void main(String[] args) {
        SpringApplication.run(AplikacjeInternetoweApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
