 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Organization;

import Model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author vachanabelgavi
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
//            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Restaurant.getValue())){
            organization = new RestaurantOrganization();
//            organization.setName(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Deliveryman.getValue())){
            organization = new DeliverymanOrganization();
//            organization.setName(name);
            organizationList.add(organization);
        }
        return organization;
    }
    
}
