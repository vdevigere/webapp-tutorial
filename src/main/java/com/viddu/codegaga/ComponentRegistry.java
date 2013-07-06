package com.viddu.codegaga;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.viddu.codegaga.components.Component;
import com.viddu.codegaga.components.MenuComponent;
import com.viddu.codegaga.components.ProductComponent;

public class ComponentRegistry {
    private static Map<String, Set<Component>> componentMap = new HashMap<String, Set<Component>>();

    //TODO: This should be read from a property file or some form of registry.
    static {
        Set<Component> leftSet = new LinkedHashSet<Component>();
        leftSet.add(new MenuComponent());
        componentMap.put("LEFT", leftSet);

        Set<Component> mainSet = new LinkedHashSet<Component>();
        mainSet.add(new ProductComponent());
        componentMap.put("MAIN", mainSet);


        Set<Component> rightSet = new LinkedHashSet<Component>();
        rightSet.add(new ProductComponent());
        componentMap.put("RIGHT", rightSet);
}

    public static Set<Component> getComponentsByRegion(String region) {
        return componentMap.get(region);
    }

    public static Map<String, Set<Component>> getComponentMapByRegionSet(Set<String> availableRegions) {
        Map<String, Set<Component>> regionalComponentMap = new HashMap<String, Set<Component>>();
        for (String region : availableRegions) {
            regionalComponentMap.put(region, ComponentRegistry.getComponentsByRegion(region));
        }
        return regionalComponentMap;
    }

}
