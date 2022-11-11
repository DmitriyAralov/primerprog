package ru.vsuet.sample1.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private Long id;
    private String name;
    private List<Item> items;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
        this.items = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
