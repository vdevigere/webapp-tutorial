package com.viddu.codegaga.controllers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.viddu.codegaga.component.ComponentController;
import com.viddu.codegaga.component.RegionRenderer;

@Controller
@RequestMapping("/tiles")
public class TilesController extends ComponentController {

    @Inject
    RegionRenderer regionRenderer;

    @RequestMapping("/greet")
    public ModelAndView displayGreeting() {
        ModelAndView mv = new ModelAndView(getControllerDefinition());

        Map<String, Object> mm = regionRenderer.renderRegions(getAvailableRegions());
        mv.addAllObjects(mm);
        return mv;
    }

    @Override
    public String getControllerDefinition() {
        return "base-template";
    }

    @Override
    public Set<String> getAvailableRegions() {
        return new LinkedHashSet<String>(Arrays.asList("HEADER", "LEFT", "RIGHT", "MAIN", "FOOTER"));
    }
}
