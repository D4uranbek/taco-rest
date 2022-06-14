package uz.d4uranbek.resttaco.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.List;

/**
 * @author D4uranbek
 * @since 14.06.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@RestResource( rel = "tacos", path = "tacos" )
@Table( name = "tacos" )
public class Taco {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
//    @Column( name = "id", unique = true, nullable = false )
    private Long id;

    private String name;

    @ManyToMany
    private List<Ingredient> ingredients;


}
