package com.company.design.decorator;

public class Audi implements ICar{
    private int price;

    public Audi(int cost){
        this.price = cost;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("audi의 가격은 "+this.price +"원");
    }
}
