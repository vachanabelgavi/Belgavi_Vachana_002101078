/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIDesign;

import Model.City;
import Model.Community;
import Model.House;
import Model.PatientDirectory;
import Model.PersonDirectory;
import Model.SystemPeople;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vachanabelgavi
 */
public class CommunityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityJPanel
     */
    PersonDirectory person;
    PatientDirectory patient;
    House house;
    Community community;
    City city;
    SystemPeople system;
    
    DefaultTableModel modelTable, searchTable, model;
    String selectedItem;
    
    
    public CommunityJPanel(PersonDirectory person, PatientDirectory patient, House house, Community community, City city, SystemPeople system) {
        initComponents();
        
        this.person = person;
        this.patient = patient;
        this.house = house;
        this.community = community;
        this.city = city;
        this.system = system;
        
        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        comboSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnLessthan = new javax.swing.JButton();
        btnMorethan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        btnVitals = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCommunity = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableUpdate = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jLabel1.setBackground(new java.awt.Color(54, 33, 89));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Community Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        lblSearch.setText("Search By");

        comboSearch.setBackground(new java.awt.Color(255, 255, 255));
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Pressure", "Temperature", "Pulse" }));
        comboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSearchActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnLessthan.setBackground(new java.awt.Color(54, 33, 89));
        btnLessthan.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnLessthan.setForeground(new java.awt.Color(255, 255, 255));
        btnLessthan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/search-20.png"))); // NOI18N
        btnLessthan.setText("Less than");
        btnLessthan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessthanActionPerformed(evt);
            }
        });

        btnMorethan.setBackground(new java.awt.Color(54, 33, 89));
        btnMorethan.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        btnMorethan.setForeground(new java.awt.Color(255, 255, 255));
        btnMorethan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/search-20.png"))); // NOI18N
        btnMorethan.setText("Greater than");
        btnMorethan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMorethanActionPerformed(evt);
            }
        });

        jLabel2.setText("Community");

        btnVitals.setText("Community-wise Vitals");
        btnVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitalsActionPerformed(evt);
            }
        });

        tableCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Community", "Vital Sign", "Value", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCommunity.setSelectionBackground(new java.awt.Color(54, 33, 89));
        jScrollPane3.setViewportView(tableCommunity);

        tableUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Community ", "Vital Sign", "Value", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUpdate.setSelectionBackground(new java.awt.Color(54, 33, 89));
        jScrollPane4.setViewportView(tableUpdate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnLessthan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMorethan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVitals))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLessthan)
                    .addComponent(btnMorethan)
                    .addComponent(lblSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSearchActionPerformed
        // TODO add your handling code here:
        selectedItem = (String) comboSearch.getSelectedItem();
    }//GEN-LAST:event_comboSearchActionPerformed

    private void btnLessthanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessthanActionPerformed
        // TODO add your handling code here:
        
        model = (DefaultTableModel) tableUpdate.getModel();
        model.setRowCount(0);
        
        double value = Double.parseDouble(txtSearch.getText());
        String commSearch = txtCommunity.getText();
        
        boolean foundbp = false;
        boolean foundtemp = false;
        boolean foundpulse = false;
        
        if(commSearch.equals("") || commSearch.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter data in Search field.");
        }
        else{
            switch(selectedItem){
                case "Blood Pressure":
                    for(Community c : city.getCommunityList()){
                        System.out.println(c.getHouseList().size());
                        if(c.getName().equalsIgnoreCase(commSearch)){
                            for(int i=0; i < c.getHouseList().size(); i++){
                                
                                System.out.println(c.getHouseList().get(i).getPatientList().size());
                                for(int j=0; j < c.getHouseList().get(i).getPatientList().size(); j++){
                                    
                                    for(int k=0; k < c.getHouseList().get(i).getPatientList().get(j).getEncounters().size(); k++){
                                        
                                        System.out.println(c.getHouseList().get(i).getPatientList().get(j).getEncounters().size());
                                        if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equals("Blood Pressure")
                                                && c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()<=value){
                                            
                                            System.out.println("Inside if "+c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName());
                                            foundbp = true;
                                            Object[] list6 = new Object[6];
                                            
                                            list6[0] = c.getHouseList().get(i).getPatientList().get(j).getName();
                                            list6[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                            list6[2] = c.getName();
                                            list6[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                            list6[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                            list6[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();
                                            
                                            model.addRow(list6);
                                            System.out.println("BP print "+list6[0]+" "+list6[1]);
                                            System.out.println("BP print "+list6[3]+" "+list6[4]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(!foundbp){
                        JOptionPane.showMessageDialog(null, "Not Found!");
                    }
                    break;
                    
                case "Temperature":
                    for(Community c : city.getCommunityList()){
                        if(c.getName().equalsIgnoreCase(commSearch)){
                            for(int i=0; i < c.getHouseList().size(); i++){
                                
                                for(int j=0; j < c.getHouseList().get(i).getPatientList().size(); j++){
                                    
                                    for(int k=0; k < c.getHouseList().get(i).getPatientList().get(j).getEncounters().size(); k++){
                                        if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equals("Temperature")
                                               && c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()<=value){
                                            
                                            foundtemp = true;
                                            Object[] list4 = new Object[6];
                                            
                                            list4[0] = c.getHouseList().get(i).getPatientList().get(j).getName();
                                            list4[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                            list4[2] = c.getName();
                                            list4[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                            list4[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                            list4[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();
                                            
                                            model.addRow(list4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(!foundtemp){
                        JOptionPane.showMessageDialog(null, "Not Found!");
                    }
                    break;
                
                case "Pulse":
                    for(Community c : city.getCommunityList()){
                        if(c.getName().equalsIgnoreCase(commSearch)){
                            for(int i=0; i < c.getHouseList().size(); i++){
                                
                                for(int j=0; j < c.getHouseList().get(i).getPatientList().size(); j++){
                                    
                                    for(int k=0; k < c.getHouseList().get(i).getPatientList().get(j).getEncounters().size(); k++){
                                        if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equals("Pulse")
                                               && c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()<=value){
                                            
                                            foundpulse = true;
                                            Object[] list5 = new Object[6];
                                            
                                            list5[0] = c.getHouseList().get(i).getPatientList().get(j).getName();
                                            list5[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                            list5[2] = c.getName();
                                            list5[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                            list5[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                            list5[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();
                                            
                                            model.addRow(list5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(!foundpulse){
                        JOptionPane.showMessageDialog(null, "Not Found!");
                    }
                    break;
            }
        }
    }//GEN-LAST:event_btnLessthanActionPerformed

    private void btnMorethanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMorethanActionPerformed
        // TODO add your handling code here:
        
        modelTable = (DefaultTableModel) tableUpdate.getModel();
        modelTable.setRowCount(0);
        
        double value = Double.parseDouble(txtSearch.getText());
        String commSearch = txtCommunity.getText();
        
        boolean foundbp = false;
        boolean foundtemp = false;
        boolean foundpulse = false;
        
        if(commSearch.equals("") || commSearch.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter data in Search field.");
        }
        else{
            switch(selectedItem){
                case "Blood Pressure":
                    for(Community c : city.getCommunityList()){
                        System.out.println(c.getHouseList().size());
                        if(c.getName().equalsIgnoreCase(commSearch)){
                            for(int i=0; i < c.getHouseList().size(); i++){
                                
                                System.out.println(c.getHouseList().get(i).getPatientList().size());
                                for(int j=0; j < c.getHouseList().get(i).getPatientList().size(); j++){
                                    
                                    for(int k=0; k < c.getHouseList().get(i).getPatientList().get(j).getEncounters().size(); k++){
                                        
                                        System.out.println(c.getHouseList().get(i).getPatientList().get(j).getEncounters().size());
                                        if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equals("Blood Pressure")
                                               && c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()>value){
                                            
                                            foundbp = true;
                                            Object[] list1 = new Object[6];
                                            
                                            list1[0] = c.getHouseList().get(i).getPatientList().get(j).getName();
                                            list1[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                            list1[2] = c.getName();
                                            list1[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                            list1[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                            list1[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();
                                            
                                            model.addRow(list1);
                                            System.out.println(list1[0]+" "+list1[1]);
                                            System.out.println(list1[3]+" "+list1[4]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(!foundbp){
                        JOptionPane.showMessageDialog(null, "Not Found!");
                    }
                    break;
                    
                case "Temperature":
                    for(Community c : city.getCommunityList()){
                        if(c.getName().equalsIgnoreCase(commSearch)){
                            for(int i=0; i < c.getHouseList().size(); i++){
                                
                                for(int j=0; j < c.getHouseList().get(i).getPatientList().size(); j++){
                                    
                                    for(int k=0; k < c.getHouseList().get(i).getPatientList().get(j).getEncounters().size(); k++){
                                        if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equalsIgnoreCase("Temperature")
                                               && c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()>value){
                                            
                                            foundtemp = true;
                                            Object[] list3 = new Object[6];
                                            
                                            list3[0] = c.getHouseList().get(i).getPatientList().get(j).getName();
                                            list3[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                            list3[2] = c.getName();
                                            list3[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                            list3[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                            list3[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();
                                            
                                            model.addRow(list3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(!foundtemp){
                        JOptionPane.showMessageDialog(null, "Not Found!");
                    }
                    break;
                
                case "Pulse":
                    for(Community c : city.getCommunityList()){
                        if(c.getName().equalsIgnoreCase(commSearch)){
                            for(int i=0; i < c.getHouseList().size(); i++){
                                
                                for(int j=0; j < c.getHouseList().get(i).getPatientList().size(); j++){
                                    
                                    for(int k=0; k < c.getHouseList().get(i).getPatientList().get(j).getEncounters().size(); k++){
                                        if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equals("Pulse")
                                               && c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()>value){
                                            
                                            foundpulse = true;
                                            Object[] list2 = new Object[6];
                                            
                                            list2[0] = c.getHouseList().get(i).getPatientList().get(j).getName();
                                            list2[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                            list2[2] = c.getName();
                                            list2[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                            list2[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                            list2[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();
                                            
                                            model.addRow(list2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(!foundpulse){
                        JOptionPane.showMessageDialog(null, "Not Found!");
                    }
                    break;
            }
        }
        
    }//GEN-LAST:event_btnMorethanActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitalsActionPerformed
        // TODO add your handling code here:
        
        searchTable = (DefaultTableModel) tableUpdate.getModel();
        searchTable.setRowCount(0);
        
        //int normalbp=0, normtemp = 0, normpulse=0;
        int abnormalbp=0, abnormtemp=0, abnormpulse=0;
        
        String comm = txtCommunity.getText();
        
        for(Community c : city.getCommunityList()){
            for(int i=0; i < c.getHouseList().size(); i++){
                if(c.getName().equalsIgnoreCase(comm)){
                
                    for(int j=0; j < c.getHouseList().get(i).getPatientList().size(); j++){

                        System.out.println(c.getHouseList().get(i).getPatientList().size());
                        for(int k=0; k < c.getHouseList().get(i).getPatientList().get(j).getEncounters().size(); k++){

                            System.out.println(c.getHouseList().get(i).getPatientList().get(j).getEncounters().size());
                            System.out.println("j " + c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName());
                            System.out.println("j "+c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue());
                            if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equalsIgnoreCase("Blood Pressure") && 
                                    c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()<=80 || 
                                    c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()>=120){

                                //System.out.println("Abnormal: "+abnormalbp+" "+"Normal: "+normalbp);
                                Object[] list7 = new Object[6];

                                list7[0] = c.getHouseList().get(i).getPatientList().get(j).getName(); 
                                list7[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                list7[2] = c.getName();
                                list7[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                list7[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                list7[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();

                                searchTable.addRow(list7);
                                
                                //normalbp = model.getRowCount() - searchTable.getRowCount();
                                abnormalbp = searchTable.getRowCount();
                                System.out.println("Abnormal count : "+abnormalbp);
                                //JOptionPane.showMessageDialog(null, "Blood Pressure\n"+"Abnormal: "+abnormalbp+"\n"+"Normal: "+normalbp);
                            }
                            searchTable.setRowCount(0);
                            
                            if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equalsIgnoreCase("Temperature") && 
                                    c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()<=95 || 
                                    c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()>=100){
                                
                                Object[] list8 = new Object[6];

                                list8[0] = c.getHouseList().get(i).getPatientList().get(j).getName(); 
                                list8[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                list8[2] = c.getName();
                                list8[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                list8[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                list8[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();

                                searchTable.addRow(list8);
                                //normtemp = model.getRowCount() - searchTable.getRowCount();
                                abnormtemp = searchTable.getRowCount();
                                System.out.println("Abnormal count : "+abnormtemp);
                            }
                            searchTable.setRowCount(0);
                            
                            if(c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName().equalsIgnoreCase("Pulse") && 
                                    c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()<=60 || 
                                    c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue()>=100){
                                
                                Object[] list9 = new Object[6];

                                list9[0] = c.getHouseList().get(i).getPatientList().get(j).getName(); 
                                list9[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                                list9[2] = c.getName();
                                list9[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                                list9[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                                list9[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();

                                searchTable.addRow(list9);
                                //normpulse = model.getRowCount() - searchTable.getRowCount();
                                abnormpulse = searchTable.getRowCount();
                                System.out.println("Abnormal count : "+abnormpulse);
                            }
                        }
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Blood Pressure\n"+"Abnormal: "+abnormalbp
                            +"\n\n"+"Temperature"+"\n"+"Abnormal: "+abnormtemp
                            +"\n\n"+"Pulse"+"\n"+"Abnormal: "+abnormpulse);
        
        //searchTable.setRowCount(0);
    }//GEN-LAST:event_btnVitalsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLessthan;
    private javax.swing.JButton btnMorethan;
    private javax.swing.JButton btnVitals;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tableCommunity;
    private javax.swing.JTable tableUpdate;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables


    public void displayTable(){
        
        model = (DefaultTableModel) tableCommunity.getModel();
        model.setRowCount(0);
        
        Object[] list = new Object[6];
        
        System.out.println();
        for(Community c : city.getCommunityList()){
                    System.out.println("\n\nU com name: "+ c.getName());

            
            list[2] = c.getName();
            
                                System.out.println("U com house list size: "+ c.getHouseList().size());

            for(int i=0; i < c.getHouseList().size(); i++){
                
                                                System.out.println("U com house list patient list size: "+ c.getHouseList().get(i).getPatientList().size());

                for(int j=0; j < c.getHouseList().get(i).getPatientList().size(); j++){
                    
                    list[0] = c.getHouseList().get(i).getPatientList().get(j).getName();
                    list[1] = c.getHouseList().get(i).getPatientList().get(j).getAge();
                    
                    
                                                                    System.out.println("U com house list patient list encounter list size: "+  c.getHouseList().get(i).getPatientList().get(j).getEncounters().size());

                    for(int k=0; k < c.getHouseList().get(i).getPatientList().get(j).getEncounters().size(); k++){
                        
                        list[3] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getName();
                        list[4] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getVitalSign().getValue();
                        list[5] = c.getHouseList().get(i).getPatientList().get(j).getEncounters().get(k).getDate();
                        
                        model.addRow(list);
                    }
                }
            }
        }
    }
        
}
