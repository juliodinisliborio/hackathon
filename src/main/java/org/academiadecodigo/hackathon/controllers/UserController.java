package org.academiadecodigo.hackathon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by codecadet on 14/12/2018.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping
    public String homeWtv(Model model){
        model.addAttribute("wtv", "stuff");
        return "home";
    }
}
