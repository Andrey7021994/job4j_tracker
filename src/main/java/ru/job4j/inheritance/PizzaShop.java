package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Just tasty pizza");
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese("ExtraCheese");
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato("Just tasty pizza" + "ExtraCheese" + "ExtraTomato");
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}