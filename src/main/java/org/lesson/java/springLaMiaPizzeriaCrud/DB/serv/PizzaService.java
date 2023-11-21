package org.lesson.java.springLaMiaPizzeriaCrud.DB.serv;

import java.util.List;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.repo.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepo pizzaRepo;

    public void save(Pizze pizza) {
        pizzaRepo.save(pizza);
    }

    public List<Pizze> findAll(){
        return pizzaRepo.findAll();
    }

    public Pizze findById(int id) {
        return pizzaRepo.findById(id).get();
    }

    public List<Pizze> findByName(String name){
        return pizzaRepo.findByNameContaining(name);
    }
    public void deletePizza(Pizze pizza) {
        pizzaRepo.delete(pizza);
    }
}