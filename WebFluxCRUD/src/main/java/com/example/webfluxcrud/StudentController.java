package com.example.webfluxcrud;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/student")
@AllArgsConstructor
@RestController
@Log4j2
public class StudentController {
  @Autowired
  private StudentRepository studentRepository;

  @GetMapping
  public Flux<Student> findAll() {
    log.info("::GET_ALL Students::");
    return studentRepository.findAll();
  }

  @GetMapping
  public Mono<Student> findById(@PathVariable("id") Long id) {
    log.info("::Will Return a Student::");
    return studentRepository.findById(id);
  }
}
