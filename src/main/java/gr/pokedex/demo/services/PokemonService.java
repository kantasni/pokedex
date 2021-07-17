package gr.pokedex.demo.services;

import gr.pokedex.demo.entities.Pokemon;
import gr.pokedex.demo.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public boolean catchPokemon(String pokemonName) {
        Random rd = new Random();

        if(rd.nextBoolean()) {
            Pokemon caughtPokemon = pokemonRepository.findByName(pokemonName);
            caughtPokemon.setCaught(true);
            return pokemonRepository.save(caughtPokemon)!=null;
        }
        return false;
    }

    public List<Pokemon> fetchAllByCaught(boolean areCaught) {
        return pokemonRepository.findAllByCaught(areCaught);
    }

    public void addPokemon(Pokemon pokemon){
        pokemonRepository.save(pokemon);
    }

}
