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
public class OrdersList {
    
    private List<Orders> ordersList;
    
    public OrdersList(){
        ordersList = new ArrayList<Orders>();
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }
    
    public Orders addOrder(){
        Orders ord = new Orders();
        ordersList.add(ord);
        return ord;
    }
    
}
