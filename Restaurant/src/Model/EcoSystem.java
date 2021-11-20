/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Role.Role;
import Model.Role.AdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliverymanDirectory deliveryManDirectory;
    private OrdersList ordersList;
    private FoodDirectory foodDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliverymanDirectory deliveryManDirectory, OrdersList ordersList, FoodDirectory foodDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.ordersList = ordersList;
        this.foodDirectory = foodDirectory;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
    }

    public boolean checkIfUserIsUnique(String userName) {
        return false;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        if(restaurantDirectory == null) {
            restaurantDirectory = new RestaurantDirectory();
        }
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null) {
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliverymanDirectory getDeliverymanDirectory() {
        if(deliveryManDirectory == null) {
            deliveryManDirectory = new DeliverymanDirectory();
        }
        return deliveryManDirectory;
    }

    public void setDeliverymanDirectory(DeliverymanDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public OrdersList getOrdersList() {
        if(ordersList == null) {
            ordersList = new OrdersList();
        }
        return ordersList;
    }

    public void setOrdersList(OrdersList ordersList) {
        this.ordersList = ordersList;
    }
    
    public FoodDirectory getFoodDirectory() {
        if(foodDirectory == null) {
            foodDirectory = new FoodDirectory();
        }
        return foodDirectory;
    }

    public void setFoodDirectory(FoodDirectory foodDirectory) {
        this.foodDirectory = foodDirectory;
    }
}
