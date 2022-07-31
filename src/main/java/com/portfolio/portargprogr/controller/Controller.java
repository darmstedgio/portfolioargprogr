package com.portfolio.portargprogr.controller;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
   // Test api heroku
   @GetMapping("/time")
   @ResponseStatus(HttpStatus.OK)
   public String getCurrentTime() {

       return Instant.now().toString();
   }
}

