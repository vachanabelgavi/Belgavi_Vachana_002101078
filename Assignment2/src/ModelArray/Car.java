/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelArray;

import java.util.Date;

/**
 *
 * @author vachanabelgavi
 */
public class Car {
    
    private String serialNumber;
    private String model;
    private String brand;
    private int yearOfManufacture;
    private int numberOfSeats;
    private String city;
    public Date maintenanceExpiry;
    public Date date;
    public String availability;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getMaintenanceExpiry() {
        return maintenanceExpiry;
    }

    public void setMaintenanceExpiry(Date maintenanceExpiry) {
        this.maintenanceExpiry = maintenanceExpiry;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString(){
        return serialNumber;
    }
    
}
