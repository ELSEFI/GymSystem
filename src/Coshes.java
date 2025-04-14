import java.sql.Connection;
import Project.ConnectionProvider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Elsefi
 */
public class Coshes extends javax.swing.JFrame {

    public Coshes() {
        initComponents();
        setLocationRelativeTo(null);
        loadCoachesData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        M_B_P = new javax.swing.JTextField();
        F_NAME = new javax.swing.JTextField();
        L_NAME = new javax.swing.JTextField();
        AGEE = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        CAT = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        DELETE_BTN = new javax.swing.JButton();
        UPDATE_BTN = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("First Name:");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 194, 0));
        jLabel1.setText("Coaches");

        jPanel2.setBackground(new java.awt.Color(255, 194, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setText("Mobile Phone:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setText("Age:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Category:");

        M_B_P.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        F_NAME.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        L_NAME.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        AGEE.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jRadioButton2.setText("Female");

        CAT.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        CAT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal Trainers", "Management Coaches", "Fitness Coaches", "Cardio Coaches" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel9.setText("Add Coaches");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setText("Add Coach");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(58, 58, 58)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CAT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(40, 40, 40)
                                .addComponent(jRadioButton2))
                            .addComponent(AGEE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(F_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(M_B_P, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(F_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(L_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(M_B_P, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AGEE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CAT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(332, 332, 332)
                .addComponent(jButton1)
                .addGap(10, 10, 10))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 194, 0));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Mobile Phone", "Age", "Gender", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DELETE_BTN)
                                .addGap(84, 84, 84)
                                .addComponent(UPDATE_BTN))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DELETE_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UPDATE_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

                String firstName = F_NAME.getText();
        String lastName = L_NAME.getText();
        String mobilePhone = M_B_P.getText();
        String age = AGEE.getText();
        String gender = jRadioButton1.isSelected() ? "Male" : "Female";
        String category = CAT.getSelectedItem().toString();

        if (firstName.isEmpty() || lastName.isEmpty() || mobilePhone.isEmpty() || age.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("INSERT INTO coaches (first_name, last_name, mobile, age, gender, cate) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, mobilePhone);
            ps.setInt(4, Integer.parseInt(age));
            ps.setString(5, gender);
            ps.setString(6, category);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Coach added successfully!");
                loadCoachesData(); // Refresh table data
                clearFields();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Main_INTERFACE jf2=new Main_INTERFACE();
        jf2.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
                    String query = "DELETE FROM coaches WHERE first_name = ?";
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

    private void UPDATE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE_BTNActionPerformed

        int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        try {
            String mobilePhone = jTable1.getValueAt(selectedRow, 2).toString(); 
            String firstName = F_NAME.getText().isEmpty() ? jTable1.getValueAt(selectedRow, 0).toString() : F_NAME.getText();
            String lastName = L_NAME.getText().isEmpty() ? jTable1.getValueAt(selectedRow, 1).toString() : L_NAME.getText();
            String age = AGEE.getText().isEmpty() ? jTable1.getValueAt(selectedRow, 3).toString() : AGEE.getText();
            String gender = buttonGroup1.getSelection() == null ? jTable1.getValueAt(selectedRow, 4).toString() : (jRadioButton1.isSelected() ? "Male" : "Female");
            String category = CAT.getSelectedItem().toString().isEmpty() ? jTable1.getValueAt(selectedRow, 5).toString() : CAT.getSelectedItem().toString();

         
            Connection con = ConnectionProvider.getCon();
            String query = "UPDATE coaches SET first_name = ?, last_name = ?, age = ?, gender = ?, cate = ? WHERE mobile = ?";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setInt(3, Integer.parseInt(age));
            pstmt.setString(4, gender);
            pstmt.setString(5, category);
            pstmt.setString(6, mobilePhone);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Row updated successfully!");

                loadCoachesData();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Error: Row not found in database!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pstmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to update!");
    }

    }//GEN-LAST:event_UPDATE_BTNActionPerformed
private void loadCoachesData() {
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM coaches");
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("mobile"),
                    rs.getInt("age"),
                    rs.getString("gender"),
                    rs.getString("cate")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        F_NAME.setText("");
        L_NAME.setText("");
        M_B_P.setText("");
        AGEE.setText("");
        buttonGroup1.clearSelection();
        CAT.setSelectedIndex(0);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coshes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AGEE;
    private javax.swing.JComboBox<String> CAT;
    private javax.swing.JButton DELETE_BTN;
    private javax.swing.JTextField F_NAME;
    private javax.swing.JTextField L_NAME;
    private javax.swing.JTextField M_B_P;
    private javax.swing.JButton UPDATE_BTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
