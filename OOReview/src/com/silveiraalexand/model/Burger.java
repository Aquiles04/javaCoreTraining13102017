package com.silveiraalexand.model;

import java.util.ArrayList;

public class Burger {

    private String bread;
    private String meat;
    private Double price;
    private ArrayList<Additional> additionals;

    public Burger(Double price) {
        this.bread = "Roll Type";
        this.meat = "Angus meat";
        this.price = price;
    }

    public Burger(Double price, Additional add1, Additional add2, Additional add3, Additional add4) {
        this.bread = "Roll Type";
        this.meat = "Angus meat";
        this.price = price;
        this.additionals.add(add1);
        this.additionals.add(add2);
        this.additionals.add(add3);
        this.additionals.add(add4);

    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public ArrayList<Additional> getAdditionals() {
        return additionals;
    }

    public void setAdditionals(ArrayList<Additional> additionals) {
        this.additionals = additionals;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
