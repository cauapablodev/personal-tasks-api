package com.cauapablodev.personaltasksapi.Task;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TaskController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
