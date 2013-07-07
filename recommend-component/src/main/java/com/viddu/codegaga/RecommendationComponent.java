package com.viddu.codegaga;

import java.util.Map;

import com.viddu.codegaga.component.Component;

public class RecommendationComponent implements Component {

    public String getViewName(String region) {
        return "recommend";
    }

    public Map<String, Object> getModelMap() {
        return null;
    }

}
