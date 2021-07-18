package gr.pokedex.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

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
   private String type;

    @ManyToOne
    private Pokemon pokemon;
}
