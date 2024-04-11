package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {

        //Menu Items
        MenuItem item1 = new MenuItem("Sizzling Steak Fajitas", "Tender strips of steak with grilled onions and peppers, served with warm tortillas.", 14.99, "Main Course");
        MenuItem item2 = new MenuItem("Crispy Calamari", "Tender calamari rings lightly battered and fried to perfection, served with marinara sauce.", 10.99, "Appetizer");
        MenuItem item3 = new MenuItem("Grilled Salmon Fillet", "Fresh Atlantic salmon fillet seasoned and grilled, served with steamed vegetables.", 18.99, "Main Course");
        MenuItem item4 = new MenuItem("Molten Lava Nachos", "Layers of crispy tortilla chips topped with melted cheese, jalapenos, salsa, and guacamole.", 12.49, "Appetizer");
        MenuItem item5 = new MenuItem("Chicken Alfredo Pasta", "Grilled chicken breast served over fettuccine pasta tossed in creamy Alfredo sauce.", 15.99, "Main Course");
        MenuItem item6 = new MenuItem("Triple Chocolate Mousse", "Layers of dark, milk, and white chocolate mousse topped with whipped cream and chocolate shavings.", 7.99, "Dessert");

        System.out.println(item1.isNew());
        System.out.println(item1);

        //MENU
        Menu menu = new Menu();

        //Adding item to Menu
        menu.addItems(item1);
        menu.addItems(item2);
        menu.addItems(item3);
        menu.addItems(item4);
        menu.addItems(item5);
        menu.addItems(item6);

        System.out.println(menu);

        //Removing item to Menu
        menu.removeItems(item5);

        System.out.println(menu);

        //Testing equals
        System.out.println(item1.equals(item2));

        MenuItem item7 = new MenuItem("Sizzling Steak Fajitas", "Tender strips of steak with grilled onions and peppers, served with warm tortillas.", 14.99, "Main Course");
        System.out.println(item1.equals(item7));

        //Duplicate item
        menu.addItems(item7);
        System.out.println(menu);

        menu.addItems(item1);
        System.out.println(menu);


    }
}
