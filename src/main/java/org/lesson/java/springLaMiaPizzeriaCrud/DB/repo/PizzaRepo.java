package org.lesson.java.springLaMiaPizzeriaCrud.DB.repo;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PizzaRepo extends JpaRepository<Pizze, Integer> {
    public List<Pizze> findByName(String name);
    public List<Pizze> findByNameContaining(String name);
}