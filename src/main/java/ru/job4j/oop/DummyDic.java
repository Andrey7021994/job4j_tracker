package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic jack = new DummyDic();
        String eng = jack.engToRus("Unknown word");
        System.out.println("Перевод: " + eng);
    }
}
