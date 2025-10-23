package dev.yuritorquato;

public enum DrinkType {

    SODA("Coke", 3.99),
    JUICE("Orange Juice", 4.49),
    MILKSHAKE("Ovaltine Milkshake", 6.99);

    private final String name;
    private final double basePrice;

    DrinkType(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
