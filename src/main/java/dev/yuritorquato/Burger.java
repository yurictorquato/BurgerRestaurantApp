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

    public BurgerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.getName() + " costs: " + "R$%.2f".formatted(type.getPrice());
    }
}
