package dev.yuritorquato;

public class Burger {

    private BurgerType type;
    private double price;

    public Burger(BurgerType type) {
        this.type = type;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        return type.getPrice();
    }
}
