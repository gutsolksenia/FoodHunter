package spbau.mit.degtjarenko.foodhunter.dishes;

/**
 * Created by Ксения on 08.02.2016.
 */
public class Dish {
    public static int price;
    public static String name;
    private int rate = 0;
    private int rateIndex = 0;

    public Dish(int price, String name) {
        this.name = name;
        this.price = price;
    }

    public void setRate(int mark) {
        rate = (rateIndex * rate + mark) / (rateIndex + 1);
        rateIndex++;
    }

    public int getRate() {
        return rate;
    }
}
