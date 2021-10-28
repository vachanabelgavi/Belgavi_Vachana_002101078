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
public class EncounterHistory {
    
    private ArrayList<Encounter> history;
    
    public EncounterHistory(){
        this.history = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }
    
    public Encounter addEncounter() {
        
        Encounter newEncounter = new Encounter();
        history.add(newEncounter);
        return newEncounter;
    }
    
}
