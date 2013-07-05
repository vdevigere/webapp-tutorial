package com.viddu.codegaga;

import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.viddu.codegaga.components.Component;

public class RegionRenderer {
    public ModelMap renderRegions(EnumSet<REGION> regionSet) {
        ModelMap modelMap = new ModelMap();
        for (REGION region : regionSet) {
            Set<Component> regionComponents = ComponentRegistry.getComponentsByRegion(region);
            if (regionComponents != null) {
                Set<String> componentViewSet = new LinkedHashSet<String>();
                for (Component component : regionComponents) {
                    ModelAndView componentMV = component.render();
                    modelMap.addAllAttributes(componentMV.getModelMap());
                    componentViewSet.add(componentMV.getViewName());
                }
                modelMap.addAttribute(region.toString(), componentViewSet);
            }
        }
        return modelMap;
    }
}
