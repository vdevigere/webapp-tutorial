package com.viddu.codegaga.component;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

public class RegionRenderer {

    private final ComponentRegistry componentRegistry;

    @Inject
    RegionRenderer(ComponentRegistry componentRegistry) {
        this.componentRegistry = componentRegistry;
    }

    public Map<String, Object> renderRegions(Set<String> regionSet) {
        Map<String, Object> modelMap = new LinkedHashMap<String, Object>();
        for (String region : regionSet) {
            Set<Component> regionComponents = componentRegistry.getComponentsByRegion(region);
            if (regionComponents != null) {
                Set<String> componentViewSet = new LinkedHashSet<String>();
                for (Component component : regionComponents) {
                    if (component.getModelMap() != null) {
                        modelMap.putAll(component.getModelMap());
                    }

                    if (component.getViewName(region) != null) {
                        componentViewSet.add(component.getViewName(region));
                    }
                }
                modelMap.put(region.toString(), componentViewSet);
            }
        }
        return modelMap;
    }
}
