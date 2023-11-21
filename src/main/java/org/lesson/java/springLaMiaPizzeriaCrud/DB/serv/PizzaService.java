package org.lesson.java.springLaMiaPizzeriaCrud.DB.serv;

import java.util.List;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepo pizzaRepo;

    public Pizze save(Pizze pizza) {
        return pizzaRepo.save(pizza);
    }

    public List<Pizze> findAll(){
        return pizzaRepo.findAll();
    }

    public Optional<Pizze> findById(int id) {
        return pizzaRepo.findById(id);
    }

    public List<Pizze> findByName(String name){
        return pizzaRepo.findByNameContaining(name);
    }
    public void deletePizza(Pizze pizza) {
        pizzaRepo.delete(pizza);
    }
}