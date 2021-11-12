/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.Ecosystem;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author vachanabelgavi
 */
public abstract class Role {
    
    public enum RoleType{
        Customer("Customer"),
        Restaurant("Restaurant"),
        Deliveryman("Deliveryman"),
        Admin("Admin");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
