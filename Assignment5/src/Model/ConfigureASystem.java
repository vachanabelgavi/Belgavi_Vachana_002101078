/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Admin.Admin;
import Model.Organization.AdminOrganization;
import Model.Role.AdminRoles.SystemAdminRole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author vachanabelgavi
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){
        
        Ecosystem business = Ecosystem.getInstance();
        System.out.println("Ecosystem.getInstance()");
        
        AdminOrganization adminOrganization = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        Admin admin = new Admin();
        admin.setName("Vachana Belgavi");
        
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new SystemAdminRole());
        account.setAdmin(admin);
        
        adminOrganization.getAdminDirectory().getAdminList().add(admin);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        return business;
    }
    
}
