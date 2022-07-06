/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_management;

import com.stock.db.DB;

/**
 *
 * @author pasindu hathurushigh
 */
public class SupplierCompanyManagement extends javax.swing.JFrame {

    /**
     * Creates new form SupplierCompanyManagement
     */
    public SupplierCompanyManagement() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rad_company = new javax.swing.JRadioButton();
        rad_branch = new javax.swing.JRadioButton();
        panel_main = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier Company Management");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("      Supplier Company");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel2.setText("Register ");

        buttonGroup1.add(rad_company);
        rad_company.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rad_company.setSelected(true);
        rad_company.setText("New Company");
        rad_company.setContentAreaFilled(false);
        rad_company.setFocusPainted(false);
        rad_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_companyActionPerformed(evt);
            }
        });

        buttonGroup1.add(rad_branch);
        rad_branch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rad_branch.setText("New Branch");
        rad_branch.setContentAreaFilled(false);
        rad_branch.setFocusPainted(false);
        rad_branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_branchActionPerformed(evt);
            }
        });

        panel_main.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(rad_company)
                        .addGap(90, 90, 90)
                        .addComponent(rad_branch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad_company)
                    .addComponent(rad_branch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rad_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_companyActionPerformed
        loadCompanyPanel();
    }//GEN-LAST:event_rad_companyActionPerformed

    private void rad_branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_branchActionPerformed
        loadBranchPanel();
    }//GEN-LAST:event_rad_branchActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierCompanyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierCompanyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierCompanyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierCompanyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierCompanyManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel_main;
    private javax.swing.JRadioButton rad_branch;
    private javax.swing.JRadioButton rad_company;
    // End of variables declaration//GEN-END:variables

    void loadCompanyPanel() {
        panel_main.removeAll();
        CompanyPanel comPanel = new CompanyPanel(this);
        panel_main.add(comPanel);
        panel_main.revalidate();
        rad_company.setSelected(true);
    }
    
    void loadBranchPanel() {
        panel_main.removeAll();
        CompanyBranchPanel branchPanel = new CompanyBranchPanel();
        panel_main.add(branchPanel);
        panel_main.revalidate();
        rad_branch.setSelected(true);
    }
    
    void loadBranchPanel(String company_id, String company_name) {
        panel_main.removeAll();
        CompanyBranchPanel branchPanel = new CompanyBranchPanel(company_id, company_name);
        panel_main.add(branchPanel);
        panel_main.revalidate();
        rad_branch.setSelected(true);
    }

}