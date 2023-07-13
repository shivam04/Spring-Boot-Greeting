package com.example.greetingapi.hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public ResponseEntity<Object> hello() {
        return new ResponseEntity<>(HelloDTO.builder().message("Hello World!!").build(), HttpStatus.OK);
    }
}
