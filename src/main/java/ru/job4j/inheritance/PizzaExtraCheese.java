package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String EXTRA_CHEESE = "Extra Cheese";

    public PizzaExtraCheese(String name) {
        super(name);
    }

    @Override
    public String name() {
        return "Just tasty pizza + " + EXTRA_CHEESE;
    }
}
