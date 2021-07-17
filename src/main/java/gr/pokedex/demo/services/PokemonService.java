package gr.pokedex.demo.services;

import gr.pokedex.demo.entities.Pokemon;
import gr.pokedex.demo.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public void catchPokemon(String pokemonName) {
        Pokemon caughtPokemon = pokemonRepository.findByName(pokemonName);
        caughtPokemon.setCaught(true);

        Pokemon save = pokemonRepository.save(caughtPokemon);
    }
//    TODO: create methods for /uncaught, /create and /caught
}
