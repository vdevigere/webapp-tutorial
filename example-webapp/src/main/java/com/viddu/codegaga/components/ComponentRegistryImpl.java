package com.viddu.codegaga.components;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.viddu.codegaga.RecommendationComponent;
import com.viddu.codegaga.component.Component;
import com.viddu.codegaga.component.ComponentRegistry;

public class ComponentRegistryImpl implements ComponentRegistry {
    private Map<String, Set<Component>> componentMap = new HashMap<String, Set<Component>>();

    public ComponentRegistryImpl() {
        Set<Component> leftSet = new LinkedHashSet<Component>();
        leftSet.add(new MenuComponent());
        componentMap.put("LEFT", leftSet);

        Set<Component> mainSet = new LinkedHashSet<Component>();
        mainSet.add(new ProductComponent());
        componentMap.put("MAIN", mainSet);


        Set<Component> footerSet = new LinkedHashSet<Component>();
        footerSet.add(new ProductComponent());
        componentMap.put("FOOTER", footerSet);        

        Set<Component> rightSet = new LinkedHashSet<Component>();
        rightSet.add(new RecommendationComponent());
        componentMap.put("FOOTER", rightSet);        
}
    
    public Set<Component> getComponentsByRegion(String region) {
        return componentMap.get(region);
    }
}
