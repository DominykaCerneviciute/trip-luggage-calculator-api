package com.luggagecalculator.tripluggagecalculatorapi;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {
    public static LuggageResponse ProcessRequest(Request request) {

        //Creating all available items and adding to arrraylist
        ArrayList<Item> allItems = LuggageFiller.fill();

        LuggageResponse luggage = new LuggageResponse();
        Item calculatedItem;

        //checking whether item in the arraylist is suitable for a trip
        for (Item allItem : allItems) {
            if (((allItem.isInAutumn() && allItem.isInAutumn() == request.isInAutumn()) ||
                    (allItem.isInSpring() && allItem.isInSpring() == request.isInSpring()) ||
                    (allItem.isInSummer() && allItem.isInSummer() == request.isInSummer()) ||
                    (allItem.isInWinter() && allItem.isInWinter() == request.isInWinter())) &&
                    request.getKilometers() >= allItem.getKilometers()) {
                //if item amount is given for a day then it calculates total amount for the trip
                if (!allItem.isTotalForTrip()) {
                    calculatedItem = allItem;
                    //calculating total amount of money for accommodation
                    if (allItem.getName().equals("euros for accommodation")) {
                        calculatedItem.setTotalAmount(request.getNightsIndoors() * calculatedItem.getNumberPerDay());
                        //adding item in luggage only if there is any night planed to sleep indoors
                        if (request.isSleepingIndoors()) {
                            luggage.addToLuggage(calculatedItem);
                        }
                    } else { //calculating total amount if item is not money for accommodation
                        calculatedItem.setTotalAmount(request.getDays() * calculatedItem.getNumberPerDay());
                        luggage.addToLuggage(calculatedItem);
                    }
                } else { //Adding item in a luggage if its amount is total for a trip

                    // checking whether person is going to spend all nights indoors or
                    // isn't going to spend any night on the trip at all
                    // and the item is sleeping bag or a tent.
                    // if so, it is not added in luggage
                    if ((allItem.getName().equals("sleeping bag") || allItem.getName().equals("tent")) &&
                            (request.getTotalNights() == 0 || (request.getTotalNights() - request.getNightsIndoors() == 0))) {
                    } else { //if item amount is total for a trip and it is not sleeping bag or a tent
                        luggage.addToLuggage(allItem);
                    }
                }
            }
        }
        return luggage;
    }
}
