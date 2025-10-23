package professor.solution;

public class Main {

    public static void main(String[] args) {

//        var coke = new Item("drink", "coke", 1.75);
//
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        var avocado = new Item("topping", "avocado", 1);
//
//        avocado.printItem();

        var burger = new Burger("regular", 5);

        burger.addToppings("BACON", "HAM", "MAYO");
        burger.printItem();
    }
}
