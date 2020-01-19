package valnec.calendar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {

    @GetMapping(value = "/")
    public String hello(){
        return "Hello";
    }
}
