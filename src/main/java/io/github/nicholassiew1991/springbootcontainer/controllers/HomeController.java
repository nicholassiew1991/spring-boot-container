package io.github.nicholassiew1991.springbootcontainer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HomeController {

  @GetMapping("/")
  public ResponseEntity<?> index() {
    return ResponseEntity.ok(
      Map.of("message", "Hello World!")
    );
  }
}
