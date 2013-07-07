package com.viddu.codegaga.controllers;

import java.util.EnumSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.viddu.codegaga.models.ProductInfo;
import com.viddu.codegaga.models.SizeEnum;

@Controller
@RequestMapping("/simple")
public class SimpleController {

    @RequestMapping("/greet")
    public ModelAndView displayGreeting() {
        ModelAndView mv = new ModelAndView("simple-greeting");
        ProductInfo productInfo = new ProductInfo("Blue Shirt", 1L);
        EnumSet<SizeEnum> options = EnumSet.allOf(SizeEnum.class);
        productInfo.setOptions(options);
        mv.addObject(productInfo);
        return mv;
    }
}
