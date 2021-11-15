/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vachanabelgavi
 */
public class RestaurantDirectory {
    
    private List<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<Restaurant>();
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public Restaurant addRestaurant() {
        Restaurant newRestaurant = new Restaurant();
        restaurantList.add(newRestaurant);
        return newRestaurant;
    }

    public void removeRestaurant(Restaurant restaurant) {
        restaurantList.remove(restaurant);
    }

    public Restaurant searchRestaurant(String name) {
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getName().equalsIgnoreCase(name)) {
                return restaurant;
            }
        }
        return null;
    }
    
}
