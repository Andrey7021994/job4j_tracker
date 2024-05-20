package ru.job4j.cast;

import ru.job4j.polymorphism.Transport;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{airplane, train, bus};
        for (Vehicle object : vehicles) {
            object.move();
        }
    }
}