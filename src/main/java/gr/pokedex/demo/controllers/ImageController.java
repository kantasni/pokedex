package gr.pokedex.demo.controllers;

import gr.pokedex.demo.entities.PokemonImage;
import gr.pokedex.demo.repositories.ImageRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @SneakyThrows
    @PostMapping("/upload")
    public void uploadImage(@RequestBody MultipartFile file){
        PokemonImage pokemonImage = new PokemonImage();
        pokemonImage.setName("Blaziken.jpg");
        pokemonImage.setImage(file.getBytes());
        imageRepository.save(pokemonImage);

        System.out.println();
    }

    @SneakyThrows
    @PostMapping("/download")
    public PokemonImage downloadImage(){
        PokemonImage byName = imageRepository.findByName("Blaziken.jpg");

        return byName;

    }
}
