package pizza.crust;

import pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    protected String ingredient;

    public void setIngredient(int choice) {
        if (choice == 1) {
             this.ingredient = "Flour";
        } else {
            this.ingredient = "Cauliflower";
        }
    }

    public String checkIntegrity() {
        if (ingredient.equals("Cauliflower")) {
            return "WARNING: Handle the pizza carefully because the pizza might fall apart!";
        } else {
            return "";
        }
    }

    public String getIngredient() {
        return this.ingredient;
    }

    public abstract String toString();

    public String toNiceString() {
        return "Crust: " + this + " (" + this.ingredient + ")" + " $" + this.getPrice();
    }

    @Override
    public Double getPrice() {
        return 3.00;
    }
}
