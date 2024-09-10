package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

  @RequestMapping("/")
  @ResponseBody // Giúp Spring trả về chuỗi như là nội dung phản hồi HTTP.
  public String getHomePage() {
    return "Hello Home Page";
  }

}
