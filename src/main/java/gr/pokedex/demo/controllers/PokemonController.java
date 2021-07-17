package gr.pokedex.demo.controllers;

import java.util.List;

import gr.pokedex.demo.entities.Pokemon;
import gr.pokedex.demo.repositories.PokemonRepository;
import gr.pokedex.demo.services.PokemonService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class PokemonController {

    @Autowired
    private PokemonService pokeservice;

    @GetMapping(value = "/uncaught")
    public List<Pokemon> getPokemons() {
        return pokeservice.fetchAllByCaught(false);
    }

    @PostMapping(value = "/create")
    public void createPokemon(@RequestBody Pokemon pokemon) {
        pokeservice.addPokemon(pokemon);
    }

    @PostMapping(value = "/catch")
    public PokemonBooleanResponse catchPokemon(@RequestBody Pokemon pokemon) {return new PokemonBooleanResponse(pokeservice.catchReleasePokemon(pokemon.getName(), true));}

    @GetMapping(value = "/caught")
    public  List<Pokemon> getCaught() {
        return pokeservice.fetchAllByCaught(true);
    }

    @PostMapping(value = "/release")
    public PokemonBooleanResponse releasePokemon(@RequestBody Pokemon pokemon) {return  new PokemonBooleanResponse(pokeservice.catchReleasePokemon(pokemon.getName(), false));}


    @AllArgsConstructor
    @Setter
    @Getter
    public static class PokemonBooleanResponse{
        private boolean response;
    }
}
