package com.luggagecalculator.tripluggagecalculatorapi;

import java.util.ArrayList;

public class LuggageResponse {

    public ArrayList<luggageItem> getLuggage() {
        return Luggage;
    }

    public LuggageResponse(){
        Luggage = new ArrayList<>();
    }

    private final ArrayList<luggageItem> Luggage;

    public void addToLuggage(Item item){
        //if item amount is for whole trip
        if (item.getNumberPerDay() == 0){
            luggageItem luggItem = new luggageItem(item.getName(), item.getTotalAmount());
            Luggage.add(luggItem);
        } else{ //if item amount is for a day and total amount is calculated
            luggageItem luggItem = new luggageItem(item.getName(), item.getTotalAmount(), item.getNumberPerDay());
            Luggage.add(luggItem);
        }
    }
}
