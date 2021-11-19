package Model;

import Model.Employee.Employee;
import Model.Role.AdminRole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("Admin", "admin", "admin", employee, new AdminRole());

        return system;
    }
}
