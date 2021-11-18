/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
 */
public class Orders {
    
    private int orderNumber;
    private ArrayList<Food> foodDir;
    private Restaurant restaurant;
    private DeliverymanDirectory deliveryDir;
    private Customer customer;
    private String orderStatus;
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
    
    private static int count = 0;
    
    public Orders(){
        
        count++;
        orderNumber = count;
        
    }
    
    public void addItem(ArrayList<Food> food){
        foodDir = food;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ArrayList<Food> getFoodDir() {
        return foodDir;
    }

    public DeliverymanDirectory getDeliveryDir() {
        return deliveryDir;
    }

    public void setDeliveryDir(DeliverymanDirectory deliveryDir) {
        this.deliveryDir = deliveryDir;
    }
    
}
