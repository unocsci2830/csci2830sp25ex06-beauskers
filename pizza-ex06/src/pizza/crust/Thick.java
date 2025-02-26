package pizza.crust;

public class Thick extends PizzaCrust {
    private boolean isDeepDish;

    @Override
    public String toString() {
        return "pizza.crust.Thick";
    }

    @Override
    public String toNiceString() {
        return super.toNiceString() + (this.isDeepDish? " (Deep Dish)" : "");
    }

    public void setIsDeepDish(int choice) {
        if (choice == 1) {
            this.isDeepDish = true;
        }
        else {
            this.isDeepDish = false;
        }
    }
}
