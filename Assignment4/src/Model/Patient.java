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
public class Patient extends Person {
    
    private List<Encounter> encounter1 = new ArrayList<>();
    
    public Patient(){
        super(); 
    }

    public List<Encounter> getEncounters() {
        return encounter1;
    }

    public void addEncounterToPatient(Encounter encounter) {
        this.encounter1.add(encounter);
    }
    
}
