package pizza;

import java.util.Scanner;

import pizza.crust.*;
import pizza.topping.*;
import pizza.sauce.*;

public class PizzaMain {
    public static void main(String[] args) {
        System.out.println("What kind of crust would you like:");
        System.out.println("1 - pizza.crust.Thick crust");
        System.out.println("2 - pizza.crust.Thin crust");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice: ");
        int crustChoice = scanner.nextInt();
        PizzaCrust crust;
        if (crustChoice == 1) {
            Thick ThickCrust = new Thick();
            System.out.println("Would you like your crust to be deep dish:");
            System.out.println("1 - Yes");
            System.out.println("2 - No");
            int isDeepDish = scanner.nextInt();
            ThickCrust.setIsDeepDish(isDeepDish);
            crust = ThickCrust;
        } else {
            crust = new Thin();
        }

        System.out.println("What ingredient of crust would you like:");
        System.out.println("1 - Flour");
        System.out.println("2 - Cauliflower");
        System.out.println("Your choice: ");
        int crustIngredient = scanner.nextInt();
        crust.setIngredient(crustIngredient);

        System.out.println("What kind of sauce would you like:");
        System.out.println("1 - pizza.sauce.Tomato");
        System.out.println("2 - pizza.sauce.Alfredo");
        System.out.println("Your choice: ");
        int sauceChoice = scanner.nextInt();
        PizzaSauce sauce;
        if (sauceChoice == 1) {
            sauce = new Tomato();
        } else {
            sauce = new Alfredo();
        }

        System.out.println("How many toppings?");
        int toppingCount = scanner.nextInt();
        System.out.println("1 - pizza.topping.Sausage");
        System.out.println("2 - pizza.topping.Pepperoni");
        System.out.println("3 - pizza.topping.Ham");
        System.out.println("4 - pizza.topping.Bacon");
        System.out.println("5 - pizza.topping.Olives");
        System.out.println("6 - pizza.topping.Pepper");
        System.out.println("7 - pizza.topping.Jalapeno");
        System.out.println("8 - pizza.topping.Mushroom");
        System.out.println("9 - pizza.topping.Mozzarella");
        System.out.println("10 - pizza.topping.Cheddar");
        System.out.println("11 - pizza.topping.Provolone");
        System.out.println("12 - pizza.topping.Ricotta");
        System.out.println("Your choices (pick _ toppings): ");
        PizzaTopping[] toppings = new PizzaTopping[toppingCount];
        for (int i = 0; i < toppingCount; i++) {
            int topping = scanner.nextInt();
            switch (topping) {
                case 1:
                    toppings[i] = new Sausage();
                    break;
                case 2:
                    toppings[i] = new Pepperoni();
                    break;
                case 3:
                    toppings[i] = new Ham();
                    break;
                case 4:
                    toppings[i] = new Bacon();
                    break;
                case 5:
                    toppings[i] = new Olives();
                    break;
                case 6:
                    toppings[i] = new Pepper();
                    break;
                case 7:
                    toppings[i] = new Jalapeno();
                    break;
                case 8:
                    toppings[i] = new Mushroom();
                    break;
                case 9:
                    toppings[i] = new Mozzarella();
                    break;
                case 10:
                    toppings[i] = new Cheddar();
                    break;
                case 11:
                    toppings[i] = new Provolone();
                    break;
                case 12:
                    toppings[i] = new Ricotta();
                    break;
            }
        }
        Pizza pizza = new Pizza(crust, sauce, toppings);
        pizza.printPizza();
    }
}