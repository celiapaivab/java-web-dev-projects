package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private final ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastDate;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}
