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
public class City {
    
    private String city;
    private List<Community> communityList = new ArrayList<Community>();

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(List<Community> communityList) {
        this.communityList = communityList;
    }
    
    public Community addCommunity(){
        Community newCom = new Community();
        communityList.add(newCom);
        return newCom;
    }
    
}
