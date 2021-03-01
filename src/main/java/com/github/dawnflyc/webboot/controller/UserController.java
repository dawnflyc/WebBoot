package com.github.dawnflyc.webboot.controller;

import com.github.dawnflyc.webboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password) {
        Optional<String> optUsername = Optional.of(username);
        Optional<String> optPassword = Optional.of(password);
        String result = null;
        optUsername.ifPresent(un -> optPassword.ifPresent(pw -> {

            //(User.builder().id(null).username(un).password(pw).build());
        }));
        return result;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(String username, String password) {
        return "";
    }
}
