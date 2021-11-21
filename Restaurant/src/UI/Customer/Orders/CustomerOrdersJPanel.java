/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer.Orders;

import Model.Customer;
import Model.Food;
import Model.Orders;
import Model.OrdersList;
import Model.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vachanabelgavi
 */
public class CustomerOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrdersJPanel
     */
    private JPanel userProcessContainer;
    private Customer customer;
    private Restaurant restaurant;
    private ArrayList<Food> cartList;
    private double totalPrice;
    private OrdersList ordersList;
    
    public CustomerOrdersJPanel(JPanel userProcessContainer, Customer customer, Restaurant restaurant, OrdersList ordersList) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.customer = customer;
        this.restaurant = restaurant;
        this.ordersList = ordersList;
        
        cartList = new ArrayList<Food>();
        
        populateTableOfFoods();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCart = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFoodList = new javax.swing.JTable();
        btnCheckOut = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(54, 33, 89));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Item", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCart.setSelectionBackground(new java.awt.Color(54, 33, 89));
        jScrollPane1.setViewportView(tableCart);

        btnAddToCart.setBackground(new java.awt.Color(54, 33, 89));
        btnAddToCart.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        tableFoodList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Item", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFoodList.setSelectionBackground(new java.awt.Color(54, 33, 89));
        jScrollPane2.setViewportView(tableFoodList);

        btnCheckOut.setBackground(new java.awt.Color(54, 33, 89));
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("Check Out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(54, 33, 89));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(54, 33, 89));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Orders Cart");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(47, 47, 47)
                        .addComponent(btnCheckOut)
                        .addGap(44, 44, 44)
                        .addComponent(btnCancel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddToCart)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancel, btnCheckOut, btnDelete});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddToCart)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckOut)
                    .addComponent(btnCancel)
                    .addComponent(btnDelete))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancel, btnCheckOut, btnDelete});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tableFoodList.getSelectedRow();
        if(selectedRow >= 0) {
            Food selectedItem = (Food) tableFoodList.getValueAt(selectedRow, 0);
            cartList.add(selectedItem);
            totalPrice += selectedItem.getPrice();
            populateCartTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to add the Dishes to the Cart.");
        }
        
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        
        Orders order = ordersList.addOrder();
        
        order.setOrderStatus("Order placed");
        order.setCustomer(customer);
        order.setRestaurant(restaurant);
        order.addItem(cartList);
        order.setTotalPrice(totalPrice);
        
        //JOptionPane.showMessageDialog(null, "Total Price($): "+totalPrice);
        CustomerCommentJPanel newRestaurant = new CustomerCommentJPanel(userProcessContainer, customer, restaurant, order);
        userProcessContainer.add("Add Restaurant", newRestaurant);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        totalPrice = 0;
        int rowCount = tableCart.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tableCart.getModel();
        
        for(int i = rowCount-1; i >= 0; i--){
            model.removeRow(i);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tableCart.getSelectedRow();
        if(selectedRow >= 0) {
            Food selectedDish = (Food) tableCart.getValueAt(selectedRow, 0);
            cartList.remove(selectedDish);
            totalPrice -= selectedDish.getPrice();
            populateCartTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the Dishes in the Cart.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    public void backAction(){
        userProcessContainer.remove(this);
        Component [] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length-1];
        ChooseRestaurantJPanel mr = (ChooseRestaurantJPanel) c;
        mr.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableCart;
    private javax.swing.JTable tableFoodList;
    // End of variables declaration//GEN-END:variables

    public void populateTableOfFoods() {
        
        DefaultTableModel menuModel = (DefaultTableModel) tableFoodList.getModel();
        menuModel.setRowCount(0);
       // Restaurant restaurant = ecosystem.getRestaurantDirectory().getRestaurant(userAccount.getUsername());
        for (Food food : restaurant.getFoodDirectory().getFoodDirectory()) {
            Object[] row = new Object[2];
            row[0] = food;
            row[1] = food.getPrice();
            
            menuModel.addRow(row);
        }
    }
    
    public void populateCartTable(){
        
        DefaultTableModel cartModel = (DefaultTableModel) tableCart.getModel();
        cartModel.setRowCount(0);
        for (Food food : cartList) {
            Object[] row = new Object[3];
            row[0] = food;
            row[1] = food.getPrice();
            
            cartModel.addRow(row);
        }
    }
}
