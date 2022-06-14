package uz.d4uranbek.resttaco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.d4uranbek.resttaco.domain.Ingredient;

/**
 * @author D4uranbek
 * @since 14.06.2022
 */
@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, String> {
}
