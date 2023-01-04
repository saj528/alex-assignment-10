package com.alexjoiner.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meal {

    @JsonProperty
    private Integer id;
    @JsonProperty
    private String imageType;
    @JsonProperty
    private String title;
    @JsonProperty
    private Integer readyInMinutes;
    @JsonProperty
    private Integer servings;
    @JsonProperty
    private String sourceUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(Integer readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", imageType='" + imageType + '\'' +
                ", title='" + title + '\'' +
                ", readyInMinutes=" + readyInMinutes +
                ", servings=" + servings +
                ", sourceUrl='" + sourceUrl + '\'' +
                '}';
    }
}
