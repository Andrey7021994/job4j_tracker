package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array; // В методе to(int[] array) необходимо изменить способ присваивания
        // значения массиву this.array. Вместо array = array нужно использовать this.array = array,
        // чтобы корректно присвоить переданный массив array полю this.array класса Reduce.
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}