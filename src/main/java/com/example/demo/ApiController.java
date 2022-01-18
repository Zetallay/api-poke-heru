package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/pokemon")
public class ApiController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/{id}")
    public PokemonModel getById(@PathVariable("id") Long id) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + id;
        PokemonModel pokemon = restTemplate.exchange(url, HttpMethod.GET, null, PokemonModel.class).getBody();

        return pokemon;

    }

    @GetMapping(path = "/name/{name}")
    public PokemonModel getByName(@PathVariable("name") String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        PokemonModel pokemon = restTemplate.exchange(url, HttpMethod.GET, null, PokemonModel.class).getBody();
        return pokemon;

    }

    @GetMapping(path = "/{name}/abilities")
    public List getAbilities(@PathVariable("name") String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        PokemonModel pokemon = restTemplate.exchange(url, HttpMethod.GET, null, PokemonModel.class).getBody();

        return pokemon.getAbilities();

    }

    @GetMapping(path = "/{name}/held-items")
    public List getHeldItems(@PathVariable("name") String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        PokemonModel pokemon = restTemplate.exchange(url, HttpMethod.GET, null, PokemonModel.class).getBody();

        return pokemon.getHeld_items();

    }

    @GetMapping(path = "/{name}/location-area-encounters")
    public String getLocationAreaEncounters(@PathVariable("name") String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        PokemonModel pokemon = restTemplate.exchange(url, HttpMethod.GET, null, PokemonModel.class).getBody();
        return pokemon.getLocation_area_encounters();
    }

    @GetMapping(path = "/{name}/base-experiences")
    public Long getBaseExperiences(@PathVariable("name") String name) {
        String url = "https://pokeapi.co/api/v2/pokemon/" + name;
        PokemonModel pokemon = restTemplate.exchange(url, HttpMethod.GET, null, PokemonModel.class).getBody();
        return pokemon.getBase_experience();
    }

}
