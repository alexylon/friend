package com.wildbeancoffee.friends.controllers;

import com.wildbeancoffee.friends.service.FriendService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    FriendService friendService;

    @RequestMapping("/home")
    public String welcome(Model model) {
        model.addAttribute("data", "Welcome");
        return "home";
    }
}