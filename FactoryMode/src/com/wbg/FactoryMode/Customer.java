package com.wbg.FactoryMode;

public class Customer {
    public static void main(String[] args) {
        AbstractFoodFactory abstractFoodFactory1 = new hodelFoodFactory();
        abstractFoodFactory1.createDrinks().prices();
        abstractFoodFactory1.createPowder().desc();


        AbstractFoodFactory abstractFoodFactory2 = new LsflmFoodFactory();
        abstractFoodFactory2.createDrinks().prices();
        abstractFoodFactory2.createPowder().desc();
    }
}
