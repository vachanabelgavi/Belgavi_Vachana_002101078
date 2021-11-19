/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Delivery.Orders;

import Model.Deliveryman;
import Model.EcoSystem;
import Model.Orders;
import Model.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vachanabelgavi
 */
public class AssignDeliverymanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignDeliverymanJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ArrayList<Orders> cartList;
    
    public AssignDeliverymanJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userAccount = userAccount;
        
        cartList = new ArrayList<Orders>();
        populateOrdersTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrders = new javax.swing.JTable();
        btnAddOrders = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDelivery = new javax.swing.JTable();
        btnStatus = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of Orders");

        tableOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Restaurant", "Customer", "Total Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableOrders);

        btnAddOrders.setText("Add Orders");
        btnAddOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrdersActionPerformed(evt);
            }
        });

        tableDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Restaurant", "Customer", "Total Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableDelivery);

        btnStatus.setText("Delivery Status");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStatus)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddOrders)
                .addGap(284, 284, 284))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddOrders)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStatus)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrdersActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tableOrders.getSelectedRow();
        if(selectedRow >= 0) {
            Orders selectedItem = (Orders) tableOrders.getValueAt(selectedRow, 0);
            cartList.add(selectedItem);
            
            populateCartTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to add the Dishes to the Cart.");
        }
    }//GEN-LAST:event_btnAddOrdersActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Order Delivered");
        
        DefaultTableModel menuModel = (DefaultTableModel) tableOrders.getModel();
        
        int selectedRow = tableOrders.getSelectedRow();
        
        menuModel.setValueAt("Order Delivered", selectedRow, 4);
        
        Orders ord = (Orders) tableOrders.getValueAt(selectedRow, 0);
        int number = Integer.parseInt((String) menuModel.getValueAt(selectedRow, 0));
        //Deliveryman man = business.getDeliverymanDirectory().addDeliveryPerson();
        if(ord.getOrderNumber() == number){
            ord.setOrderStatus("Order Delivered");
        }
        
        /*
        DeliveryStatusJPanel status = new DeliveryStatusJPanel(userProcessContainer, business);
        userProcessContainer.add("Delivery Status",status);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        */
    }//GEN-LAST:event_btnStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrders;
    private javax.swing.JButton btnStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDelivery;
    private javax.swing.JTable tableOrders;
    // End of variables declaration//GEN-END:variables

    public void populateOrdersTable(){
        
        DefaultTableModel menuModel = (DefaultTableModel) tableOrders.getModel();
        menuModel.setRowCount(0);
       // Restaurant restaurant = ecosystem.getRestaurantDirectory().getRestaurant(userAccount.getUsername());
        for (Orders order : business.getOrdersList().getOrdersList()) {
            Object[] row = new Object[5];
            row[0] = order.getOrderNumber();
            row[1] = order.getRestaurant().getName();
            row[2] = order.getCustomer().getName();
            row[3] = order.getTotalPrice();
            row[4] = order.getOrderStatus();
            
            menuModel.addRow(row);
        }
    }
    
    public void populateCartTable(){
        
        DefaultTableModel cartModel = (DefaultTableModel) tableDelivery.getModel();
        cartModel.setRowCount(0);
        for (Orders o : cartList) {
            Object[] row = new Object[5];
            row[0] = o.getOrderNumber();
            row[1] = o.getRestaurant().getName();
            row[2] = o.getCustomer().getName();
            row[3] = o.getTotalPrice();
            row[4] = o.getOrderStatus();
            
            cartModel.addRow(row);
            
        }
        
    }
    
}
