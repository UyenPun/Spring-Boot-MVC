package com.company.controller;

import com.company.domain.User;
import com.company.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

  @RequestMapping("/admin/user")
  public String getUserPage(Model model) {
    String test = this.userService.handleHello();
    model.addAttribute("newUser", new User());
    return "admin/user/create"; // link file jsp
  }

  // @ModelAttribute được sử dụng để ràng buộc các tham số HTTP (thông qua form
  // hoặc request) vào một đối tượng, sau đó đối tượng này có thể được truy cập và
  // xử lý trong controller.

  // @ModelAttribute("newUser") được sử dụng để lấy thông tin từ request (như form
  // nhập liệu) và gán nó vào một đối tượng (newUser trong trường hợp này).
  @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
  public String createUserPage(Model model, @ModelAttribute("newUser") User newUser) { //
    System.out.println("run here" + newUser);
    return "hello";
  }

}
