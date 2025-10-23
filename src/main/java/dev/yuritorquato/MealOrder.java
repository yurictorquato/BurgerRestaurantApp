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

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public SideItem getSideItem() {
        return sideItem;
    }
}
