package com.gocode.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerdemoController {

    @GetMapping("testAPI")
    public String test() {
        return "Hello Docker";
    }
}
