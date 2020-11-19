package com.ezeu.buyer;

import com.ezeu.seller.Coffee;
import com.ezeu.seller.CoffeeShop;
import com.ezeu.seller.Topping;

import java.util.Scanner;

public class Customer {

    private CoffeeShop coffeeShop;

    public Customer() {

        this.coffeeShop =CoffeeShop.getInstance();

    }

    public void getCoffeeFromCoffeeShop() {

        System.out.println(coffeeShop);

        System.out.println("Choose coffee index number and the Quantity:");

        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt() - 1;

        int qty = sc.nextInt();

        Coffee c = this.coffeeShop.getCoffee(index, qty);

        System.out.println("choose topping index number and the quantity");

        int index1 = new Scanner(System.in).nextInt() - 1;

        Topping t = this.coffeeShop.getTopping(index1 , qty);

        System.out.println("You have selected this item " + c.getCoffeeName()+" "+"with topping"+" "+t.getToppingName());

        int cost = c.getPrice() * qty + t.getPrice()*qty;

        System.out.println("pay the bill  " + cost+ "$");

        int bill = sc.nextInt();

        if (bill < cost) {

            System.out.println("you have low balance");

        } else if (bill > cost) {

            int rembal = bill - cost;

            System.out.println("take  "+  c.getCoffeeName() + "and  take change: " + rembal);

        } else {

            System.out.println("take it  " + c.getCoffeeName());

        }
    }
}

