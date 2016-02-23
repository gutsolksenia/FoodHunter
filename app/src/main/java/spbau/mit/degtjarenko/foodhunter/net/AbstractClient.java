package spbau.mit.degtjarenko.foodhunter.net;

import android.location.Location;

import java.util.List;

import spbau.mit.degtjarenko.foodhunter.dishes.Dish;
import spbau.mit.degtjarenko.foodhunter.dishes.Place;

public abstract class AbstractClient {
    public abstract List<Dish> getDishesList(Location location);
    public abstract List<Dish> getDishesList(String name);
    public abstract List<Dish> getDishesList(Location location, String name);
    public abstract List<Place> getPlacesList(Location location);
    public abstract List<Place> getPlacesList(String name);
    public abstract List<Place> getPlacesList(Location location, String name);
    public abstract List<String> getReviews(Place place);
    public abstract List<Dish> getMenu(Place place);
    public abstract boolean setDishRate(Dish dish);
    public abstract boolean setPlaceRate(Place place);
    public abstract boolean makeReview(Place place, String review);
}
