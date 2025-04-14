import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Elsefi
 */
public class viiew_member extends javax.swing.JFrame {

    public viiew_member() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
        try
        {
           Connection con=ConnectionProvider.getCon();
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select *from add_member");
           while(rs.next())
           {
               model.addRow(new Object[] {rs.getString(10),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
               
           }
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        DELETE_BTN = new javax.swing.JButton();
        UPDATE_BTN = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                formInputMethodTextChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 194, 0));
        jLabel1.setText("View/Edit Member");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 194, 0));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number of member", "ID Member", "First Name", "Last Name", "Mobile Phone", "Heihgt", "Weight", "Gender", "Period", "Payment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        DELETE_BTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DELETE_BTN.setText("DELETE");
        DELETE_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETE_BTNActionPerformed(evt);
            }
        });

        UPDATE_BTN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UPDATE_BTN.setText("UPDATE");
        UPDATE_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DELETE_BTN)
                        .addGap(120, 120, 120)
                        .addComponent(UPDATE_BTN)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DELETE_BTN)
                    .addComponent(UPDATE_BTN))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formInputMethodTextChanged
        
    }//GEN-LAST:event_formInputMethodTextChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Main_INTERFACE jf2 = new Main_INTERFACE();
        jf2.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void UPDATE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE_BTNActionPerformed
                                           
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        try {
            
            Connection con = ConnectionProvider.getCon();
            String numMember = jTable1.getValueAt(selectedRow, 0).toString();
            String idMember = jTable1.getValueAt(selectedRow, 1).toString();
            String firstName = jTable1.getValueAt(selectedRow, 2).toString();
            String lastName = jTable1.getValueAt(selectedRow, 3).toString();
            String mobilePhone = jTable1.getValueAt(selectedRow, 4).toString();
            String height = jTable1.getValueAt(selectedRow, 5).toString();
            String weight = jTable1.getValueAt(selectedRow, 6).toString();
            String gender = jTable1.getValueAt(selectedRow, 7).toString();
            String period = jTable1.getValueAt(selectedRow, 8).toString();
            String payment = jTable1.getValueAt(selectedRow, 9).toString();

            String query = "UPDATE add_member SET id = ?, First_name = ?, last_name = ?, mobilenumber = ?, hight = ?, weight = ?, gender = ?, period = ?, payment = ? WHERE NUM_MEMB = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1, idMember);
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);
            pstmt.setString(4, mobilePhone);
            pstmt.setString(5, height);
            pstmt.setString(6, weight);
            pstmt.setString(7, gender);
            pstmt.setString(8, period);
            pstmt.setString(9, payment);
            pstmt.setString(10, numMember);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Row updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Row not found in database!");
            }

            pstmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row to update!");
    }
    }//GEN-LAST:event_UPDATE_BTNActionPerformed

    private void DELETE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETE_BTNActionPerformed
                                           
        int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        int confirm = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to delete this row?", 
                "Confirm Deletion", 
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String id = jTable1.getValueAt(selectedRow, 0).toString();

            try {
                Connection con = ConnectionProvider.getCon();
                String query = "DELETE FROM add_member WHERE NUM_MEMB = ?";
                PreparedStatement pstmt = con.prepareStatement(query);

                pstmt.setString(1, id);

                
                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {

                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.removeRow(selectedRow);

                    
                    JOptionPane.showMessageDialog(null, "Row deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Row not found in database!");
                }

                pstmt.close();
                con.close();
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }
        }
    } else {

        JOptionPane.showMessageDialog(null, "Please select a row to delete!");
    }
    }//GEN-LAST:event_DELETE_BTNActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viiew_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viiew_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viiew_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viiew_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viiew_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE_BTN;
    private javax.swing.JButton UPDATE_BTN;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
