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
}
