/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelUI;

import ModelArray.Car;
import ModelArray.CarsList;
import javax.swing.JOptionPane;

/**
 *
 * @author vachanabelgavi
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    

    CarsList cars;
    

    
    public CreateJPanel(CarsList cars) {
        initComponents();
        this.cars = cars;
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
        lblSerialNumber = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblCertificate = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtBrand = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtCertificate = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        RadioBtnYes = new javax.swing.JRadioButton();
        RadioBtnNo = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Car");

        lblSerialNumber.setText("Car Serial Number");

        lblModel.setText("Car Model");

        lblBrand.setText("Car Brand");

        lblYear.setText("Year of Manufacture");

        lblCity.setText("City");

        lblSeats.setText("Number of Seats");

        lblCertificate.setText("Maintenance Certificate Expiry");

        lblAvailability.setText("Availability");

        lblDate.setText("Date");

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        RadioBtnYes.setText("Yes");
        RadioBtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnYesActionPerformed(evt);
            }
        });

        RadioBtnNo.setText("No");
        RadioBtnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBtnNoActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
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
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadioBtnYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadioBtnNo)))
                        .addGap(0, 394, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RadioBtnNo, RadioBtnYes});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificate)
                    .addComponent(txtCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(RadioBtnYes)
                    .addComponent(RadioBtnNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSave)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {RadioBtnNo, RadioBtnYes});

    }// </editor-fold>//GEN-END:initComponents

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        //System.out.println(cars);
        //System.out.println("Before Car car = cars.addCar()");
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
        if(RadioBtnYes.isSelected())
            car.availability = RadioBtnYes.getText();
        else
            car.availability = RadioBtnNo.getText();
        
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
        RadioBtnYes.setSelected(false);
        RadioBtnNo.setSelected(false);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void RadioBtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnYesActionPerformed
        // TODO add your handling code here:
        if(RadioBtnYes.isSelected())
            RadioBtnNo.setSelected(false);
    }//GEN-LAST:event_RadioBtnYesActionPerformed

    private void RadioBtnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBtnNoActionPerformed
        // TODO add your handling code here:
        if(RadioBtnNo.isSelected())
            RadioBtnYes.setSelected(false);
    }//GEN-LAST:event_RadioBtnNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioBtnNo;
    private javax.swing.JRadioButton RadioBtnYes;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCertificate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
