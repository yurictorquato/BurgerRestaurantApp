package dev.yuritorquato;

public enum SideType {

    FRIES("Fries", 2.99),
    ONION_RINGS("Onion Rings", 3.49),
    NUGGETS("Nuggets", 2.99);

    private final String name;
    private final double basePrice;

    SideType(String name, double basePrice) {
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
