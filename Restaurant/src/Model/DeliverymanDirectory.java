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
public class DeliverymanDirectory {
    
    private List<Deliveryman> deliveryList;

    public DeliverymanDirectory() {
        deliveryList = new ArrayList<Deliveryman>();
    }

    public List<Deliveryman> getDeliveryList() {
        return deliveryList;
    }
    
    public Deliveryman addDeliveryPerson() {
        Deliveryman newperson = new Deliveryman();
        deliveryList.add(newperson);
        return newperson;
    }

    public void removeDeliveryPerson(Deliveryman deliveryman) {
        deliveryList.remove(deliveryman);
    }

    public Deliveryman searchDeliveryPerson(String name) {
        for (Deliveryman delivery : deliveryList) {
            if (delivery.getName().equals(name)) {
                return delivery;
            }
        }
        return null;
    }
    
}
