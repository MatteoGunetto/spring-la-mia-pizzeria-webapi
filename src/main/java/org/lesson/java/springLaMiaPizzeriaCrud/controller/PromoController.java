package org.lesson.java.springLaMiaPizzeriaCrud.controller;


import java.util.List;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.Promo;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.PizzaService;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class PromoController {

    @Autowired
    private PromoService promoService;
    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/promo/{pizza}")
    public String createPromo(Model model, @PathVariable("pizza") int id) {
        Pizze pizza = pizzaService.findById(id);
        Promo promo = new Promo();

        model.addAttribute("promo", promo);
        model.addAttribute("pizza",pizza);

        return "promo_create";
    }

    @PostMapping("/promo/{pizza}")
    public String storePromo(Model model, @PathVariable("pizza") int id, @Valid @ModelAttribute Promo promo, BindingResult bindingResult) {
        Pizze pizza = pizzaService.findById(id);
        promo.setPizza(pizza);
        promoService.save(promo);

        return "redirect:/" + id;
    }

    @PostMapping("/promo/delete/{promo_id}")
    public String deletePromo(Model model, @PathVariable("promo_id") int id) {
        Promo promo = promoService.findById(id);
        Pizze pizza = promo.getPizza();
        promoService.deletePromo(promo);

        return "redirect:/" + pizza.getId();
    }

    @GetMapping("/promo/edit/{id}")
    public String editPromo(Model model, @PathVariable int id) {
        Promo promo = promoService.findById(id);

        model.addAttribute("promo", promo);

        return "promo_create";
    }

    @PostMapping("/promo/edit/{id}")
    public String updatePromo(@PathVariable int id, @Valid @ModelAttribute Promo promo, BindingResult bindingResult) {
        Promo chosenPromo = promoService.findById(id);
        Pizze pizza = chosenPromo.getPizza();

        promo.setPizza(pizza);

        promoService.save(promo);

        return "redirect:/" + pizza.getId();
    }
}