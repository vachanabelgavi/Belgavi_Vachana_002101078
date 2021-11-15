/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vachanabelgavi
 */
public class Orders {
    
    private int orderNumber;
    private FoodDirectory foodDir;
    private Restaurant restaurant;
    private DeliverymanDirectory deliveryDir;
    private Customer customer;
    
    private static int count = 0;
    
    public Orders(){
        
        count++;
        orderNumber = count;
        
    }
    
    public void addItem(Food food){
        foodDir.addFoodItem(food);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public FoodDirectory getFoodDir() {
        return foodDir;
    }

    public DeliverymanDirectory getDeliveryDir() {
        return deliveryDir;
    }
    
}
