package gr.pokedex.demo.repositories;

import java.util.List;

import gr.pokedex.demo.entities.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    public Pokemon findByCaught(boolean caught);

    public List<Pokemon> findAllByCaught(boolean caught);

    public Pokemon findByName(String name);
}
