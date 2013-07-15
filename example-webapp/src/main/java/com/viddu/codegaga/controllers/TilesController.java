package com.viddu.codegaga.controllers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import scala.concurrent.Future;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import com.viddu.codegaga.components.ComponentController;
import com.viddu.codegaga.components.RegionRenderer;

@Controller
@RequestMapping("/tiles")
public class TilesController extends ComponentController {

    @Inject
    RegionRenderer regionRenderer;

    @RequestMapping("/greet")
    public DeferredResult<ModelAndView> displayGreeting() {
        DeferredWebResult deferredResult = new DeferredWebResult(getViewName());
        Future<Map<String, Object>> mmFuture = regionRenderer.renderRegionsAsync(getAvailableRegions());
        deferredResult.completeWith(mmFuture);
        return deferredResult;
    }

    @Override
    public String getViewName() {
        return "base-template";
    }

    @Override
    public Set<String> getAvailableRegions() {
        return new LinkedHashSet<String>(Arrays.asList("HEADER", "LEFT", "RIGHT", "MAIN", "FOOTER"));
    }
}
