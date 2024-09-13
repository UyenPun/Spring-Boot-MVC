package com.company.service;

import org.springframework.stereotype.Service;

import com.company.domain.User;
import com.company.repository.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public String handleHello() {
    return "Hello from UserService";
  }

  public User handleSaveUser(User user) {
    User pun = this.userRepository.save(user);
    // System.out.println(pun);
    return pun;
  }
}
