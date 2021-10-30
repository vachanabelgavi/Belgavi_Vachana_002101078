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
public class PersonDirectory {
    
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory(){
        this.personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addPerson() {
        
        Person newPerson = new Person();
        personDirectory.add(newPerson);
        return newPerson;
    }
    
    public void deleteData(Person p){
        personDirectory.remove(p);
    }
    
}
