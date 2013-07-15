package com.viddu.codegaga.components;

import java.util.Set;

public interface ComponentRegistry {
    public abstract Set<Component> getComponentsByRegion(String region);
}
