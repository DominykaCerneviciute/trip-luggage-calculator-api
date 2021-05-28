package com.luggagecalculator.tripluggagecalculatorapi;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {
    public static LuggageResponse ProcessRequest(Request request) {

        //Creating all available items and adding to arrraylist
        ArrayList<Item> allItems = new ArrayList<Item>();
        allItems.add(new Item("liters of water",true,true,true,true,false,3, 1));
        allItems.add(new Item("pairs of socks",true,true,true,true,false,3, 20));
        allItems.add(new Item("shirts",true,true,true,true,false,1, 20));
        allItems.add(new Item("soap",true,true,true,true,true,1, 1));
        allItems.add(new Item("shampoo",true,true,true,true,true,1, 1));
        allItems.add(new Item("hat",true,false,false,true,true,1, 1));
        allItems.add(new Item("toothbrush",true,true,true,true,true,1, 1));
        allItems.add(new Item("toothpaste",true,true,true,true,true,1, 1));
        allItems.add(new Item("raincoats ",false,true,true,true,true,2, 1));
        allItems.add(new Item("tent",true,true,true,true,true,1, 1));
        allItems.add(new Item("sleeping bag",true,true,true,true,true,1, 1));
        allItems.add(new Item("thermos",true,true,false,false,true,1, 1));
        allItems.add(new Item("euros for accommodation",true,true,true,true,false,30, 1));
        allItems.add(new Item("euros for food",true,true,true,true,false,15, 1));
        allItems.add(new Item("plasters",true,true,true,true,false,4, 30));
        allItems.add(new Item("deodorant",true,true,true,true,true,1, 10));
        allItems.add(new Item("towel",true,true,true, true,true,1, 1));
        allItems.add(new Item("underwear", true,true,true,true,false,1,1));
        allItems.add(new Item("jacket",true,true,true,true,true,1,10));
        allItems.add(new Item("cutlery", true,true,true,true, true, 1, 30));
        allItems.add(new Item("scarf",true,true,false,false,true,1,1));
        allItems.add(new Item("pair of gloves", true,false,false,false,true,2,1));
        allItems.add(new Item("snacks",true,true,true,true,false,4,10));


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
