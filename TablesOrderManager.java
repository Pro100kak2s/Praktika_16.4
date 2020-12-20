package com.company;



import java.util.Arrays;

public class TablesOrderManager {
    public static void main(String[] args){
        Item dish1=new Dish(1000,"Рыба","Фарель");
        Item dish2=new Dish(450,"Рыба","Треска");
        Item dish3=new Dish(1000,"Рыба","Фарель");
        Item drink1=new Drink(200,"коктейль","молочный");
        Item drink2=new Drink(500,"коктейль","клубничный");
        InternetOrder order = new InternetOrder();
        order.addItem(dish1);
        order.addItem(dish2);
        order.addItem(dish3);
        order.addItem(drink1);
        order.addItem(drink2);
        order.deleteAll("Фарель");
        System.out.println(Arrays.toString(order.getArrayOfItemsName()));
        System.out.println(Arrays.toString(order.sortedOrderByCost()));
        System.out.println(Arrays.toString(order.getArray()));
    }
}
