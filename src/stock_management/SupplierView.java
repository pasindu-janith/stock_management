/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_management;

import com.stock.db.DB;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author pasindu hathurushigh
 */
public class SupplierView extends javax.swing.JFrame {

    /**
     * Creates new form SupplierView
     */
    public SupplierView() {
        initComponents();
        loadCompany();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_land = new javax.swing.JTextField();
        txt_address1 = new javax.swing.JTextField();
        txt_address2 = new javax.swing.JTextField();
        txt_address3 = new javax.swing.JTextField();
        rad_male = new javax.swing.JRadioButton();
        rad_female = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txt_mobile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        combo_company = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        rad_active = new javax.swing.JRadioButton();
        rad_inactive = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        combo_branch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("      SUPPLIER REGISTRATION");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("Supplier NIC");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Contact No");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("Address line1");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Address line2");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Address line3");

        txt_nic.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        txt_fname.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        txt_lname.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txt_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lnameActionPerformed(evt);
            }
        });

        txt_land.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txt_land.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_landActionPerformed(evt);
            }
        });

        txt_address1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        txt_address2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        txt_address3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        buttonGroup1.add(rad_male);
        rad_male.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rad_male.setSelected(true);
        rad_male.setText("Male");
        rad_male.setFocusPainted(false);

        buttonGroup1.add(rad_female);
        rad_female.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rad_female.setText("Female");
        rad_female.setFocusPainted(false);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stock/images/saveicon.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stock/images/updateicon.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stock/images/deleteicon.png"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/stock/images/searchicon.png"))); // NOI18N
        jButton4.setText("SEARCH");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton5.setText("Add Supplier Company");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txt_mobile.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Company");

        combo_company.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        combo_company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_companyActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setText("Status");

        buttonGroup2.add(rad_active);
        rad_active.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rad_active.setSelected(true);
        rad_active.setText("Active");
        rad_active.setFocusPainted(false);

        buttonGroup2.add(rad_inactive);
        rad_inactive.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rad_inactive.setText("Inactive");
        rad_inactive.setFocusPainted(false);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("Branch");

        combo_branch.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        combo_branch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txt_address2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_address3)
                            .addComponent(combo_company, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rad_active)
                                .addGap(51, 51, 51)
                                .addComponent(rad_inactive)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(combo_branch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_land, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_lname)
                            .addComponent(txt_fname)
                            .addComponent(txt_address1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rad_male)
                                        .addGap(47, 47, 47)
                                        .addComponent(rad_female))
                                    .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rad_male)
                            .addComponent(rad_female))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_land, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_address2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_address3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(combo_company, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(combo_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(rad_active)
                            .addComponent(rad_inactive)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lnameActionPerformed

    private void txt_landActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_landActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_landActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!txt_nic.getText().equals("") && txt_nic.getText() != null
                && !txt_fname.getText().equals("") && txt_fname.getText() != null
                && !txt_lname.getText().equals("") && txt_lname.getText() != null
                && !txt_mobile.getText().equals("") && txt_mobile.getText() != null
                && !txt_address1.getText().equals("") && txt_address1.getText() != null
                && !txt_address2.getText().equals("") && txt_address2.getText() != null) {
            String gender = (rad_male.isSelected()) ? "MALE" : "FEMALE";
            int status = (rad_active.isSelected()) ? 1 : 0;
            try {
                DB.push("INSERT INTO address(`address_line1`,`address_line2`,`address_line3`) VALUES('"
                        + txt_address1.getText() + "','"
                        + txt_address2.getText() + "','"
                        + txt_address3.getText() + "')");
                ResultSet rs = DB.search("SELECT `id` FROM address WHERE `address_line1`='"
                        + txt_address1.getText() + "' AND `address_line2`='"
                        + txt_address2.getText() + "' AND `address_line3`='"
                        + txt_address3.getText() + "'");
                if (rs.next()) {
                    DB.push("INSERT INTO supplier VALUES('"
                            + txt_nic.getText() + "','"
                            + txt_fname.getText() + "','"
                            + txt_lname.getText() + "','"
                            + gender + "','"
                            + txt_land.getText() + "','"
                            + txt_mobile.getText() + "','"
                            + rs.getInt("id") + "','"
                            + combo_branch.getSelectedItem().toString().split("-")[0] + "','"
                            + status + "')");
                    JOptionPane.showMessageDialog(this, "Supplier Registered sucessfully!");
                    clearFields();
                }
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(this, "This Supplier already Registered");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Fill all mandatory Fields!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!txt_nic.getText().equals("") && txt_nic.getText() != null) {
            try {
                ResultSet rs = DB.search("SELECT * FROM supplier s INNER JOIN address a ON a.`id`=s.`address`"
                        + " WHERE `nic`='" + txt_nic.getText().trim() + "' AND `status`='1'");
                if (rs.next()) {
                    txt_fname.setText(rs.getString("fname"));
                    txt_lname.setText(rs.getString("lname"));
                    txt_mobile.setText(rs.getString("contactno1"));
                    txt_land.setText(rs.getString("contactno2"));
                    if (rs.getString("gender").equals("MALE")) {
                        rad_male.setSelected(true);
                    } else {
                        rad_female.setSelected(true);
                    }
                    
                    if (rs.getString("status").equals("1")) {
                        rad_active.setSelected(true);
                    } else {
                        rad_inactive.setSelected(true);
                    }
                    txt_address1.setText(rs.getString("address_line1"));
                    txt_address2.setText(rs.getString("address_line2"));
                    txt_address3.setText(rs.getString("address_line3"));

                    ResultSet rs_com_branch = DB.search("SELECT * FROM branch b INNER JOIN company c ON b.`company_id`= c.`company_id`"
                            + "WHERE b.`branch_id`='" + rs.getInt("company_branch_id") + "'");
                    if (rs_com_branch.next()) {
                        String company = rs_com_branch.getInt("company_id") + "-" + rs_com_branch.getString("company_name");
                        String branch = rs_com_branch.getInt("branch_id") + "-" + rs_com_branch.getString("branch_name");
                        combo_company.setSelectedItem(company);
                        combo_branch.setSelectedItem(branch);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No registered supplier from this NIC");
                    txt_nic.setText(null);
                    txt_nic.grabFocus();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Enter the supplier's NIC to search");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (!txt_nic.getText().equals("") && txt_nic.getText() != null) {
                int confirmDialog = JOptionPane.showConfirmDialog(this, "Are you sure to delete Supplier!",
                        "Delete Supplier", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmDialog == JOptionPane.YES_OPTION) {
                    DB.push("UPDATE supplier SET status='0' WHERE nic='" + txt_nic.getText() + "'");
                    JOptionPane.showMessageDialog(this, "Supplier Deleted!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!txt_nic.getText().equals("") && txt_nic.getText() != null
                && !txt_fname.getText().equals("") && txt_fname.getText() != null
                && !txt_lname.getText().equals("") && txt_lname.getText() != null
                && !txt_mobile.getText().equals("") && txt_mobile.getText() != null
                && !txt_address1.getText().equals("") && txt_address1.getText() != null
                && !txt_address2.getText().equals("") && txt_address2.getText() != null) {
            String gender = (rad_male.isSelected()) ? "MALE" : "FEMALE";
            int status = 1;
            if (rad_inactive.isSelected()) {
                status = 0;
            }
            try {
                ResultSet rs = DB.search("SELECT `address` FROM supplier WHERE `nic`='" + txt_nic.getText() + "'");
                if (rs.next()) {
                    DB.push("UPDATE address SET `address_line1`='"
                            + txt_address1.getText() + "',`address_line2`='"
                            + txt_address2.getText() + "',`address_line3`='"
                            + txt_address3.getText() + "' WHERE `id`='" + rs.getInt("address") + "'");
                    DB.push("UPDATE supplier SET `fname`='"
                            + txt_fname.getText() + "',`lname`='"
                            + txt_lname.getText() + "',`gender`='"
                            + gender + "',`contactno1`='"
                            + txt_land.getText() + "',`contactno2`='"
                            + txt_mobile.getText() + "',`company`='"
                            + combo_branch.getSelectedItem().toString().split("-")[0] + "',`status`='"
                            + status + "' WHERE `nic`='" + txt_nic.getText() + "'");
                    JOptionPane.showMessageDialog(this, "Supplier Registered sucessfully!");
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "No registered supplier from this NIC to update");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Fill all mandatory Fields!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_companyActionPerformed
        try {
            ResultSet rs = DB.search("SELECT * FROM branch WHERE `company_id`='"
                    + combo_company.getSelectedItem().toString().split("-")[0] + "'");
            Vector v = new Vector();
            while (rs.next()) {
                v.add(rs.getString("branch_id") + "-" + rs.getString("branch_name"));
            }
            combo_branch.setModel(new DefaultComboBoxModel<>(v));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_combo_companyActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SupplierCompanyManagement supCompMgt = new SupplierCompanyManagement();
        supCompMgt.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> combo_branch;
    private javax.swing.JComboBox<String> combo_company;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rad_active;
    private javax.swing.JRadioButton rad_female;
    private javax.swing.JRadioButton rad_inactive;
    private javax.swing.JRadioButton rad_male;
    private javax.swing.JTextField txt_address1;
    private javax.swing.JTextField txt_address2;
    private javax.swing.JTextField txt_address3;
    private javax.swing.JTextField txt_fname;
    private javax.swing.JTextField txt_land;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_nic;
    // End of variables declaration//GEN-END:variables

    private void loadCompany() {
        try {
            ResultSet rs = DB.search("SELECT * FROM company ORDER BY `company_name` ASC");
            Vector v = new Vector();
            while (rs.next()) {
                String company = rs.getString("company_id") + "-" + rs.getString("company_name");
                v.add(company);
            }
            combo_company.setModel(new DefaultComboBoxModel(v));
            combo_company.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearFields() {
        txt_nic.setText(null);
        txt_fname.setText(null);
        txt_lname.setText(null);
        txt_land.setText(null);
        txt_mobile.setText(null);
        txt_address1.setText(null);
        txt_address2.setText(null);
        txt_address3.setText(null);
        rad_active.setSelected(true);
        rad_male.setSelected(true);
        combo_company.setSelectedIndex(0);
    }
}