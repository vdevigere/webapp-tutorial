package com.viddu.codegaga.component;

import java.util.Set;

public interface ComponentRegistry {
    public abstract Set<Component> getComponentsByRegion(String region);
}
