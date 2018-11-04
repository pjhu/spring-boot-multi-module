package com.tw.pjhu.projecttwo.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/project/two")
    public String hello() {
        return "project two";
    }
}
