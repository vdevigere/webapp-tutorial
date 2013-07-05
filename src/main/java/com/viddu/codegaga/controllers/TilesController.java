package com.viddu.codegaga.controllers;

import java.util.EnumSet;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.viddu.codegaga.REGION;
import com.viddu.codegaga.RegionRenderer;

@Controller
@RequestMapping("/tiles")
public class TilesController extends ComponentContoller{
    
    @Inject
    RegionRenderer regionRenderer;
    
    @RequestMapping("/greet")
    public ModelAndView displayGreeting() {
        ModelAndView mv = new ModelAndView(getControllerDefinition());

        ModelMap mm = regionRenderer.renderRegions(getAvailableRegions());
        mv.addAllObjects(mm);
        return mv;
    }

    @Override
    public String getControllerDefinition() {
        return "base-template";
    }

    @Override
    public EnumSet<REGION> getAvailableRegions() {
        return EnumSet.allOf(REGION.class);
    }
}
