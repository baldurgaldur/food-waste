package com.rocket.rest;

public class MealDTO{

    private final long id;
    private final String description;

    public MealDTO(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
