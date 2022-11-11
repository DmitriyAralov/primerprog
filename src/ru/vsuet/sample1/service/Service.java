package ru.vsuet.sample1.service;

import java.util.List;

public interface Service<T> {

    T getById(Long id);

    List<T> getAll();
}
