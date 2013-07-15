package com.viddu.codegaga.components;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ComponentRegistryImpl implements ComponentRegistry {
    private Map<String, Set<Component>> componentMap = new HashMap<String, Set<Component>>();
    private static final Config conf = ConfigFactory.load();

    public ComponentRegistryImpl() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Map<String, List<String>> regionMap = (Map<String, List<String>>) conf.getAnyRef("region");
        for (String region : regionMap.keySet()) {
            Set<Component> regionSet = componentMap.get(region);
            if (regionSet == null) {
                regionSet = new LinkedHashSet<Component>();
                componentMap.put(region, regionSet);
            }
            Set<String> regionComponents = new LinkedHashSet<String>(regionMap.get(region));
            for (String className : regionComponents) {
                Class<? extends Component> clazz = (Class<? extends Component>) Class.forName(className);
                regionSet.add(clazz.newInstance());
            }
        }
    }

    public Set<Component> getComponentsByRegion(String region) {
        return componentMap.get(region);
    }
}
