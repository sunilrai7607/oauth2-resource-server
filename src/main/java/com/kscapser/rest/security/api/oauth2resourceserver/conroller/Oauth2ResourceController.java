package com.kscapser.rest.security.api.oauth2resourceserver.conroller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/resources", produces = MediaType.APPLICATION_JSON_VALUE)
public class Oauth2ResourceController {

    @GetMapping("/sayHello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Welcome to resource server");
    }
}
