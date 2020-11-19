package com.ezeu.seller;

public class Topping {

    private String toppingName;

    private int price;

    private int quantity;

    public Topping(String toppingName , int price ,int quantity) {

        this.toppingName = toppingName;
        this.price = price;
        this.setQuantity(quantity);

    }

    public Topping(Topping t){

        super();

        this.toppingName=t.toppingName;
        this.price=t.price;
        this.quantity=0;

    }

    public String getToppingName() {

        return toppingName;
    }

    public void setToppingName(String toppingName) {

        this.toppingName = toppingName;

    }

    public void setPrice(int price) {

        this.price = price;

    }

    public int getPrice() {

        return price;
    }


    @Override

    public String toString() {

        return "ToppingName = "+toppingName+" "+"price = "+" "+price+"$"+" "+"quantity :"+" "+quantity;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }
}
