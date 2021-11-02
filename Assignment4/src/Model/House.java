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
public class House {
    
    private String streetName;
    private String houseNumber;
    private String zipCode;
    private List<Person> personList1 = new ArrayList<Person>();
    private List<Patient>patientList = new ArrayList<Patient>();

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<Person> getPersonList() {
        return personList1;
    }

    public void addPersonToHouse(Person person) {
        this.personList1.add(person);
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void addPatientToHouse(Patient patient) {
        this.patientList.add(patient);
    }
    
    public void deletePerson(Person person){
        personList1.remove(person);
    }
    
    public void deletePatient(Patient patient){
        patientList.remove(patient);
    }
    
}
