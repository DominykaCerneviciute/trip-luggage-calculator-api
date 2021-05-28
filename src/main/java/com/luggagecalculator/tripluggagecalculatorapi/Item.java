package com.luggagecalculator.tripluggagecalculatorapi;

public class Item {
    private final String name; // name of the item
    private final boolean inSummer; // whether the item is required in summer
    private final boolean inWinter; // whether the item is required in winter
    private final boolean inSpring; //whether the item is required in spring
    private final boolean inAutumn; // whether the item is required in autumn
    private final boolean totalForTrip; //if the amount is total for a whole trip
    private int totalAmount; //total amount needed for a whole trip
    private int numberPerDay; //amount for a day if the total amount isn't for a whole trip
    private final int kilometers; //from how many kilometers person needs the item


    public Item(String name, boolean inWinter, boolean inAutumn, boolean inSpring, boolean inSummer,
                boolean totalForTrip, int amount, int kilometers){
        this.name = name;
        this.inAutumn = inAutumn;
        this.inSpring = inSpring;
        this.inSummer = inSummer;
        this.inWinter = inWinter;
        this.totalForTrip = totalForTrip;

        if (totalForTrip){
            totalAmount = amount;
        } else {
            numberPerDay = amount;
        }

        this.kilometers = kilometers;
    }

    public String getName() {
        return name;
    }

    public boolean isInSummer() {
        return inSummer;
    }

    public boolean isInWinter() {
        return inWinter;
    }

    public boolean isInSpring() {
        return inSpring;
    }

    public boolean isInAutumn() {
        return inAutumn;
    }

    public boolean isTotalForTrip() {
        return totalForTrip;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public int getNumberPerDay() {
        return numberPerDay;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
