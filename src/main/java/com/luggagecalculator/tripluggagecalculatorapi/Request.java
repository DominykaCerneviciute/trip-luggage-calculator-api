package com.luggagecalculator.tripluggagecalculatorapi;

public class Request {
    private int kilometers; //trip distance
    private int days; //how many days the trip will take
    private boolean sleepingIndoors; //whether it is planned to sleep indoors
    private int nightsIndoors; //how many nights are planned to sleep indoors
    private boolean inWinter; //whether the trip will take place in the winter
    private boolean inSummer; //whether the trip will take place in the summer
    private boolean inAutumn; //whether the trip will take place in the autumn
    private boolean inSpring; //whether the trip will take place in the spring
    private int totalNights; //how many nights the trip will take

    public Request(int kilometers, int days, boolean sleepingIndoors, int nightsIndoors, boolean inWinter, boolean inSummer, boolean inAutumn, boolean inSpring) {
        this.inWinter = inWinter;
        this.inSummer = inSummer;
        this.inSpring = inSpring;
        this.inAutumn = inAutumn;
        this.days = days;
        this.kilometers = kilometers;
        this.nightsIndoors = nightsIndoors;
        this.sleepingIndoors = sleepingIndoors;
        this.totalNights = --days;
    }

    public int getKilometers() {
        return kilometers;
    }

    public int getDays() {
        return days;
    }

    public int getTotalNights(){
        return totalNights;
    }

    public boolean isSleepingIndoors() {
        return sleepingIndoors;
    }

    public int getNightsIndoors() {
        return nightsIndoors;
    }

    public boolean isInWinter() {
        return inWinter;
    }

    public boolean isInSummer() {
        return inSummer;
    }

    public boolean isInAutumn() {
        return inAutumn;
    }

    public boolean isInSpring() {
        return inSpring;
    }

}
