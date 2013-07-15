package com.viddu.codegaga;

import java.util.Map;

import com.viddu.codegaga.components.Component;

public class RecommendationComponent implements Component {

    public String getViewName(String region) {
        return "/WEB-INF/jsp/recommend.jsp";
    }

    public Map<String, Object> getModelMap() {
        return null;
    }

}
