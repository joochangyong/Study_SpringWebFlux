package com.example.study_springwebflux.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

  @GetMapping("/hello")
  public String Hello() {
    return "Hello WebFlux!!";
  }
}
