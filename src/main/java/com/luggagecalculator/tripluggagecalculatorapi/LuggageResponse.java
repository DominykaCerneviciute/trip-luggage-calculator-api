package com.luggagecalculator.tripluggagecalculatorapi;

import java.util.ArrayList;

public class LuggageResponse {

    public ArrayList<LuggageItem> getLuggage() {
        return Luggage;
    }

    public LuggageResponse(){
        Luggage = new ArrayList<>();
    }

    private final ArrayList<LuggageItem> Luggage;

    public void addToLuggage(Item item){
        //if item amount is for whole trip
        if (item.getNumberPerDay() == 0){
            LuggageItem luggItem = new LuggageItem(item.getName(), item.getTotalAmount());
            Luggage.add(luggItem);
        } else{ //if item amount is for a day and total amount is calculated
            LuggageItem luggItem = new LuggageItem(item.getName(), item.getTotalAmount(), item.getNumberPerDay());
            Luggage.add(luggItem);
        }
    }
}
