package com.tw.pjhu.projectone.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/project/one")
    public String hello() {
        return "project one";
    }
}
