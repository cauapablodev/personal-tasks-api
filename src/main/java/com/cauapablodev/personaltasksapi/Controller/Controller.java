package com.cauapablodev.personaltasksapi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
