package com.example.web.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class Controller {

  @GetMapping("/web")
  public String Web() {
    for (int i = 0; i < 3; i++) {
      log.info("web");
    }
    return "Hello Web!!";
  }
}
