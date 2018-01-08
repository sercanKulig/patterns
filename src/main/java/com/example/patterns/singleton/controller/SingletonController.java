package com.example.patterns.singleton.controller;

import com.example.patterns.singleton.entry.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingletonController {

    @GetMapping("/hello")
    public void message() {
        User user1 = User.getInstance();
        user1.setId(1);
        user1.setName("name");
        user1.showMessage();
        User user2 = User.getInstance();
        user2.showMessage();

    }
}
