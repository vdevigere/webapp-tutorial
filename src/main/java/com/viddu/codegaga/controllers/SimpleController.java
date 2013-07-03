package com.viddu.codegaga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/simple")
public class SimpleController {

    @RequestMapping("/greet")
    public ModelAndView displayGreeting() {
        ModelAndView mv = new ModelAndView("simple-greeting");
        mv.addObject("greeting", "Hello World!!");
        return mv;
    }
}
