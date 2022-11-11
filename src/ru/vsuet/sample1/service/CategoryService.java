package ru.vsuet.sample1.service;

import ru.vsuet.sample1.domain.Category;
import ru.vsuet.sample1.repository.InMemoryCategoryRepository;
import ru.vsuet.sample1.repository.Repository;

import java.util.List;

public class CategoryService implements Service<Category> {

    private Repository<Category> repository
            = new InMemoryCategoryRepository();

    @Override
    public Category getById(Long id) {
        return repository.find(id);
    }

    @Override
    public List<Category> getAll() {
        return repository.list();
    }
}
