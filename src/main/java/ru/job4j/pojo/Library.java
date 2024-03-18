package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Triumphal Arch", 250);
        Book book2 = new Book("Clean code", 380);
        Book book3 = new Book("War and Peace", 1500);
        Book book4 = new Book("Martin Eden", 480);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getQuantity());
        }

        System.out.println("change Triumphal Arch and Martin Eden ");
        books[0] = book4;
        books[3] = book1;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getQuantity());
        }
        System.out.println("Shown only book.name Clean code");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getQuantity());
            }
        }
    }
}