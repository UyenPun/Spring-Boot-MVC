package com.company.service;

import org.springframework.stereotype.Service;

import com.company.domain.User;
import com.company.repository.UserRepository;
import java.util.List;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getAllUser() {
    return this.userRepository.findAll();
  }

  public List<User> getAllUserByEmail(String email) {
    return this.userRepository.findByEmail(email);
  }

  public String handleHello() {
    return "Hello Server";
  }

  public User handleSaveUser(User user) {
    User pun = this.userRepository.save(user);
    // System.out.println(pun);
    return pun;
  }

  public User getByUserId(long id) {
    return this.userRepository.findById(id);
  }

  // Delete User
  public void deleteByUser(long id) {
    this.userRepository.deleteById(id);
  }
}
