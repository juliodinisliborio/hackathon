package org.academiadecodigo.hackathon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class Login {

    @RequestMapping("")
    String login(){
        return "login";
    }

    @RequestMapping("profile")
    String profile_(){
        return "profile";
    }
}
