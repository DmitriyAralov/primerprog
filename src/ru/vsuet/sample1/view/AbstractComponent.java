package ru.vsuet.sample1.view;

import ru.vsuet.sample1.service.Service;

public abstract class AbstractComponent<T> implements Component {

    protected ComponentType type;
    protected final Service<T> service;

    public AbstractComponent(ComponentType type, Service<T> service) {
        this.type = type;
        this.service = service;
    }

    public ComponentType getType() {
        return type;
    }
}
