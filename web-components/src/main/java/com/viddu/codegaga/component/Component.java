package com.viddu.codegaga.component;

import java.util.Map;

public interface Component {

    public String getViewName(String region);

    public Map<String, Object> getModelMap();
}
