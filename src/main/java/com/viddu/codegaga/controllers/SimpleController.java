package com.viddu.codegaga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/simple")
public class SimpleController {

    @RequestMapping("/greet")
    @ResponseBody
    public String displayGreeting() {
        return "Hello World!!";
    }
}
