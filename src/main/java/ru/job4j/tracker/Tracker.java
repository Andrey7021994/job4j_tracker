package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    Item[] findByName(String key) {
        Item[] itemsByName = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                itemsByName[count++] = items[index];
            }
        }
        return Arrays.copyOf(itemsByName, count);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = false;
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            result = true;
        }
        return result;
    }

    public void delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            int start = indexOf(id) + 1;
            int distPos = indexOf(id);
            int length = size - index - 1;
            System.arraycopy(items, start, items, distPos, length);
            items[size - 1] = null;
            size--;
        }
    }
}