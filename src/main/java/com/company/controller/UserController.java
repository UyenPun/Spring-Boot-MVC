package com.company.controller;

import com.company.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

  @RequestMapping("/")
  public String getHomePage() {
    return "index.html"; // http://localhost:8080/index.html
  }

}
// ----------------------------------------------------------------
// @RestController // Tự động trả về chuỗi hoặc dữ liệu thay vì view
// public class UserController {
// // DI: dependency injection
// private UserService userService;

// public UserController(UserService userService) {
// this.userService = userService;
// }

// @GetMapping("")
// public String getHomePage() {
// return this.userService.handleHello();
// }

// }
