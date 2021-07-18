package gr.pokedex.demo.controllers;

import gr.pokedex.demo.entities.PokemonImage;
import gr.pokedex.demo.services.ImageService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @SneakyThrows
    @PostMapping("/upload/{pokemonName}")
    public void uploadImage(@RequestBody MultipartFile file,@PathVariable String pokemonName){
        PokemonImage pokemonImage = new PokemonImage();
        pokemonImage.setName(pokemonName+".jpg");
        pokemonImage.setImage(file.getBytes());
        imageService.pokemonSaveImage(pokemonName,pokemonImage);
    }
}
