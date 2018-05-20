package com.css.headfirstshejimoshi.K;

/**
 * Created by 46597 on 2018/5/20.
 */
public class MenuTestDrive02 {


    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");

        MenuComponent dinnerMenu = new Menu("DINER MENU", "Lunch");

        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");

        MenuComponent dessertMenu = new Menu("DESSERT MENU" , "Dessert of course !");


        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");




        allMenus.add(pancakeHouseMenu);



        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast" , true , 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",false , 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes","Pancakes made with fresh buleberries" , true , 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles","Waffles,with you choice of blueberries or strawberries", true , 3.59));

        allMenus.add(dinnerMenu);
        dinnerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinnerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinnerMenu.add(new MenuItem("Soup of the day", "Soup of the day,with a side of potato salad", false, 3.29));
        dinnerMenu.add(new MenuItem("Hotdog", "A hot dog ,with saurkrut , relish, onions , topped with cheese", false, 3.05));
        dinnerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce , and a slice of sourdough bread",true,3.89));

        allMenus.add(cafeMenu);
        cafeMenu.add(new MenuItem("Veggie Burger and Air Friees", "Veggie burger on a whole wheat bun , lettuce , tomato, and fries",true,3.99));
        cafeMenu.add(new MenuItem("Soup of the day","A cup of the soup of the day , with a side , salad ", false , 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito , with whole pinto beans , salsa, gucamole", true, 4.29));




        allMenus.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust,topped with vanilla ice cream",true,1.59));
        dessertMenu.add(new MenuItem("Cheesecake","Creamy New Yourk cheesecake, with a chocolate gramham crust",true ,1.99));
        dessertMenu.add(new MenuItem("Sorbet","A scoop of raspberry and a scoop of lime",true,1.89));




        Waitress02 waitress = new Waitress02(allMenus);

        //waitress.printMenu();

        waitress.printVegetarianMenu();


    }





}
