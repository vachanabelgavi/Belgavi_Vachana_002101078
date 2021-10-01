/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelUI;

import ModelArray.Car;
import ModelArray.CarsList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vachanabelgavi
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    CarsList cars;
    
    public ViewJPanel(CarsList cars) {
        initComponents();
        
        this.cars = cars;
        
        displayCars();
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
        tablePopulate = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        lblSeats = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblCertificate = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtSerialNumber = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        lblSerialNumber = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        lblBrand = new javax.swing.JLabel();
        txtCertificate = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        RadioYes = new javax.swing.JRadioButton();
        RadioNo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 800));
        setMinimumSize(new java.awt.Dimension(900, 800));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Car");

        tablePopulate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "Year of Manufacture", "Seats", "Availability", "City", "Maintenance Expiry"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePopulate);

        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "Year of Manufacture", "Seats", "Availability", "City", "Maintenance Expiry"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableSearch);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblSeats.setText("Number of Seats");

        lblCertificate.setText("Maintenance Certificate Expiry");

        lblAvailability.setText("Availability");

        lblDate.setText("Date");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        lblSerialNumber.setText("Car Serial Number");

        lblModel.setText("Car Model");

        lblBrand.setText("Car Brand");

        lblYear.setText("Year of Manufacture");

        lblCity.setText("City");

        jButton1.setText("First available car");

        jButton2.setText("Number of cars available and not available");

        jButton3.setText("Car with minimum no. of seats");

        jButton4.setText("Most recent catalog update");

        jButton5.setText("Maintenance certificate expired cars");

        RadioYes.setText("Yes");
        RadioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioYesActionPerformed(evt);
            }
        });

        RadioNo.setText("No");
        RadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioNoActionPerformed(evt);
            }
        });

        jLabel2.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnView))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblYear)
                            .addComponent(lblSerialNumber)
                            .addComponent(lblModel)
                            .addComponent(lblBrand)
                            .addComponent(lblCity)
                            .addComponent(lblSeats)
                            .addComponent(lblCertificate)
                            .addComponent(lblAvailability)
                            .addComponent(lblDate))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadioYes)
                                .addGap(18, 18, 18)
                                .addComponent(RadioNo)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificate)
                    .addComponent(txtCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(RadioYes)
                    .addComponent(RadioNo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4, jButton5});

    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tablePopulate.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel)tablePopulate.getModel();
        Car selectedCar = (Car) model.getValueAt(selectedRowIndex, 0);
        
        txtSerialNumber.setText(selectedCar.getSerialNumber());
        txtBrand.setText(selectedCar.getBrand());
        txtModel.setText(selectedCar.getModel());
        txtYear.setText(String.valueOf(selectedCar.getYearOfManufacture()));
        txtSeats.setText(String.valueOf(selectedCar.getNumberOfSeats()));
        txtCity.setText(selectedCar.getCity());
        txtCertificate.setText(selectedCar.getMaintenanceExpiry());
        txtDate.setText(selectedCar.getDate());
        //txtAvailability.setText(selectedCar.getAvailability());
        
        if(selectedCar.getAvailability() != "Yes")
            RadioNo.setSelected(true);
        else
            RadioYes.setSelected(true);

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        Car car = cars.addCar();
        //System.out.println("After Car car = cars.addCar()");
        String serialNumber = txtSerialNumber.getText();
        String model = txtModel.getText();
        String brand = txtBrand.getText();
        int yearOfManufacture = Integer.parseInt(txtYear.getText());
        int numberOfSeats = Integer.parseInt(txtSeats.getText());
        String city = txtCity.getText();
        String maintenanceExpiry = txtCertificate.getText();
        String date = txtDate.getText();
        //car.availability = "";
        if(car.availability == "Yes")
            RadioYes.setSelected(true);
        else
            RadioNo.setSelected(true);
        
        car.setSerialNumber(serialNumber);
        car.setModel(model);
        car.setBrand(brand);
        car.setYearOfManufacture(yearOfManufacture);
        car.setNumberOfSeats(numberOfSeats);
        car.setCity(city);
        car.setMaintenanceExpiry(maintenanceExpiry);
        car.setDate(date);
        car.setAvailability(car.availability);
        
        JOptionPane.showMessageDialog(this, "New Car added.");
        
        txtSerialNumber.setText("");
        txtModel.setText("");
        txtBrand.setText("");
        txtYear.setText("");
        txtSeats.setText("");
        txtCity.setText("");
        txtCertificate.setText("");
        txtDate.setText("");
        RadioYes.setSelected(false);
        RadioNo.setSelected(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void RadioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioYesActionPerformed
        // TODO add your handling code here:
        if(RadioYes.isSelected())
            RadioNo.setSelected(false); 
    }//GEN-LAST:event_RadioYesActionPerformed

    private void RadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioNoActionPerformed
        // TODO add your handling code here:
        if(RadioNo.isSelected())
            RadioYes.setSelected(false);
    }//GEN-LAST:event_RadioNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioNo;
    private javax.swing.JRadioButton RadioYes;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTable tablePopulate;
    private javax.swing.JTable tableSearch;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCertificate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void displayCars() {
        
        DefaultTableModel model = (DefaultTableModel) tablePopulate.getModel();
        model.setRowCount(0);
        
        for(Car car : cars.getCars()){
            
            Object[] list = new Object[7];
            list[0] = car;
            list[1] = car.getModel();
            list[2] = car.getYearOfManufacture();
            list[3] = car.getNumberOfSeats();
            list[4] = car.getAvailability();
            list[5] = car.getCity();
            list[6] = car.getMaintenanceExpiry();
            
            model.addRow(list);
            
        }
        
        
    }
}