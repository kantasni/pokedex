package gr.pokedex.demo.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Pokemons")
@Setter
@Getter
public class Pokemon {

    @Id
    @GeneratedValue()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long id;

    @Column
    private String name;


    @Column
    private String type;

    @Column
    private boolean caught;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Move> moves;

    @OneToOne(cascade = CascadeType.ALL)
    private PokemonImage image;
}
