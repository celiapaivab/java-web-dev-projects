package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private LocalDate date;

    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.date = LocalDate.now();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public LocalDate getDate() {

        return date;
    }

    boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = getDate().until(today, ChronoUnit.DAYS);
        return daysBetween < 180;
    }

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" + description + "\n" + "$" + price;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        MenuItem item = (MenuItem) toBeCompared;
        return this.name.equals(item.getName());
    }

}
