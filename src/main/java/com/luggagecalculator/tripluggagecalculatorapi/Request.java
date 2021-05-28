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

    public Request() {
        this.inWinter = false;
        this.inSummer = false;
        this.inSpring = false;
        this.inAutumn = false;
        this.days = 1;
        this.kilometers = 0;
        this.nightsIndoors = 0;
        this.sleepingIndoors = false;
        this.totalNights = 0;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
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

    public void setDays(int days) {
        this.days = days;
        this.totalNights = --days;
    }

    public boolean isSleepingIndoors() {
        return sleepingIndoors;
    }

    public void setSleepingIndoors(boolean sleepingIndoors) {
        this.sleepingIndoors = sleepingIndoors;
    }

    public int getNightsIndoors() {
        return nightsIndoors;
    }

    public void setNightsIndoors(int nightsIndoors) {
        this.nightsIndoors = nightsIndoors;
    }

    public boolean isInWinter() {
        return inWinter;
    }

    public void setInWinter(boolean inWinter) {
        this.inWinter = inWinter;
    }

    public boolean isInSummer() {
        return inSummer;
    }

    public void setInSummer(boolean inSummer) {
        this.inSummer = inSummer;
    }

    public boolean isInAutumn() {
        return inAutumn;
    }

    public void setInAutumn(boolean inAutumn) {
        this.inAutumn = inAutumn;
    }

    public boolean isInSpring() {
        return inSpring;
    }

    public void setInSpring(boolean inSpring) {
        this.inSpring = inSpring;
    }
}
