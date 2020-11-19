package com.ezeu.seller;

public class Coffee {

    private String coffeeName;

    private int price;

    private int quantity;

    public Coffee(String coffeeName , int price , int quantity) {

        this.coffeeName = coffeeName;
        this.price = price;
        this.quantity = quantity;

    }
    public Coffee(Coffee c){

        super();
        this.coffeeName=c.coffeeName;
        this.price=c.price;
        this.quantity=0;

    }
    public String getCoffeeName() {

        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {

        this.coffeeName = coffeeName;

    }

    public void setPrice(int price) {

        this.price = price;

    }

    public int getPrice() {

        return price;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public int getQuantity() {

        return quantity;
    }

    @Override

    public String toString() {

        return "coffeeName = "+coffeeName+" "+"price = "+" "+price+"$"+" "+"quantity :"+""+quantity+"  ";
    }
}

