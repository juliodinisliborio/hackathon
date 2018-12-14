package org.academiadecodigo.hackathon.controllers;

import org.academiadecodigo.hackathon.command.UserDTO;
import org.academiadecodigo.hackathon.models.User;
import org.academiadecodigo.hackathon.services.mock.MockUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping
    public String homeWtv(Model model){
        model.addAttribute("wtv", "stuff");
        return "home";
    }

    private UserDTO userDTO;
    private MockUserService userService;


    //pagina login
    @RequestMapping(method = RequestMethod.GET, path = {"x"})
    public String loginPage(Model model) {

        User user1 = new User();
       User user2 = new User();

        user1.setUsername("Christina");
        user1.setPassword("pass123");
        user1.setId(1);
        user2.setId(2);
        user2.setUsername("Hinchin");
        userService.addNewUser(user2);

        userService.addNewUser(user1);

        model.addAttribute("user", new User());
        return "zz";
    }

    @RequestMapping(method = RequestMethod.POST, path = "x")
    public String kekekek(@ModelAttribute("user") User user){
        System.out.println(user.getUsername());
        if(userService.getUserbyId(user.getId()).getUsername().equals(user.getUsername())){
            return "redirect:jj";
        } else {
            return "redirect:x";
        }
    }
    @RequestMapping(method = RequestMethod.GET, path = "jj")
    public String lololol(){
        return "jj";
    }

    //pagina profile
    @RequestMapping(method = RequestMethod.GET, path = {"/user/{id}/place"})
    public String getUserProfile(Model model, @PathVariable Integer id) {
        model.addAttribute("place", userDTO.getId());
        return "user/" + id + "/place";
    }
@Autowired
    public void setUserService(MockUserService userService) {
        this.userService = userService;
    }

    //add friend

}