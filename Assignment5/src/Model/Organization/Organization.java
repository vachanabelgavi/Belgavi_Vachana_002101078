/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Admin.AdminDirectory;
import Model.People.PeopleDirectory;
import Model.Role.Role;
import Model.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
 */
public abstract class Organization {

    private String name;
    private AdminDirectory adminDirectory;
    private PeopleDirectory peopleDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Customer("Customer Organization"), 
        Restaurant("Restaurant Organization"), 
        Deliveryman("Deliveryman Organization"),
        Admin("Admin Organization"),;
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        adminDirectory = new AdminDirectory();
        peopleDirectory = new PeopleDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getAdminRole();
    
    public abstract ArrayList<Role> getPeopleRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }
    
    public PeopleDirectory getPeopleDirectory() {
        return peopleDirectory;
    }  
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}