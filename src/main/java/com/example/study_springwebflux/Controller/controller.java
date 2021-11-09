package com.example.study_springwebflux.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Log4j2
public class controller {

  @GetMapping("/webFlux") public String webFlux() {return "Hello WebFlux!!";}

  @GetMapping("/webFlux/mono") public Mono webFluxMono() {
    return Mono.just("Hello Mono!!!");
  }

  @GetMapping("/webFlux/flux") public Flux webFluxFlux() { return Flux.just( "Hello Flux!!!", "Hello Reactor 3!!!", "Hello Reactive Streams!!!"); }
}
