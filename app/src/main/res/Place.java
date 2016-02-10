import java.util.ArrayList;

/**
 * Created by Ксения on 08.02.2016.
 */
public class Place {
    final String name;
    final String adress;
    private ArrayList<Dish> menu;
    private int rate;
    private int rateIndex;

    public void setRate(int mark) {
        rate = (rateIndex * rate + mark) / (rateIndex + 1);
        rateIndex++;
    }

    public int getRate {
        return rate;
    }
}
