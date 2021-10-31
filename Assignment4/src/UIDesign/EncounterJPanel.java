/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIDesign;

import Model.City;
import Model.Community;
import Model.Encounter;
import Model.EncounterHistory;
import Model.House;
import Model.Patient;
import Model.PatientDirectory;
import Model.Person;
import Model.PersonDirectory;
import Model.VitalSigns;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vachanabelgavi
 */
public class EncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterJPanel
     */
    EncounterHistory history;
    PatientDirectory directory;
    PersonDirectory person;
    House house;
    Community community;
    City city;
    
    String selectedItem;
    
    public EncounterJPanel(PatientDirectory directory, PersonDirectory person, House house, Community community, City city) {
        initComponents();
        
        history = new EncounterHistory();
        this.directory = directory;
        this.person = person;
        this.house = house;
        this.community = community;
        this.city = city;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVitalSign = new javax.swing.JLabel();
        dateDate = new com.toedter.calendar.JDateChooser();
        txtVitalSign = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        comboVitals = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelEncounter = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblVitalSign.setText("Vital Sign");

        dateDate.setBackground(new java.awt.Color(255, 255, 255));

        txtVitalSign.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVitalSignKeyReleased(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        comboVitals.setBackground(new java.awt.Color(255, 255, 255));
        comboVitals.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Pressure", "Temperature", "Pulse" }));
        comboVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVitalsActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(54, 33, 89));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/save-20.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblDate.setText("Date");

        lblName.setText("Name");

        lblAge.setText("Age");

        jLabel2.setText("Vital Sign Reading");

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setBackground(new java.awt.Color(54, 33, 89));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Encounter Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        labelEncounter.setFont(new java.awt.Font("Lucida Grande", 2, 11)); // NOI18N
        labelEncounter.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAge)
                            .addComponent(lblName)
                            .addComponent(lblVitalSign))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(comboVitals, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDate)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVitalSign)
                    .addComponent(comboVitals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVitalSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate)
                    .addComponent(dateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnSave)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        String vitalSign = txtVitalSign.getText();
        Date date = dateDate.getDate();
        int age = Integer.parseInt(txtAge.getText());

        Patient patient = new Patient();
        Person person1 = new Person();
        VitalSigns vital = new VitalSigns();
        Encounter encounter = new Encounter();
        

        String vitalName = "";
        double value = 0;
        
        switch(selectedItem){
            case "Blood Pressure":
                vitalName = "Blood Pressure";
                value = Double.parseDouble(txtVitalSign.getText());
                break;
                
            case "Temperature":
                vitalName = "Temperature";
                value = Double.parseDouble(txtVitalSign.getText());
                break;
                
            case "Pulse":
                vitalName = "Pulse";
                value = Double.parseDouble(txtVitalSign.getText());
                break;
                
        }
        //Encounter encounter = history.addEncounter();

        vital.setName(vitalName);
        vital.setValue(value);
        encounter.setVitalSign(vital);
        encounter.setDate(date);
                
        boolean found = false;
        
        for(Person p : person.getPersonDirectory()){
            if(p.getName().equalsIgnoreCase(name) && p.getAge()==age){
                found = true;
            }
        }
        
        boolean inPatientList = false;
        
        for(Community c : city.getCommunityList()){
            
            for(int i = 0; i < c.getHouseList().size(); i++){

                for(int j=0; j < c.getHouseList().get(i).getPersonList().size(); j++){
                        
                        if (c.getHouseList().get(i).getPersonList().get(j).getName().equals(name) &&
                                c.getHouseList().get(i).getPersonList().get(j).getAge() == age) {
                                                    inPatientList = true;

                        }
                    }                    
                }
            }
        
        if (found) {
            patient = directory.addPatient();
            patient.setName(name);
            patient.setAge(age);
            patient.addEncounterToPatient(encounter);
        }
        else {
            person1 = person.addPerson();
            person1.setName(name);
            person1.setAge(age);

            patient = directory.addPatient();
            patient.setName(name);
            patient.setAge(age);
            patient.addEncounterToPatient(encounter); 
        }

        if(inPatientList){
            house.addPatientToHouse(patient);
        }
        
        System.out.println(patient.getName()+" "+patient.getAge());
        System.out.println(encounter.getVitalSign().getName()+" "+encounter.getVitalSign().getValue()+" "+encounter.getDate());

        JOptionPane.showMessageDialog(this, "New Encounter added.");

        txtName.setText("");
        txtAge.setText((""));
        txtVitalSign.setText("");
        dateDate.setDate(null);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void comboVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVitalsActionPerformed
        // TODO add your handling code here:
        selectedItem = (String) comboVitals.getSelectedItem();
    }//GEN-LAST:event_comboVitalsActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String name = txtName.getText();
        
        if(name.trim().equals("") || name.trim().isEmpty()){
            labelEncounter.setText("Fields cannot be left blank");
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtVitalSignKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVitalSignKeyReleased
        // TODO add your handling code here:
        String vital = txtAge.getText();
        
        if(vital.trim().equals("") || vital.trim().isEmpty()){
            labelEncounter.setText("Fields cannot be left blank");
        }
    }//GEN-LAST:event_txtVitalSignKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboVitals;
    private com.toedter.calendar.JDateChooser dateDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEncounter;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblVitalSign;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtVitalSign;
    // End of variables declaration//GEN-END:variables
}
