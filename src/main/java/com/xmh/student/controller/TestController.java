package com.xmh.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{id}")
    public String testSelect(@PathVariable("id") String id) {
        if ("1".equals(id)) {
            return "yes";
        } else {
            return "no";
        }
    }
}
