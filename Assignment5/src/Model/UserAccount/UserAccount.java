/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.UserAccount;

import Model.Admin.Admin;
import Model.People.People;
import Model.Role.Role;

/**
 *
 * @author vachanabelgavi
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Admin admin;
    private People people;
    private Role role;

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }  

    public void setRole(Role role) {
        this.role = role;
    }

    public Admin getAdmin() {
        return admin;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}
