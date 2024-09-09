package com.company.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

  // Truy cập: http://localhost:8080/
  @GetMapping("/")
  public String index() {
    return "Hello World from Spring Boot!";
  }

  // http://localhost:8080/user
  @GetMapping("/user")
  public String userPage() {
    return "Only user can access this page !";
  }

  // http://localhost:8080/admin
  @GetMapping("/admin")
  public String adminPage() {
    return "Only admin can access this page !";
  }
}
