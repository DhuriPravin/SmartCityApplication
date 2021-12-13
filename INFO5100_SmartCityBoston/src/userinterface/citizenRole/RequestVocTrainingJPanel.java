/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.citizenRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PermHousingOrganization;
import Business.Organization.CitizenOrganization;
import Business.Organization.VocationalSchoolOrganization;
import Business.UserAccount.UserAccount;
import Business.Citizen.CitizensDirectory;
import Business.WorkQueue.VocationalTrainingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pravin
 */
public class RequestVocTrainingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestVocTrainingJPanel
     */
    private JPanel userProcessContainer;
    private CitizenOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private CitizensDirectory cd;

    RequestVocTrainingJPanel(JPanel userProcessContainer, UserAccount userAccount, CitizensDirectory cd, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.cd = cd;
        this.userAccount = userAccount;
        this.system = system;

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
        jLabel2 = new javax.swing.JLabel();
        fundingAssistanceComboBox = new javax.swing.JComboBox<>();
        campusComboBox = new javax.swing.JComboBox<>();
        coursesComboBox = new javax.swing.JComboBox<>();
        educationComboBox = new javax.swing.JComboBox<>();
        txtSubmit = new javax.swing.JButton();
        txtAdditionalSkills = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apply for Passion Courses");
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 301, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ignite Your Passion!!!  Passion courses offer relatively short, career-focused programs that quickly prepare you for the workforce.");
        jLabel2.setFocusable(false);
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 620, 23));

        fundingAssistanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        fundingAssistanceComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fundingAssistanceComboBox.setPreferredSize(new java.awt.Dimension(30, 25));
        add(fundingAssistanceComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 169, -1));

        campusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Online", "Boston", "New Jersey", "Phoenix" }));
        campusComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campusComboBox.setPreferredSize(new java.awt.Dimension(30, 25));
        campusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campusComboBoxActionPerformed(evt);
            }
        });
        add(campusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 169, -1));

        coursesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Photography", "Baking", "Painting", "Music", "Dance" }));
        coursesComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        coursesComboBox.setPreferredSize(new java.awt.Dimension(30, 25));
        coursesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesComboBoxActionPerformed(evt);
            }
        });
        add(coursesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 136, 169, -1));

        educationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High School", "High School Diploma", "Bachelors", "Masters" }));
        educationComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        educationComboBox.setPreferredSize(new java.awt.Dimension(30, 25));
        add(educationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 169, -1));

        txtSubmit.setBackground(new java.awt.Color(51, 51, 51));
        txtSubmit.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtSubmit.setForeground(new java.awt.Color(255, 255, 255));
        txtSubmit.setText("Submit");
        txtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubmitActionPerformed(evt);
            }
        });
        add(txtSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 179, 33));

        txtAdditionalSkills.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAdditionalSkills.setPreferredSize(new java.awt.Dimension(30, 25));
        add(txtAdditionalSkills, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 169, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Area of Interest : ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 25));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 136, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Campus : ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 25));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Highest Qualification : ");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 25));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Funding Required? : ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 25));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Additional Information : ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 25));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        backJButton.setBackground(new java.awt.Color(51, 51, 51));
        backJButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 563, -1, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fp.jpeg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void coursesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesComboBoxActionPerformed

    private void txtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubmitActionPerformed
        // TODO add your handling code here:

        VocationalTrainingRequest request = new VocationalTrainingRequest();
        request.setMessage(txtAdditionalSkills.getText());
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setAreaofInterest((String) coursesComboBox.getSelectedItem());
        request.setHighestQualification((String) educationComboBox.getSelectedItem());
        request.setCampus((String) campusComboBox.getSelectedItem());
        request.setFundingRequired((String) fundingAssistanceComboBox.getSelectedItem());
        request.setAdditionalComments(txtAdditionalSkills.getText());

        String message = "User: " + userAccount.getUsername() + " raised a request for " + (String) coursesComboBox.getSelectedItem() + " at " + (String) campusComboBox.getSelectedItem() + " Campus";
        try {
            URL yahoo = new URL("https://api.telegram.org/bot886367737:AAE0-wbD4ww50nkPy7M-6KKrMtN2sg70z_Q/sendMessage?chat_id=@AED_Helper&text=" + message);
            URLConnection yc = yahoo.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            yc.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Oops Something went wrong.");

        }

        Organization org = null;
        System.out.println("Collected Variables");
        System.out.println(coursesComboBox.getSelectedItem());

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println(enterprise);

//                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    System.out.println(organization);

                    if (organization instanceof VocationalSchoolOrganization) {
                        org = organization;

                        System.out.println(org);
                        break;
                    }

                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added VocationalRequest to Org");
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added VocationalRequest to UserAccount");

            JOptionPane.showMessageDialog(null, "Request Submitted Successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_txtSubmitActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CitizenWorkAreaJPanel cwjp = (CitizenWorkAreaJPanel) component;
        cwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void campusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campusComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> campusComboBox;
    private javax.swing.JComboBox<String> coursesComboBox;
    private javax.swing.JComboBox<String> educationComboBox;
    private javax.swing.JComboBox<String> fundingAssistanceComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAdditionalSkills;
    private javax.swing.JButton txtSubmit;
    // End of variables declaration//GEN-END:variables
}
