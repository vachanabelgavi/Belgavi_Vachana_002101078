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
public class PatientDirectory {
    
    private ArrayList<Patient> directory;
    
    public PatientDirectory(){
        this.directory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Patient> directory) {
        this.directory = directory;
    }

    public Patient addPatient() {
        
        Patient newPatient = new Patient();
        directory.add(newPatient);
        return newPatient;
    }
    
    
    
}
