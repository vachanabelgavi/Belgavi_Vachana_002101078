/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelArray;

import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
 */
public class CarsList {
    
    private ArrayList<Car> cars;
    
    public CarsList(){
        this.cars = new ArrayList<Car>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
    
    public Car addCar(){
        Car newCar = new Car();
        cars.add(newCar);
        return newCar;
    }
}
