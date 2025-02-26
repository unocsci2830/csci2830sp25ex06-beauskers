package pizza;

import pizza.crust.PizzaCrust;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza implements MenuItem{
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private PizzaTopping[] toppings;
    private ArrayList<MenuItem> selectionList;

    public Pizza(PizzaCrust crust, PizzaSauce sauce, PizzaTopping[] toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        this.selectionList = new ArrayList<MenuItem>();
    }

    @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
//        totalPrice += this.crust.getPrice();
//        totalPrice += this.sauce.getPrice();
//        for (pizza.topping.PizzaTopping t : this.toppings) {
//            totalPrice += t.getPrice();
//        }
//        return totalPrice;

        this.selectionList.add(this.crust);
        this.selectionList.add(this.sauce);
        this.selectionList.addAll(Arrays.asList(this.toppings));

        for (MenuItem m : this.selectionList) {
            totalPrice += m.getPrice();
        }

        return totalPrice;
    }

    public void printPizza() {
        System.out.println(crust.toNiceString());
        System.out.println(sauce.toNiceString());
        for (PizzaTopping topping : toppings) {
            System.out.println(topping.toNiceString());
        }
        System.out.println("$" + getPrice());
        System.out.println(crust.checkIntegrity());


    }
}