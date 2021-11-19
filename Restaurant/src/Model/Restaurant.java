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
public class Restaurant {
    
    private String name;
    private String username;
    private String password;
    private String description;
    private String location;
    private FoodDirectory foodDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.foodDirectory = new FoodDirectory();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FoodDirectory getFoodDirectory() {
        System.out.println(foodDirectory.getFoodDirectory().size());
        return foodDirectory;
    }

    public void setFoodDirectory(FoodDirectory foodDirectory) {
        this.foodDirectory = foodDirectory;
    }
    
    @Override
    public String toString() {
        return name; 
    }
    
    
}
