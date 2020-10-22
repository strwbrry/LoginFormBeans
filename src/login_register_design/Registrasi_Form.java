/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design;

import java.awt.Color;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Nabila Eka
 */
public class Registrasi_Form extends javax.swing.JFrame {

    /**
     * Creates new form Registrasi_Form
     */
    
    //create a variable to set the image path in it
    String image_path = null;
    
    public Registrasi_Form() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
         //create a orange border for the jpanel_title
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.blue);
        //set the border to the jPanel_title
        jPanel_title.setBorder(jpanel_title_border);
        
        //create an orange border for the global panels
        Border glob_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue);
        jPanel_title.setBorder(glob_panel_border);
        
        //create a black border for the close & minimize jlables
        Border label_min_close_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_min.setBorder(label_min_close_border);
        jLabel_close.setBorder(label_min_close_border);
        
        //create border for the username and password field
        Border field_border = BorderFactory.createMatteBorder(1, 2, 1, 1, Color.pink);
        jTextField_FullNameReg.setBorder(field_border);
        jTextField_UsernameReg.setBorder(field_border);
        jTextField_PasswordReg.setBorder(field_border);
        jTextField_ConfPassReg.setBorder(field_border);
        jTextField_PhoneReg.setBorder(field_border);
        
        //create a button group for the radiobuttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_MaleReg);
        bg.add(jRadioButton_FemaleReg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_title = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_min = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jButton_Registrasi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel_UserNameReg = new javax.swing.JLabel();
        jLabel_PasswordReg = new javax.swing.JLabel();
        jLabel_FullNameReg = new javax.swing.JLabel();
        jLabel_ConfPassReg = new javax.swing.JLabel();
        jLabel_PhoneReg = new javax.swing.JLabel();
        jLabel_GenderReg = new javax.swing.JLabel();
        jLabel_ImageReg = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField_UsernameReg = new javax.swing.JTextField();
        jTextField_FullNameReg = new javax.swing.JTextField();
        jTextField_PasswordReg = new javax.swing.JTextField();
        jTextField_ConfPassReg = new javax.swing.JTextField();
        jTextField_PhoneReg = new javax.swing.JTextField();
        jRadioButton_MaleReg = new javax.swing.JRadioButton();
        jRadioButton_FemaleReg = new javax.swing.JRadioButton();
        jLabel_ImagePathReg = new javax.swing.JLabel();
        jButton_SelectImageReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRASI");

        jLabel_min.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_min.setText("  -");
        jLabel_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_close.setText("  X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel_min, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_min)
                    .addComponent(jLabel_close))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_Registrasi.setBackground(new java.awt.Color(255, 255, 51));
        jButton_Registrasi.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButton_Registrasi.setForeground(new java.awt.Color(102, 102, 255));
        jButton_Registrasi.setText("Registrasi");
        jButton_Registrasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrasiActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 255, 204));

        jLabel_UserNameReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel_UserNameReg.setText("UserName");

        jLabel_PasswordReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel_PasswordReg.setText("Password");

        jLabel_FullNameReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel_FullNameReg.setText("FullName");

        jLabel_ConfPassReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel_ConfPassReg.setText("Confirm Password");

        jLabel_PhoneReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel_PhoneReg.setText("Phone");

        jLabel_GenderReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel_GenderReg.setText("Gender");

        jLabel_ImageReg.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel_ImageReg.setText("Image");

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel13.setText(":");

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel14.setText(":");

        jLabel15.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel15.setText(":");

        jTextField_PasswordReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PasswordRegActionPerformed(evt);
            }
        });

        jTextField_PhoneReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneRegKeyTyped(evt);
            }
        });

        jRadioButton_MaleReg.setText("Male");
        jRadioButton_MaleReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleRegActionPerformed(evt);
            }
        });

        jRadioButton_FemaleReg.setText("Female");

        jLabel_ImagePathReg.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        jLabel_ImagePathReg.setText("Image Path");

        jButton_SelectImageReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_SelectImageReg.setText("Select Image");
        jButton_SelectImageReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SelectImageRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_FullNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_UserNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_PasswordReg, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ConfPassReg)
                    .addComponent(jLabel_PhoneReg)
                    .addComponent(jLabel_GenderReg)
                    .addComponent(jLabel_ImageReg))
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_FullNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PhoneReg, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ConfPassReg, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_PasswordReg, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_UsernameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jButton_SelectImageReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_ImagePathReg))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jRadioButton_MaleReg)
                            .addGap(47, 47, 47)
                            .addComponent(jRadioButton_FemaleReg))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_FullNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_UserNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_PasswordReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_ConfPassReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_PhoneReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_GenderReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ImageReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTextField_FullNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_UsernameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PasswordReg, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ConfPassReg, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PhoneReg, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_MaleReg)
                    .addComponent(jRadioButton_FemaleReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ImagePathReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SelectImageReg))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jButton_Registrasi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jButton_Registrasi)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minMouseClicked

    private void jLabel_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseEntered
        // TODO add your handling code here:
        Border label_min_close_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_min.setBorder(label_min_close_border);
        jLabel_min.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minMouseEntered

    private void jLabel_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minMouseExited
        // TODO add your handling code here:
        Border label_min_close_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_min.setBorder(label_min_close_border);
        jLabel_min.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_minMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here:
        Border label_min_close_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_min_close_border);
        jLabel_close.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:
        Border label_min_close_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_min_close_border);
        jLabel_close.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jButton_RegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RegistrasiActionPerformed

    private void jRadioButton_MaleRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleRegActionPerformed

    private void jTextField_PasswordRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PasswordRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PasswordRegActionPerformed

    private void jTextField_PhoneRegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneRegKeyTyped
        //allow only numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneRegKeyTyped

    private void jButton_SelectImageRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SelectImageRegActionPerformed
        // select an image and set the image path into a jlabel
        String path = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        //File Extension
        FileNameExtensionFilter extension = new FileNameExtensionFilter("Images", "jpg", "png", "jpeg");
        chooser.addChoosableFileFilter(extension);
        
        int filestate = chooser.showSaveDialog(null);
        
        //check if the user select an image
        if(filestate == JFileChooser.APPROVE_OPTION){
            File selectedImage = chooser.getSelectedFile();
            path = selectedImage.getAbsolutePath();
            jLabel_ImagePathReg.setText(path);
        }
    }//GEN-LAST:event_jButton_SelectImageRegActionPerformed

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
            java.util.logging.Logger.getLogger(Registrasi_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Registrasi;
    private javax.swing.JButton jButton_SelectImageReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_ConfPassReg;
    private javax.swing.JLabel jLabel_FullNameReg;
    private javax.swing.JLabel jLabel_GenderReg;
    private javax.swing.JLabel jLabel_ImagePathReg;
    private javax.swing.JLabel jLabel_ImageReg;
    private javax.swing.JLabel jLabel_PasswordReg;
    private javax.swing.JLabel jLabel_PhoneReg;
    private javax.swing.JLabel jLabel_UserNameReg;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_min;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JRadioButton jRadioButton_FemaleReg;
    private javax.swing.JRadioButton jRadioButton_MaleReg;
    private javax.swing.JTextField jTextField_ConfPassReg;
    private javax.swing.JTextField jTextField_FullNameReg;
    private javax.swing.JTextField jTextField_PasswordReg;
    private javax.swing.JTextField jTextField_PhoneReg;
    private javax.swing.JTextField jTextField_UsernameReg;
    // End of variables declaration//GEN-END:variables
}
