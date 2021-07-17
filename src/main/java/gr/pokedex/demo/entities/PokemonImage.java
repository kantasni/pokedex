package gr.pokedex.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Images")
@Setter
@Getter
public class PokemonImage {

    @Id
    @GeneratedValue()
    private Long id;

    @Column
    private String name;

    @Lob
    private byte[] image;
}
