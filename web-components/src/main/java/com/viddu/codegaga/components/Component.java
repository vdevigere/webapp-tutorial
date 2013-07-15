package com.viddu.codegaga.components;

import java.util.Map;

public interface Component {

    public String getViewName(String region);

    public Map<String, Object> getModelMap();
}
