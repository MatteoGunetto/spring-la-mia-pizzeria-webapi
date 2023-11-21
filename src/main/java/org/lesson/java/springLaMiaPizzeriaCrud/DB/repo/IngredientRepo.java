package org.lesson.java.springLaMiaPizzeriaCrud.DB.repo;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepo extends JpaRepository<Ingredient, Integer> {

}



