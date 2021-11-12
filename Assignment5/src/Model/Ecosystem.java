/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Network.NetworkDirectory;
import Model.Organization.OrganizationDirectory;

/**
 *
 * @author vachanabelgavi
 */
public class Ecosystem {
    
    private static Ecosystem business;
    private OrganizationDirectory organizationDirectory;
    private NetworkDirectory networkDirectory;
    
    public static Ecosystem getInstance(){
        if (business == null){
            business = new Ecosystem();
        }
        return business;
    }

    private Ecosystem() {
        organizationDirectory = new OrganizationDirectory();
        networkDirectory = new NetworkDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public NetworkDirectory getNetworkDirectory(){
        return networkDirectory;
    }
    
}
