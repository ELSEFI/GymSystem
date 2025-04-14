
import Project.ConnectionProvider;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
/**
 *
 * @author ELSEFI
 */
public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PASS_RR = new javax.swing.JPasswordField();
        PASS2_RR = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        F_N_RR = new javax.swing.JTextField();
        L_N_RR = new javax.swing.JTextField();
        U_N_RR = new javax.swing.JTextField();
        Q1_RR = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ANS_RR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 194, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registriation");

        jPanel2.setBackground(new java.awt.Color(255, 194, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First Name");

        PASS_RR.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PASS_RR.setPreferredSize(new java.awt.Dimension(120, 20));
        PASS_RR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASS_RRActionPerformed(evt);
            }
        });

        PASS2_RR.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PASS2_RR.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Last Name");
        jLabel3.setMaximumSize(new java.awt.Dimension(90, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(90, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 25));
        jLabel3.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");
        jLabel4.setMaximumSize(new java.awt.Dimension(90, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(90, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(90, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jLabel5.setMaximumSize(new java.awt.Dimension(90, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(90, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(90, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Confirm Password");
        jLabel6.setMaximumSize(new java.awt.Dimension(90, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(90, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(90, 25));

        F_N_RR.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        F_N_RR.setMinimumSize(new java.awt.Dimension(70, 30));
        F_N_RR.setPreferredSize(new java.awt.Dimension(70, 30));

        L_N_RR.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        U_N_RR.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        Q1_RR.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Q1_RR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's your mother's name?", "What's your favourite team?", "What's your dog's name?", "Random answer!" }));
        Q1_RR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q1_RRActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Backup security question");
        jLabel7.setMaximumSize(new java.awt.Dimension(210, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(210, 25));

        ANS_RR.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        ANS_RR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANS_RRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PASS2_RR, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(PASS_RR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(F_N_RR, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(L_N_RR, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(U_N_RR, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(Q1_RR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ANS_RR, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F_N_RR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_N_RR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(U_N_RR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PASS_RR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PASS2_RR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Q1_RR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ANS_RR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setText("Sign up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BACK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BACK.setText("Back");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(106, 106, 106))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PASS_RRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASS_RRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASS_RRActionPerformed

    private void Q1_RRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q1_RRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q1_RRActionPerformed

    private void ANS_RRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANS_RRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANS_RRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String fname = F_N_RR.getText();
        String lname = L_N_RR.getText();
        String username = U_N_RR.getText();
        String password = String.valueOf(PASS_RR.getPassword());
        String confirmPassword = String.valueOf(PASS2_RR.getPassword());
        String securityQuestion = Q1_RR.getSelectedItem().toString();
        String securityAnswer = ANS_RR.getText();

        if (fname.isEmpty() || lname.isEmpty() || username.isEmpty() || password.isEmpty() || securityAnswer.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection con = ConnectionProvider.getCon();
            String query = "INSERT INTO regist (first_name, last_name, username, password, security_question, security_answer) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, username);
            pst.setString(4, password);
            pst.setString(5, securityQuestion);
            pst.setString(6, securityAnswer);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "User registered successfully!");
                LOGIN jf2= new LOGIN();
                jf2.show();
                this.dispose();
            }

            pst.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        LOGIN jf2 = new LOGIN();
        jf2.show();
        dispose();
    }//GEN-LAST:event_BACKActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ANS_RR;
    private javax.swing.JButton BACK;
    private javax.swing.JTextField F_N_RR;
    private javax.swing.JTextField L_N_RR;
    private javax.swing.JPasswordField PASS2_RR;
    private javax.swing.JPasswordField PASS_RR;
    private javax.swing.JComboBox<String> Q1_RR;
    private javax.swing.JTextField U_N_RR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
