/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.UserAccount.UserAccountDirectory;
import Business.Citizen.CitizensDirectory;
import java.awt.CardLayout;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.RegisterCitizen;
import userinterface.SystemAdminWorkArea.ViewAllCitizens;

/**
 *
 * @author manis
 */
public class GuestUserJPanel extends javax.swing.JPanel {
EcoSystem system;
JPanel container;
UserAccountDirectory user_Dir;
CitizensDirectory citizens_Di;
    /**
     * Creates new form GuestUserJPanel
     */
    public GuestUserJPanel() {
        initComponents();
    }

   
    GuestUserJPanel(JPanel container, EcoSystem system, CitizensDirectory citizens_Di, UserAccountDirectory user_Dir) {
         initComponents();
       this.system =  system;
       this.citizens_Di =citizens_Di;
       this.user_Dir= user_Dir;
       this.container=container;
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
        RegisterCitizenButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guest User Dashboard");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 300, 43));

        RegisterCitizenButton.setBackground(new java.awt.Color(43, 0, 0));
        RegisterCitizenButton.setFont(new java.awt.Font("Sitka Small", 3, 18)); // NOI18N
        RegisterCitizenButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterCitizenButton.setText("Register Citizen");
        RegisterCitizenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCitizenButtonActionPerformed(evt);
            }
        });
        add(RegisterCitizenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 245, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Loginframe.jpeg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterCitizenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCitizenButtonActionPerformed
        // TODO add your handling code here:
        RegisterCitizen rc = new RegisterCitizen(container,system, citizens_Di, user_Dir);
        container.add("RegisterCitizens", rc);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_RegisterCitizenButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterCitizenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
