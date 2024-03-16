package com.ttp.mvcframework.order;

import java.util.List;


public class Menu {

    private final List<MenuItem> menuItems;

    public Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String name) {
        //return new MenuItem("돈까스", 5000);
        return menuItems.stream()
            .filter(menuItem -> menuItem.getName().equals(name))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("해당하는 메뉴가 없습니다."));

    }


}
