/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSystem;
import Model.UserAccount.UserAccount;
import UI.Customer.Orders.ChooseRestaurantJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vachanabelgavi
 */
public class CustomerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        return new ChooseRestaurantJPanel(userProcessContainer, userAccount, system);
    }
    
}
