import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;


/**
 *
 * @author Elsefi
 */

public class Add_Member extends javax.swing.JFrame {

    
    public Add_Member() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try
        {
            int id=1;
            String str1=String.valueOf(id);
            NUM_MEM.setText(str1);
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(NUM_MEMB) from add_member");
            while(rs.next())
            {
                id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);
                NUM_MEM.setText(str);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FIRST_NAME = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LAST_NAME = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        MOBILE_NUM = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ID = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        WEIGHT = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        HEIGHT = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Payment = new javax.swing.JTextPane();
        NUM_MEM = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 194, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD MEMBER");

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jButton1.setText("Add Member");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 194, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("First Name:");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        FIRST_NAME.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        FIRST_NAME.setPreferredSize(new java.awt.Dimension(60, 30));
        jScrollPane1.setViewportView(FIRST_NAME);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LAST_NAME.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        LAST_NAME.setPreferredSize(new java.awt.Dimension(60, 30));
        jScrollPane2.setViewportView(LAST_NAME);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mobile Number:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MOBILE_NUM.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        MOBILE_NUM.setPreferredSize(new java.awt.Dimension(60, 30));
        jScrollPane3.setViewportView(MOBILE_NUM);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("User id:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ID.setEditable(false);
        ID.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ID.setPreferredSize(new java.awt.Dimension(60, 30));
        jScrollPane4.setViewportView(ID);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Weight:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        WEIGHT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        WEIGHT.setPreferredSize(new java.awt.Dimension(60, 30));
        jScrollPane5.setViewportView(WEIGHT);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Gender:");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jRadioButton2.setText("Male");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Female");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Period:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Month", "3 Monthes", "6 Monthes", "1 Year" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Height:");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        HEIGHT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        HEIGHT.setPreferredSize(new java.awt.Dimension(60, 30));
        jScrollPane6.setViewportView(HEIGHT);

        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Payment:");

        Payment.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Payment.setPreferredSize(new java.awt.Dimension(60, 30));
        jScrollPane7.setViewportView(Payment);

        NUM_MEM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NUM_MEM.setText("00");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel13.setText("Number of member:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(55, 55, 55)
                                .addComponent(jRadioButton3))
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(NUM_MEM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUM_MEM)
                    .addComponent(jLabel13))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGLOG.png"))); // NOI18N

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jButton1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
       
        if (!FIRST_NAME.getText().isEmpty() && !LAST_NAME.getText().isEmpty() && !WEIGHT.getText().isEmpty()  && !MOBILE_NUM.getText().isEmpty()) {
            {
                String N_M=NUM_MEM.getText();
                String fname=FIRST_NAME.getText();
                String lname=LAST_NAME.getText();
                double height=Double.parseDouble(HEIGHT.getText());
                double weight=Double.parseDouble(WEIGHT.getText());
                double payment=Double.parseDouble(Payment.getText());
                String m_numb = MOBILE_NUM.getText();
                String gender;
                if(jRadioButton2.isSelected())
                gender="male" ;
                else
                gender="female";
                String the_period=jComboBox1.getSelectedItem().toString();
                

                
String mobileNum = MOBILE_NUM.getText().trim(); 
if (mobileNum == null || mobileNum.isEmpty() || mobileNum.length() < 3) {
    JOptionPane.showMessageDialog(this, "Please enter a valid Mobile Number (at least 3 digits).");
    return;
}
String lastThreeDigits = mobileNum.substring(mobileNum.length() - 3);
String userID = lname + lastThreeDigits;
ID.setText(userID);
ID.setEditable(false);
                     
                                try
                {
                   Connection con=ConnectionProvider.getCon();
                   PreparedStatement ps=con.prepareStatement("insert into add_member values (?,?,?,?,?,?,?,?,?,?)");
                   ps.setString(1, userID);
                   ps.setString(2, fname);
                   ps.setString(3, lname);
                   ps.setString(4, m_numb);
                   ps.setDouble(5, height);
                   ps.setDouble(6, weight);
                   ps.setString(7, gender);
                   ps.setString(8, the_period);
                   ps.setDouble(9,payment );
                   ps.setString(10, N_M);
                   ps.executeUpdate();
                   JOptionPane.showMessageDialog(null,"Successfully Saved");
                    setVisible(false);
                   new Add_Member().setVisible(true);
                }
                catch(Exception e)
                {
                   JOptionPane.showMessageDialog(null,e); 
                }
       }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Add_Member().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Main_INTERFACE jf2 = new Main_INTERFACE();
        jf2.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane FIRST_NAME;
    private javax.swing.JTextPane HEIGHT;
    private javax.swing.JTextPane ID;
    private javax.swing.JTextPane LAST_NAME;
    private javax.swing.JTextPane MOBILE_NUM;
    private javax.swing.JLabel NUM_MEM;
    private javax.swing.JTextPane Payment;
    private javax.swing.JTextPane WEIGHT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
