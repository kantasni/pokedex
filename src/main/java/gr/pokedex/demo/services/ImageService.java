package gr.pokedex.demo.services;


import gr.pokedex.demo.entities.Pokemon;
import gr.pokedex.demo.entities.PokemonImage;
import gr.pokedex.demo.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired PokemonRepository pokemonRepository;

    public void pokemonSaveImage(String pokemonName, PokemonImage image){
        Pokemon pokemon = pokemonRepository.findByName(pokemonName);
        pokemon.setImage(image);
        pokemonRepository.save(pokemon);

    }
}
