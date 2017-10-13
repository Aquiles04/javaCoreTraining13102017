package com.silveiraalexand.model;

import java.util.ArrayList;

public class HealthyBurger extends Burger {

    public HealthyBurger(Double price) {
        super(price);
        this.setBread("Brown Rye Bread Roll");
    }

    public HealthyBurger(Double price, Additional add1, Additional add2, Additional add3, Additional add4) {
        super(price, add1, add2, add3, add4);
        this.setBread("Brown Rye Bread Roll");

    }



}
