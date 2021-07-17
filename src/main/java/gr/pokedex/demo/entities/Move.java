package gr.pokedex.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Moves")
@Setter
@Getter
public class Move {

    @Id
    @GeneratedValue()
    private Long id;

    @Column
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @Size(min=1, max=1)
    private Type type;

    @ManyToOne
    private Pokemon pokemon;
}
