package com.viddu.codegaga;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.viddu.codegaga.components.Component;

public class RegionRenderer {
    public Map<String, Object> renderRegions(Set<String> regionSet) {
        Map<String, Object> modelMap = new LinkedHashMap<String, Object>();
        for (String region : regionSet) {
            Set<Component> regionComponents = ComponentRegistry.getComponentsByRegion(region);
            if (regionComponents != null) {
                Set<String> componentViewSet = new LinkedHashSet<String>();
                for (Component component : regionComponents) {
                    modelMap.putAll(component.getModelMap());
                    componentViewSet.add(component.getViewName(region));
                }
                modelMap.put(region.toString(), componentViewSet);
            }
        }
        return modelMap;
    }
}
