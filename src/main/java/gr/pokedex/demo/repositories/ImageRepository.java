package gr.pokedex.demo.repositories;

import gr.pokedex.demo.entities.PokemonImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<PokemonImage,Long> {
    public PokemonImage findByName(String name);
}
