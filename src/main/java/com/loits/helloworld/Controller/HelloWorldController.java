package com.loits.helloworld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello-world/welcome")
    public String helloWorld() {
        return "Welcome to LOIT";
    }
}
