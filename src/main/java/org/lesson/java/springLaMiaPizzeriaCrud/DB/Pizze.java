package org.lesson.java.springLaMiaPizzeriaCrud.DB;

import java.util.List;
import java.util.Arrays;
import jakarta.validation.constraints.NotEmpty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToMany;
@Entity
public class Pizze {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int id;


    @NotBlank(message="Non può essere vuoto")
    private String name;

    @NotBlank(message="Non può essere vuoto")
    private String description;

    @NotEmpty(message="Non può essere vuoto")
    private String picture;

    @Positive(message="deve essere positivo")
    private float price;

    @OneToMany(mappedBy = "pizza")
    private List<Promo> promos;
    @ManyToMany
    private List<Ingredient> ingredients;

    public Pizze() {}
    public Pizze(String name, String description, String picture, float price, Ingredient... ingredients) {
        setName(name);
        setDescription(description);
        setPicture(picture);
        setPrice(price);
        setIngredients(Arrays.asList(ingredients));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public List<Promo> getPromos() {
        return promos;
    }
    public void setPromos(List<Promo> promos) {
        this.promos = promos;
    }
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean hasIngredient(Ingredient ingredient) {
        if(getIngredients() == null) return false;

        for(Ingredient tempIngredient : getIngredients()) {
            if(tempIngredient.getId() == ingredient.getId()) return true;
        }

        return false;
    }

    public void addIngredients(Ingredient... ingredients) {
        getIngredients().addAll(Arrays.asList(ingredients));
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizze)) return false;
        Pizze incomingPizza = (Pizze)obj;
        return getId() == incomingPizza.getId();
    }

    public void removeIngredients(Ingredient... ingredients) {
        getIngredients().removeAll(Arrays.asList(ingredients));
    }

}
