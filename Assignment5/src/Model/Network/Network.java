/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Network;

import Model.Organization.Organization;

/**
 *
 * @author vachanabelgavi
 */
public class Network {
    
    private String name;
    private Organization customerOrganization;
    private Organization restaurantOrganization;
    private Organization deliverymanOrganization;
    private Organization adminOrganization;
    
    public Network(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerOrganization(Organization customerOrganization) {
        this.customerOrganization = customerOrganization;
    }

    public void setRestaurantOrganization(Organization restaurantOrganization) {
        this.restaurantOrganization = restaurantOrganization;
    }

    public void setDeliverymanOrganization(Organization deliverymanOrganization) {
        this.deliverymanOrganization = deliverymanOrganization;
    }
    /*
    public void setAdminOrganization(Organization adminOrganization) {
        this.adminOrganization = adminOrganization;
    }*/

    @Override
    public String toString(){
        return name;
    }
    
}
