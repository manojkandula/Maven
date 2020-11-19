package com.ezeu.seller;

import static java.lang.System.exit;

import java.util.Scanner;

import com.ezeu.buyer.Customer;

public class Main {

    public static void main(String[] args) {

        int n;

        System.out.println("Welcome to the coffee shop .............");

        do {

            System.out.println("Owner -- 1 \t\t\t\t  Customer -- 2");

            n = new Scanner(System.in).nextInt();

            if (n == 1) {
                Owner owner = Owner.getInstance();
                owner.displayOwnerOptions();
                ownerfeaures(owner);
            }
            else if (n == 2) {
                Customer customer = new Customer();
                customer.getCoffeeFromCoffeeShop();
            }
            else
                break;
        }while (true);
    }

    public static void ownerfeaures(Owner owner) {
        int choice;
        do {
            System.out.println("enter ur choice");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    owner.addCoffeeToCoffeeShop();
                    break;
                }
                case 2: {
                    owner.deleteCoffeeFromCoffeeShop();
                    break;
                }

                case 3 : {
                    owner.addToppingToCoffeeShop();
                    break;
                }

                case 4 : {
                    owner.deleteToppingFromCoffeeShop();
                    break;
                }
                case 5: {
                    owner.displayCoffeeShop();
                    break;
                }
                case 6: {
                    System.out.println("exiting..");
                    exit(0);
                    break;
                }
                default:
                    System.out.println("enter proper choice:");
                    break;

            }
        } while (choice<6);
    }
}



