package com.example.citest.controller;

import com.example.citest.model.User;
import com.example.citest.repository.UserRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

  private final UserRepository userRepository;

  public MainController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping
  public List<User> listUsers() {
    return userRepository.findAll();
  }
}
