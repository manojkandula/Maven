package com.ezeu.seller;

import java.util.Scanner;

public class Owner {

    private CoffeeShop coffeeShop;

    private Owner() {

        this.coffeeShop = coffeeShop.getInstance();
    }

    private static Owner instance = new Owner();

    public static Owner getInstance() {

        return instance;
    }

    public void displayOwnerOptions() {

        System.out.println("1.add Coffee \t  2.remove Coffee \t 3.add topping \t 4.remove topping \t 5.display coffee \t 6.exit");

    }

    public void displayCoffeeShop(){

        System.out.println(coffeeShop);

    }

    public void addCoffeeToCoffeeShop() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the coffee name you want to add");

        String cname = sc.nextLine();

        System.out.println("enter the price for that");

        int price = new Scanner(System.in).nextInt();

        System.out.println("enter quantity");

        int numOfCups = sc.nextInt();

        this.coffeeShop.addCoffee(new Coffee(cname , price , numOfCups));

        System.out.println("coffee added to coffee shop");
    }

    public void deleteCoffeeFromCoffeeShop() {

        System.out.println("enter the index you have to delete");

        int num = new Scanner(System.in).nextInt();

        this.coffeeShop.deleteCoffee(num);

        System.out.println("you deleted the coffee");
    }

    public void addToppingToCoffeeShop() {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the topping name you want to add");

        String cname = sc.nextLine();

        System.out.println("enter the price for that");

        int price = new Scanner(System.in).nextInt();

        System.out.println("enter quantity");

        int qty = new Scanner(System.in).nextInt();

        this.coffeeShop.addTopping(new Topping(cname , price , qty));

        System.out.println("topping is added to coffee shop");
    }

    public void deleteToppingFromCoffeeShop() {

        System.out.println("enter the index you have to delete");

        int num = new Scanner(System.in).nextInt();

        this.coffeeShop.deleteTopping(num);

        System.out.println("you deleted the topping");
    }

}

