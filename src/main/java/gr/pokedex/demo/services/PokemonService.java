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

    public boolean catchReleasePokemon(String pokemonName, boolean catchRelease) {

        Pokemon pokemon = pokemonRepository.findByName(pokemonName);
        pokemon.setCaught(catchRelease);
        return pokemonRepository.save(pokemon)!=null;
    }

    public List<Pokemon> fetchAllByCaught(boolean areCaught) {
        return pokemonRepository.findAllByCaught(areCaught);
    }

    public void addPokemon(Pokemon pokemon){
        pokemonRepository.save(pokemon);
    }

}
