package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("Junior");
        student.setReceipt("07.09.2023");
        student.setCreated(new Date());
        System.out.println(student.getFullName() + " has a group: " + student.getGroup() + ", receipt date: " + student.getReceipt());
    }
}



