package ru.vsuet.sample1.repository;

import ru.vsuet.sample1.domain.Category;
import ru.vsuet.sample1.domain.Item;

import java.util.ArrayList;
import java.util.List;

class Storage {

    private static Storage instance;

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    List<Category> categories;

    private Storage() {
        this.categories = new ArrayList<>();
        init();
    }

    private void init() {
        Category category1 = new Category(1L, "Category 1");
        Item item1 = new Item(1L, "Item 1");
        category1.addItem(item1);

        Category category2 = new Category(2L, "Category 2");

        categories.add(category1);
        categories.add(category2);
    }
}
