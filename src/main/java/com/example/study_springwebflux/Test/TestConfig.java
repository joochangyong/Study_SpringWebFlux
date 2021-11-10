package com.example.study_springwebflux.Test;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static reactor.core.publisher.MonoExtensionsKt.toMono;

@Configuration
@EnableWebFlux
@Log4j2
public class TestConfig {
  @Bean
  public RouterFunction route001() {
    return RouterFunctions
            .route(
                    GET("/webflux02"),
                    req -> ok().body(fromObject("Hello WebFlux"))
            );
  }

  /**
   * 경로 변수(Path Variable) 이용
   * */
//  @Bean
//  public RouterFunction route002() {
//    return RouterFunctions.route(
//            GET("/webflux02/hello/{name}"),
//            req -> ok().body(fromObject("Hello " + req.pathVariable("name")))
//    );
//  }

  /**
   * 질의 문자열(Query String) 이용
   * */
//  @Bean
//  public RouterFunction route003() {
//    return RouterFunctions.route(
//            GET("/webflux02/query"),
//            req -> ok() .body(
//                            fromObject(
//                                    String.format(
//                                            "name: %s, age: %s",
//                                            req.queryParam("name").orElse("무명"),
//                                            req.queryParam("age").orElse("미상")
//                                    )
//                            )
//                    )
//    );
//  }

  /**
   * JSON 정보 이용
   * */
//  @Bean
//  RouterFunction route004() {
//    return RouterFunctions.route(
//            POST("/webflux02/json"),
//            req -> req.body(toMono(User.class))
//                    .doOnNext(user -> log.info(user.toString()))
//                    .then(ok().build())
//    );
//  }

  /**
   * RouteFunction Chaining, Route 를 총괄하는 함수
   * */
//  @Bean
//  RouterFunction route005() {
//    return RouterFunctions.route(
//                    GET("/boards"),
//                    req -> ok().body(fromObject("GET /boards")))
//            .andRoute(
//                    GET("/boards/{num}"),
//                    req -> ok().body(fromObject("GET /boards/" + req.pathVariable("num"))))
//            .andRoute(
//                    POST("/boards"),
//                    req -> req.body(toMono(Board.class))
//                            .doOnNext(board -> log.info(board.toString()))
//                            .then(ok().build()))
//            .andRoute(
//                    PUT("/boards/{num}"),
//                    req -> req.body(toMono(Board.class))
//                            .doOnNext(board -> log.info(req.pathVariable("num"), ": ", board.toString()))
//                            .then(ok().build()))
//            .andRoute(
//                    DELETE("/boards/{num}"),
//                    req -> ok().body(fromObject("DELETE /board/" + req.pathVariable("num"))));
//  }
}
