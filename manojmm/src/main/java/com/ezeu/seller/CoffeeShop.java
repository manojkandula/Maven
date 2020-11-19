package com.ezeu.seller;

import java.util.ArrayList;

import com.ezeu.utils.InvalidCoffeeOrQuantityException;
import com.ezeu.utils.InvalidToppingOrQuantityException;

public class CoffeeShop {

    //Implementing CoffeeShop as a Singleton object

    private static CoffeeShop instance = new CoffeeShop();

    private ArrayList<Coffee> coffee;

    private ArrayList<Topping> topping;

    private CoffeeShop() {

        this.coffee = new ArrayList<Coffee>();

        this.topping = new ArrayList<Topping>();

        this.coffee.add(new Coffee("Expresso" , 20 , 5));

        this.topping.add(new Topping("Chocolate" , 10 ,8));
    }

    public static CoffeeShop getInstance() {

        return instance;
    }

    public void addCoffee(Coffee c) {
        coffee.add(c);
    }

    public void addTopping(Topping t) {
        topping.add(t);
    }

    protected void deleteCoffee(int index) {
        coffee.remove(index);
    }

    protected void deleteTopping(int index) {
        topping.remove(index);
    }

    public Coffee getCoffee(int index , int qty) {

        if((index >= 0 && index < coffee.size()) && coffee.get(index).getQuantity() > qty) {

            Coffee cof= coffee.get(index);

            cof.setQuantity(cof.getQuantity() - qty);

            return new Coffee(cof);
        }

        else
            throw new InvalidCoffeeOrQuantityException("coffee number or quantity is invalid" + index);
    }

    public Topping getTopping(int index , int qty) {

        if(index >= 0 && index < topping.size()) {

            Topping top= topping.get(index);

            top.setQuantity(top.getQuantity() - qty);

            return new Topping(top);
        }

        else
            throw new InvalidToppingOrQuantityException("topping number or quantity is invalid" + index);
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("coffees are \n");
        StringBuilder sb1 = new StringBuilder("toppings are \n");
        for(int i = 0 ; i < coffee.size(); i++) {

            sb.append(i).append(")").append(coffee.get(i)).append("\n");
        }

        for(int i = 0 ; i < topping.size(); i++) {

            sb1.append(i).append(")").append(topping.get(i)).append("\n");
        }
        String result = sb.toString();
        String result1 = sb1.toString();
        result += "\n";
        result1 += "\n";

        return result +" \n" + result1;


    }
}
