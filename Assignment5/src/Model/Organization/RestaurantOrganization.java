/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Role.AdminRoles.RestaurantAdminRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
 */
public class RestaurantOrganization extends Organization{
    
    public RestaurantOrganization() {
        super(Organization.Type.Deliveryman.getValue());
    }
    
    @Override
    public ArrayList<Role> getAdminRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RestaurantAdminRole());
        return roles;
    }
    
    @Override
    public ArrayList<Role> getPeopleRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RestaurantAdminRole());
        return roles;
    }
    
}
