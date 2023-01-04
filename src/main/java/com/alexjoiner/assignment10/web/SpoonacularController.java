package com.alexjoiner.assignment10.web;

import com.alexjoiner.assignment10.dto.DayResponse;
import com.alexjoiner.assignment10.dto.Week;
import com.alexjoiner.assignment10.dto.WeekResponse;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class SpoonacularController {


    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {

        return (ResponseEntity<WeekResponse>) getMealsEntity(WeekResponse.class, "week", numCalories, diet, exclusions);
    }

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
        return (ResponseEntity<DayResponse>) getMealsEntity(DayResponse.class, "day", numCalories, diet, exclusions);
    }

    public ResponseEntity<?> getMealsEntity(Class<?> responseClass, String time, @RequestParam(name = "targetCalories") String numCalories, @RequestParam(name = "diet") String diet, @RequestParam(name = "exclude")  String exclusions) {


        URI uri = UriComponentsBuilder
                .fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("timeFrame", time)
                .queryParam("apiKey", "5741f7f419cf43bebe35ca38e5a43c7e")
                .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
                .queryParamIfPresent("diet", Optional.ofNullable(diet))
                .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
                .build()
                .toUri();
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<?> response = restTemplate.getForEntity(uri, responseClass);
        return response;
    }

}
