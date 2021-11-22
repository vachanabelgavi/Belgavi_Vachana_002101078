/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vachanabelgavi
 */
public class CustomerDirectory {
    
    private List<Customer> customerList;
    private Customer customer;
    
    public CustomerDirectory(){
        
        customerList = new ArrayList<Customer>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(){
        Customer cust = new Customer();
        customerList.add(cust);
        return cust;
    }
    
    public void removeCustomer(Customer customer){
        customerList.remove(customer);
    }
    
    public Customer getCustomer(String customer){
        for (Customer cust : customerList) {
            if (cust.getUsername().equalsIgnoreCase(customer)){
                            return cust;
            }
        }
        return null;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public Customer searchCustomer(String name) {
        for (Customer cust : customerList) {
            if (cust.getName().equalsIgnoreCase(name)) {
                return cust;
            }
        }
        return null;
    }

}
