package com.alexjoiner.assignment10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DayResponse {

    @JsonProperty
    private List<Meal> meals;
    @JsonProperty
    private Nutrients nutrients;

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Nutrients getNutrients() {
        return nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
        this.nutrients = nutrients;
    }

    @Override
    public String toString() {
        return "DayResponse{" +
                "meals=" + meals +
                ", nutrients=" + nutrients +
                '}';
    }
}
