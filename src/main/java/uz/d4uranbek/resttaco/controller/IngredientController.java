package uz.d4uranbek.resttaco.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uz.d4uranbek.resttaco.domain.Ingredient;
import uz.d4uranbek.resttaco.repository.IngredientRepository;

@RestController
@RequiredArgsConstructor
@RequestMapping( path = "/api/ingredients", produces = "application/json" )
@CrossOrigin( origins = "http://localhost:8080" )
public class IngredientController {

    private final IngredientRepository repo;

    @GetMapping
    public Iterable<Ingredient> allIngredients() {
        return repo.findAll();
    }

    @PostMapping
    @ResponseStatus( HttpStatus.CREATED )
    public Ingredient saveIngredient( @RequestBody Ingredient ingredient ) {
        return repo.save( ingredient );
    }

    @DeleteMapping( "/{id}" )
    @ResponseStatus( HttpStatus.NO_CONTENT )
    public void deleteIngredient( @PathVariable( "id" ) String ingredientId ) {
        repo.deleteById( ingredientId );
    }

}
