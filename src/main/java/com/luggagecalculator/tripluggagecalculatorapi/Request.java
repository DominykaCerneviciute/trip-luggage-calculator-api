package com.luggagecalculator.tripluggagecalculatorapi;

public class Request {
    private final int kilometers; //trip distance
    private final int days; //how many days the trip will take
    private final boolean sleepingIndoors; //whether it is planned to sleep indoors
    private final int nightsIndoors; //how many nights are planned to sleep indoors
    private final boolean inWinter; //whether the trip will take place in the winter
    private final boolean inSummer; //whether the trip will take place in the summer
    private final boolean inAutumn; //whether the trip will take place in the autumn
    private final boolean inSpring; //whether the trip will take place in the spring
    private final int totalNights; //how many nights the trip will take

    public Request(int kilometers, int days, int nightsIndoors, boolean inWinter, boolean inSummer, boolean inAutumn, boolean inSpring) {
        this.inWinter = inWinter;
        this.inSummer = inSummer;
        this.inSpring = inSpring;
        this.inAutumn = inAutumn;
        this.days = days;
        this.kilometers = kilometers;
        this.nightsIndoors = nightsIndoors;
        if (nightsIndoors > 0){
            this.sleepingIndoors = true;
        }else {
            this.sleepingIndoors = false;
        }

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
