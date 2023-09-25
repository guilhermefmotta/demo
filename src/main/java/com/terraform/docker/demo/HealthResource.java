package com.terraform.docker.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "health")
public class HealthResource  {

    @GetMapping
    private String ok() {
        return "health ok";
    }
}
