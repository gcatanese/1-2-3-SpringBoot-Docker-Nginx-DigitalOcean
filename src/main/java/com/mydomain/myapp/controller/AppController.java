package com.mydomain.myapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping
public class AppController {

    private final Logger log = LoggerFactory.getLogger(AppController.class);

    @Autowired
    private HttpServletRequest request;

    @GetMapping(value = "/test")
    ResponseEntity<?> test(HttpServletRequest request) throws Exception {
        log.info("/test");

        return ResponseEntity.ok().body("Ok");
    }

}
