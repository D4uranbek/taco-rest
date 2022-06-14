package uz.d4uranbek.resttaco.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author D4uranbek
 * @since 14.06.2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name = "ingredients" )
public class Ingredient {

    @Id
    @Column( name = "id", nullable = false )
    private String id;

    private String name;

    @Enumerated( EnumType.STRING )
    private Type type;
}

