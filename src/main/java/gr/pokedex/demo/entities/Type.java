package gr.pokedex.demo.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "Types")
@Setter
@Getter
public class Type {

    @Id
    @GeneratedValue()
    @JsonProperty(access=JsonProperty.Access.READ_ONLY)
    private long id;

    @Column
    private String name;

    @Column
    private String majorAdv;

    @Column
    private String majorDis;
}
