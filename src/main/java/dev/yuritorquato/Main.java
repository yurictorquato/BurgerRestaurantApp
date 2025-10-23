package dev.yuritorquato;

public class Main {

    public static void main(String[] args) {

        Burger meatBurger = new Burger(BurgerType.MEAT);
        Drink coke = new Drink(DrinkType.SODA, "Large");
        SideItem fries = new SideItem(SideType.FRIES, "Medium");

        MealOrder mealOrder = new MealOrder(meatBurger, coke, fries);
    }
}
