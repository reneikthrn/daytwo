package com.groundgurus.day2;

/**
 *
 * @author penguin
 */
public class ShopMain {
    public static void main(String[] args) {
        Shop wineShop = new WineShop("Juan's Wine Shop", 
                new String[] {"Wine 1", "Wine 2", "Wine 3"}, 
                "123ABC, 1st Street, Mandaluyong", 5, false);
        wineShop.printDetails();
        
        System.out.println();
        
        Shop cakeShop = new Shop();
        cakeShop.setName("Maria's Wine Shop");
        cakeShop.setItems(new String[] {"Cake 1", "Cake 2", "Cake 3"});
        cakeShop.setAddress("789XYZ, 2nd Street, Makati City");
        cakeShop.setNumberOfEmployees(10);
        cakeShop.printDetails();
    }
}
