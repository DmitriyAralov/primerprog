package ru.vsuet.sample1.view;

import ru.vsuet.sample1.service.Service;

public class ObjectsListComponent<T> extends AbstractComponent<T> {

    public ObjectsListComponent(Service<T> service) {
        super(ComponentType.LIST, service);
    }

    @Override
    public void draw() {
        System.out.println("Objects list:");
        service.getAll().forEach(System.out::println);
    }
}
