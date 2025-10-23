package dev.yuritorquato;

public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder(Burger burger) {
        this(burger, null, null);
    }

    public MealOrder(Burger burger, Drink drink) {
        this(burger, drink, null);
    }

    public MealOrder(Burger burger, SideItem sideItem) {
        this(burger, null, sideItem);
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    private double calculateTotalPrice() {
        double total = 0;

        total += burger.getType().getPrice() + drink.getPrice() + sideItem.getPrice();

        return total;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }

    @Override
    public String toString() {
        return "-".repeat(70) +
                "\nPedido: " +
                "\nBurger: " + burger +
                "\nDrink: " + drink +
                "\nSide Item: " + sideItem +
                "\nPreço Total: R$%.2f".formatted(calculateTotalPrice()) +
                "\n" +
                "-".repeat(70);
    }
}
