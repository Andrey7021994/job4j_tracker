package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String rus = eng + "-" + " Привет";
        return rus;
    }

    public static void main(String[] args) {
        DummyDic jack = new DummyDic();
        String eng = jack.engToRus("Hello");
        System.out.println("Перевод: " + eng);
    }
}
