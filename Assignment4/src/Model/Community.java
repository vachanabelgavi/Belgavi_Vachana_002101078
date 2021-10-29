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
public class Community {
    
    private String name;
    private List<House> houseList = new ArrayList<House>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void addHouseToCommunity(House house) {
        this.houseList.add(house);
    }
    
}
