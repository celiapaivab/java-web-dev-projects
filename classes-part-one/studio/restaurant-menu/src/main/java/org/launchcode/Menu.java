package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private final ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastDate;

    public ArrayList<MenuItem> getMenuItems() {

        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().equals("Appetizer")){
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().equals("Main Course")){
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().equals("Dessert")){
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nMENU\n" + "\nAPPETIZERS\n" + appetizers.toString() + "\n" + "MAIN COURSES\n" + mainCourses.toString() + "\n" + "DESSERTS\n" + desserts.toString() + "\n";
    }

    //ADD ITEM
    void addItems(MenuItem newItem){
        String message = "Item already in the menu.";
        if (menuItems.contains(newItem)){
            System.out.println(message);
            return;
        }
        for (MenuItem item: menuItems){
            if (item.equals(newItem)){
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastDate = LocalDate.now();
    }

    //REMOVE ITEM
    void removeItems(MenuItem removedItem){
        menuItems.remove(removedItem);
        lastDate = LocalDate.now();
    }


}
