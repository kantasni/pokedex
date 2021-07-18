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

    @Column
    String type;

    @ManyToOne
    private Pokemon pokemon;
}
