package dev.yuritorquato;

public enum BurgerType {

    MEAT("Meat", 4.99),
    CHICKEN("Chicken", 3.99),
    FISH("Fish", 5.49);

    private final String name;
    private final double price;

    BurgerType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
