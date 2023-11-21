package org.lesson.java.springLaMiaPizzeriaCrud;

import org.lesson.java.springLaMiaPizzeriaCrud.DB.Pizze;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.PizzaService;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.Ingredient;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.IngredientService;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.Role;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.RoleService;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.User;
import org.lesson.java.springLaMiaPizzeriaCrud.DB.serv.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {

	@Autowired
	private PizzaService pizzaService;

	@Autowired
	private IngredientService ingredientService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}


//	ingredient
	@Override
	public void run(String... args) throws Exception {

		Ingredient ingr1 = new Ingredient("Pomodoro", null);
		Ingredient ingr2 = new Ingredient("Mozzarella", null);
		Ingredient ingr3 = new Ingredient("Basilico", null);
		Ingredient ingr4 = new Ingredient("Olio d'oliva", null);
		Ingredient ingr5 = new Ingredient("Salame piccante", null);
		Ingredient ingr6 = new Ingredient("Frutti di mare", null);
		Ingredient ingr7 = new Ingredient("Prosciutto", null);
		Ingredient ingr8 = new Ingredient("Carciofi", null);
		Ingredient ingr9 = new Ingredient("Funghi", null);
		Ingredient ingr10 = new Ingredient("Olive", null);
		Ingredient ingr11 = new Ingredient("Uova", null);
		Ingredient ingr12 = new Ingredient("Patate", null);
		Ingredient ingr13 = new Ingredient("Rosmarino", null);

		ingredientService.save(ingr1);
		ingredientService.save(ingr2);
		ingredientService.save(ingr3);
		ingredientService.save(ingr4);
		ingredientService.save(ingr5);
		ingredientService.save(ingr6);
		ingredientService.save(ingr7);
		ingredientService.save(ingr8);
		ingredientService.save(ingr9);
		ingredientService.save(ingr10);
		ingredientService.save(ingr11);
		ingredientService.save(ingr12);
		ingredientService.save(ingr13);

//pizze

		Pizze pizza1 = new Pizze("Margherita", "La pizza Margherita è una pizza classica italiana che è composta da una base di pasta, salsa di pomodoro, mozzarella e basilico. ", "https://upload.wikimedia.org/wikipedia/commons/c/c8/Pizza_Margherita_stu_spivack.jpg", 4.99f);

		Pizze pizza2 = new Pizze("Diavola", "Pizza dal sapore intenso e piccante, con un contrasto tra la dolcezza della salsa di pomodoro e la sapidità del salamino piccante. La mozzarella filante completa il piatto, rendendolo ancora più gustoso.", "https://plus.unsplash.com/premium_photo-1668771085743-1d2d19818140?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=2787&q=80", 9.50f);

		Pizze pizza3 = new Pizze("Americana", "La pizza per i più piccoli o per chi si sente ancora giovane dentro", "https://media-cdn.tripadvisor.com/media/photo-s/0b/eb/60/38/pizza-viennese.jpg", 9.00f);

		Pizze pizza4 = new Pizze("4 stagioni", "La pizza quattro stagioni è un'ottima scelta per chi vuole assaggiare un po' di tutto. È anche una buona scelta per i bambini, che possono scegliere il proprio spicchio preferito.", "https://cdn.cook.stbm.it/thumbnails/ricette/144/144880/hd750x421.jpg", 11.00f);

		Pizze pizza5 = new Pizze("Speck&Brie", "Un sapore ricco e saporito, con un contrasto tra il sapore sapido dello speck e il sapore dolce e cremoso del brie.", "https://shop.aostapizzapazza.it/utenti/mancuso_it/cache/_pics/2/8/pizza-affumicata-1_9bfd18c14668eda8afb51dbee2ec85f5_t.jpg", 12.00f);

		Pizze pizza6 = new Pizze("Prosciutto e Funghi", "Un'accoppiata classica di prosciutto cotto e funghi freschi su una base di pomodoro e mozzarella.", "https://i1.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2019/10/4102_Pizza.jpg", 12.00f);

		Pizze pizza7 = new Pizze("Quattro Formaggi", "Una sinfonia di formaggi con mozzarella, gorgonzola, parmigiano e taleggio su una crosta croccante.", "https://i0.wp.com/www.piccolericette.net/piccolericette/wp-content/uploads/2017/06/3234_Pizza.jpg", 11.00f);

		Pizze pizza8 = new Pizze("Tonno e Cipolla", "Un mix equilibrato di sapori con pomodoro, mozzarella, tonno e cipolla dolce.", "https://www.bofrost.it/on/demandware.static/-/Sites-IT-master-catalog/default/dw8eb928da/images/15196-Pizza-Tonno-e-Cipolla-R.jpg", 9.00f);

		Pizze pizza9 = new Pizze("Pizza alla Carbonara", "Ispirata alla celebre pasta, con uova fresche, pancetta croccante, pecorino e una generosa macinata di pepe nero.", "https://blog.giallozafferano.it/adryincucina/wp-content/uploads/2021/02/pizza-carbonara-2-683x1024.jpg", 12.00f);

		Pizze pizza10 = new Pizze("Pizza ai Frutti di Mare", "Un viaggio nei sapori del mare con gamberetti succulenti, cozze, vongole e calamari su una base di pomodoro o bianca.", "https://www.unmondodisapori.it/wp-content/uploads/2017/10/pizza-frutti-di-mare.jpg", 12.00f);

		Pizze pizza11 = new Pizze("Marinara", "Un'esperienza tradizionale con la semplicità del pomodoro, aglio aromatico, origano fresco e l'olio d'oliva, tutto su una crosta sottile.", "https://www.melarossa.it/wp-content/uploads/2022/05/pizza-marinara.jpg", 12.00f);

		Pizze pizza12 = new Pizze("Pizza con Patate e Rosmarino", "Un connubio unico di sapori con mozzarella, patate sottili, rosmarino aromatico, sale e olio d'oliva.", "https://blog.giallozafferano.it/pietrozanella/wp-content/uploads/2016/01/IMG_0726.jpg", 9.00f);


		pizzaService.save(pizza1);
		pizzaService.save(pizza2);
		pizzaService.save(pizza3);
		pizzaService.save(pizza4);
		pizzaService.save(pizza5);
		pizzaService.save(pizza6);
		pizzaService.save(pizza7);
		pizzaService.save(pizza8);
		pizzaService.save(pizza9);
		pizzaService.save(pizza10);
		pizzaService.save(pizza11);
		pizzaService.save(pizza12);

//security

		Role admin = new Role("ADMIN");
		Role user = new Role("USER");

		roleService.save(admin);
		roleService.save(user);

		final String pwsAdmin = new BCryptPasswordEncoder().encode("admin");
		final String pwsUser = new BCryptPasswordEncoder().encode("user");

		User defAdmin = new User("admin", pwsAdmin, admin, user);
		User defUser = new User("user", pwsUser, user);

		userService.save(defAdmin);
		userService.save(defUser);

		System.out.println("!!--------!! Seeded the db with success !!--------!!");
	}

}