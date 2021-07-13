package gr.pokedex.demo.controllers;

import java.util.List;

import gr.pokedex.demo.entities.Pokemon;
import gr.pokedex.demo.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping(value = "/uncaught")
    public List<Pokemon> getPokemons() {
        return pokemonRepository.findAllByCaught(false);
    }

    @GetMapping(value = "/create")
    public void createPokemon(@RequestBody Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }
}
