package com.viddu.codegaga;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.viddu.codegaga.components.Component;
import com.viddu.codegaga.components.MenuComponent;
import com.viddu.codegaga.components.ProductComponent;

public class ComponentRegistry {
    private static Map<REGION, Set<Component>> componentMap = new HashMap<REGION, Set<Component>>();

    //TODO: This should be read from a property file or some form of registry.
    static {
        Set<Component> leftSet = new LinkedHashSet<Component>();
        leftSet.add(new MenuComponent());
        componentMap.put(REGION.LEFT, leftSet);

        Set<Component> mainSet = new LinkedHashSet<Component>();
        mainSet.add(new ProductComponent());
        componentMap.put(REGION.MAIN, mainSet);

    }

    public static Set<Component> getComponentsByRegion(REGION region) {
        return componentMap.get(region);
    }

    public static Map<REGION, Set<Component>> getComponentMapByRegionSet(EnumSet<REGION> availableRegions) {
        Map<REGION, Set<Component>> regionalComponentMap = new HashMap<REGION, Set<Component>>();
        for (REGION region : availableRegions) {
            regionalComponentMap.put(region, ComponentRegistry.getComponentsByRegion(region));
        }
        return regionalComponentMap;
    }

}
