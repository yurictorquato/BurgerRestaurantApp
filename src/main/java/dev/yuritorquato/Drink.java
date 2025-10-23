package dev.yuritorquato;

public class Drink {

    private DrinkType type;
    private String size;
    private double price;

    public Drink(DrinkType type, String size) {
        this.type = type;
        this.size = size;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        return switch (size) {
            case "Small" -> type.getBasePrice() - 0.49;
            case "Large" -> type.getBasePrice() + 0.99;
            default -> type.getBasePrice();
        };
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type=" + type +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
