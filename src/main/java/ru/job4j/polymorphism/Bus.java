package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет.");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println(numberOfPassengers + " пассажиров в автобусе.");
    }

    @Override
    public double fillUp(double amountOfFuel) {
        System.out.println("Заправить по цене " + amountOfFuel + " за литр.");
        return amountOfFuel;
    }
}

