package com.luggagecalculator.tripluggagecalculatorapi;

public class luggageItem {
    private final String name; //name of the item
    private int totalAmount; //total amount for a trip
   private Integer perDay; //amount of item for a day

    public luggageItem(String name, int totalAmount, Integer perDay) {
        this.name = name;
        this.totalAmount = totalAmount;
        this.perDay = perDay;
    }

    public luggageItem(String name, int totalAmount) {
        this.name = name;
        this.totalAmount = totalAmount;
        this.perDay = null;
    }

    public String getName() {
        return name;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public Integer getPerDay() {
        return perDay;
    }
}
