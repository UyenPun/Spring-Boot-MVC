package com.company.controller;

import com.company.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/")
  public String getHomePage(Model model) {
    String test = this.userService.handleHello();
    model.addAttribute("message", test);
    model.addAttribute("message2", "Welcome to from Controller!");
    return "hello";
  }

}
