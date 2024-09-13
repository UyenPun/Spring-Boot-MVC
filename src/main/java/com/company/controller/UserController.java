package com.company.controller;

import com.company.domain.User;
import com.company.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
public class UserController {

  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping("/")
  public String getHomePage(Model model) {
    List<User> arrUsers = this.userService.getAllUserByEmail("cherrydo2018@gmail.com");
    System.out.println(arrUsers);

    model.addAttribute("message", "test");
    model.addAttribute("message2", "Welcome to from Controller!");
    return "hello";
  }

  // @RequestMapping("/admin/user")
  // public String getUserPage(Model model) {
  // model.addAttribute("newUser", new User());
  // return "admin/user/create"; // link file jsp
  // }

  @RequestMapping("/admin/user")
  public String getUserPage(Model model) {
    return "admin/user/table-user";
  }

  @RequestMapping("/admin/user/create") // GET
  public String getCreateUserPage(Model model) {
    model.addAttribute("newUser", new User());
    return "admin/user/create";
  }

  @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
  public String createUserPage(Model model, @ModelAttribute("newUser") User newUser) { //
    System.out.println("run here" + newUser);
    this.userService.handleSaveUser(newUser);
    return "hello";
  }

}
