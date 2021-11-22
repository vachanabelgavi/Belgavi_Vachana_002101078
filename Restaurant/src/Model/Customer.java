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
public class Customer {
    
    private String name;
    private int phone;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private String username;
    private String password;
    private Orders orders;
    private DeliverymanDirectory deliveryDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public DeliverymanDirectory getDeliveryDirectory() {
        return deliveryDirectory;
    }

    public void setDeliveryDirectory(DeliverymanDirectory deliveryDirectory) {
        this.deliveryDirectory = deliveryDirectory;
    }  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return name; 
    }
}
