package com.example.demo;

import java.util.List;

public class PokemonModel {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Object> abilities) {
        this.abilities = abilities;
    }

    public List<Object> getHeld_items() {
        return held_items;
    }

    public void setHeld_items(List<Object> held_items) {
        this.held_items = held_items;
    }

    public Long getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(Long base_experience) {
        this.base_experience = base_experience;
    }

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    private Long id;
    private String name;
    private List<Object> abilities;
    private List<Object> held_items;
    private Long base_experience;
    private String location_area_encounters;

}
