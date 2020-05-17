package com.company.AnimalRescue;

public class AnimalFood {
    private String name;
    private int price;
    private int quantity;
    private int stockAvailability;

    public AnimalFood() {
    }


    public String getName (){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public int getStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(int stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
