package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        if (key == null) {
            throw new ElementNotFoundException("key could not be null");
        }
            for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
            String[] fruits = {"apple", "banana", "orange"};
        try {
            indexOf(fruits, "kiwi");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}