package com.example.study_springwebflux.RouteFunction.EchoHendler;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class EchoHandler {
  public Mono<ServerResponse> echo(ServerRequest request) {
    return ServerResponse.ok().body(request.bodyToMono(String.class), String.class);
  }
}
