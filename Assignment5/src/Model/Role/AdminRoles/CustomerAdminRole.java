/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role.AdminRoles;

import Model.Ecosystem;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.UserAccount.UserAccount;
import UI.Customer.CustomerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vachanabelgavi
 */
public class CustomerAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Ecosystem business) {
        return new CustomerJPanel(userProcessContainer, account, organization, Ecosystem.getInstance());
    }
    
}
