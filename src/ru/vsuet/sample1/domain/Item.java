package ru.vsuet.sample1.domain;

import java.time.LocalDate;

public class Item {

    private Long id;
    private String name;
    private LocalDate createdAt;

    public Item(Long id, String name) {
        this.id = id;
        this.name = name;
        this.createdAt = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
