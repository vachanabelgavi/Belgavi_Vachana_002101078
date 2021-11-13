/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.AdminRoles.CustomerAdminRole;
import Model.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
 */
public class CustomerOrganization extends Organization{
    
    public CustomerOrganization() {
        super(Organization.Type.Customer.getValue());
    }
    
    @Override
    public ArrayList<Role> getAdminRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerAdminRole());
        return roles;
    }
    
    @Override
    public ArrayList<Role> getPeopleRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerAdminRole());
        return roles;
    }
    
}
