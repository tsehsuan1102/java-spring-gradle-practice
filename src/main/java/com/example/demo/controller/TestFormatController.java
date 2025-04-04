package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFormatController {
  @GetMapping("/test")
  public String test() {
    String message = "This is a test";
    return message;
  }
}
