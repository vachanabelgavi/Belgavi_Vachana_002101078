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
public class SystemPeople {
    
    private List<City> cityList = new ArrayList<City>();

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
    
    public City addCity(){
        City newCity = new City();
        cityList.add(newCity);
        return newCity;
    }
}
