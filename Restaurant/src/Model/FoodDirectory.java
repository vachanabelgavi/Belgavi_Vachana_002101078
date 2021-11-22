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
public class FoodDirectory {
    
    private List<Food> foodDirectory;

    public FoodDirectory() {
        foodDirectory = new ArrayList<Food>();
    }

    public List<Food> getFoodDirectory() {
        return foodDirectory;
    }

    public Food addFoodItem() {
        Food item = new Food();
        foodDirectory.add(item);
        return item;
    }

    public void removeFoodItem(Food item) {
        foodDirectory.remove(item);
    }

    public Food searchFoodItem(String name) {
        for (Food item : foodDirectory) {
            if (item.getFoodItem().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    void addFoodItem(Food food) {
        foodDirectory.add(food);
    }
    
}
