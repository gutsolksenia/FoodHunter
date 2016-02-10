/**
 * Created by Ксения on 08.02.2016.
 */
public class Dish {
    public static int price;
    public static String name;
    private int rate;
    private int rateIndex;

    public void setRate(int mark) {
        rate = (rateIndex * rate + mark) /(rateIndex + 1);
        rateIndex++;
    }

    public int getRate() {
        return rate;
    }

}
