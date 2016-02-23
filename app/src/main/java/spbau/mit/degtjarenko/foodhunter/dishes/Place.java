package spbau.mit.degtjarenko.foodhunter.dishes;

import java.util.ArrayList;

import spbau.mit.degtjarenko.foodhunter.dishes.Dish;

/**
 * Created by Ксения on 08.02.2016.
 */
public class Place {
    final String name;
    final String adress;
    private ArrayList<Dish> menu;
    private int rate = 0;
    private int rateIndex = 0;

    public Place(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void setRate(int mark) {
        rate = (rateIndex * rate + mark) / (rateIndex + 1);
        rateIndex++;
    }

    public int getRate() {
        return rate;
    }
}