/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.People;

import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
 */
public class PeopleDirectory {
    
    private ArrayList<People> peopleList;

    public PeopleDirectory() {
        peopleList = new ArrayList<>();
    }

    public ArrayList<People> getPeopleList() {
        return peopleList;
    }
    
    public People createPeople(String name){
        People people = new People();
        people.setName(name);
        peopleList.add(people);
        return people;
    }
    
}
