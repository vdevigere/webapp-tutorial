package com.viddu.codegaga.models;

import java.util.Set;

public class ProductInfo {
    private Long webId;
    private String title;
    private String description;
    private Set<?> options;

    public ProductInfo(String title, Long webId) {
        this.webId = webId;
        this.title = title;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<?> getOptions() {
        return options;
    }

    public void setOptions(Set<?> options) {
        this.options = options;
    }
}
