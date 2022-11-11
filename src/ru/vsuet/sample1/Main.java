package ru.vsuet.sample1;

import ru.vsuet.sample1.domain.Category;
import ru.vsuet.sample1.service.CategoryService;
import ru.vsuet.sample1.service.Service;
import ru.vsuet.sample1.view.Component;
import ru.vsuet.sample1.view.ComponentFabric;
import ru.vsuet.sample1.view.MenuComponent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service<Category> service = new CategoryService();
        ComponentFabric fabric = new ComponentFabric();
        System.out.println("------- 0 - menu -----------");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int command = scanner.nextInt();
            Component component = fabric.build(command, service);
            if (component == null) {
                return;
            }
            component.draw();
        }
    }
}