package com.luggagecalculator.tripluggagecalculatorapi;

import java.util.ArrayList;

public class LuggageFiller {
    public static ArrayList<Item> fill(){
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
        return allItems;
    }
}
