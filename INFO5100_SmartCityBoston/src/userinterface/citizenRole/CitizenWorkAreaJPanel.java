/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.citizenRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PermHousingOrganization;
import Business.Organization.CitizenOrganization;
import Business.UserAccount.UserAccount;
import Business.Citizen.CitizensDirectory;
import Business.WorkQueue.GradSchoolRequest;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.PermHousingRequest;
import Business.WorkQueue.TempHousingRequest;
import Business.WorkQueue.VocationalTrainingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import static java.time.Clock.system;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.BackgroundPanel;
import userinterface.Tourism.RegisterTour;


/**
 *
 * @author manis
 */
public class CitizenWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CitizenOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private CitizensDirectory cd;
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form VeteranWorkAreaJPanel
     */
    public CitizenWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, CitizenOrganization organization, Enterprise enterprise, CitizensDirectory cd) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        populateRequestTable();
        
    }

    public CitizenWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, CitizensDirectory cd, EcoSystem system) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.cd = cd;
        this.userAccount = userAccount;
        this.system = system;

//        system = dB4OUtil.retrieveSystem();
        populateRequestTable();
//        populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        permhousingrequestjButton = new javax.swing.JButton();
        VocationalRequestJButton = new javax.swing.JButton();
        GradRequestJButton = new javax.swing.JButton();
        TourismJButton = new javax.swing.JButton();
        txtWelcome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        permhousingrequestjButton1 = new javax.swing.JButton();
        txtTotalRequests1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eduRequestsTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshTestJButton.setBackground(new java.awt.Color(102, 102, 102));
        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 100, 30));

        permhousingrequestjButton.setBackground(new java.awt.Color(169, 95, 100));
        permhousingrequestjButton.setForeground(new java.awt.Color(255, 255, 255));
        permhousingrequestjButton.setText("Click here to find your Next Home!");
        permhousingrequestjButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        permhousingrequestjButton.setPreferredSize(new java.awt.Dimension(152, 32));
        permhousingrequestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permhousingrequestjButtonActionPerformed(evt);
            }
        });
        add(permhousingrequestjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 280, 30));

        VocationalRequestJButton.setBackground(new java.awt.Color(169, 95, 100));
        VocationalRequestJButton.setForeground(new java.awt.Color(255, 255, 255));
        VocationalRequestJButton.setText("Click to pursue a Course for your Passion ");
        VocationalRequestJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        VocationalRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VocationalRequestJButtonActionPerformed(evt);
            }
        });
        add(VocationalRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 280, 30));

        GradRequestJButton.setBackground(new java.awt.Color(169, 95, 100));
        GradRequestJButton.setForeground(new java.awt.Color(255, 255, 255));
        GradRequestJButton.setText("Click to Apply for Dream Grad School");
        GradRequestJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        GradRequestJButton.setPreferredSize(new java.awt.Dimension(152, 32));
        GradRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradRequestJButtonActionPerformed(evt);
            }
        });
        add(GradRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 280, 30));

        TourismJButton.setBackground(new java.awt.Color(169, 95, 100));
        TourismJButton.setForeground(new java.awt.Color(255, 255, 255));
        TourismJButton.setText("Click to Your next favourite Tourism site!");
        TourismJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        TourismJButton.setPreferredSize(new java.awt.Dimension(152, 32));
        TourismJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TourismJButtonActionPerformed(evt);
            }
        });
        add(TourismJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 270, 30));

        txtWelcome.setBackground(new java.awt.Color(255, 255, 255));
        txtWelcome.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtWelcome.setOpaque(true);
        add(txtWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 330, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Total Requests Raised");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 300, -1));

        permhousingrequestjButton1.setBackground(new java.awt.Color(169, 95, 100));
        permhousingrequestjButton1.setForeground(new java.awt.Color(255, 255, 255));
        permhousingrequestjButton1.setText("Click here to find your temporary Bachelor Pad!");
        permhousingrequestjButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        permhousingrequestjButton1.setPreferredSize(new java.awt.Dimension(152, 32));
        permhousingrequestjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permhousingrequestjButton1ActionPerformed(evt);
            }
        });
        add(permhousingrequestjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 280, 30));

        txtTotalRequests1.setBackground(new java.awt.Color(153, 153, 153));
        txtTotalRequests1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTotalRequests1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTotalRequests1.setFocusable(false);
        txtTotalRequests1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtTotalRequests1.setOpaque(true);
        add(txtTotalRequests1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 110, 70));

        eduRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RequestType", "AssignedTo", "Status", "RequestedOn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(eduRequestsTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 410, 90));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("My Requests");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 300, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Plan ahead for higher education, apply for accomodation or plan your trip all through this portal!");
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 750, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("A Better Learning Future Starts Here!");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 330, 25));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Let us Guide you Home!");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 330, 25));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Make your Bookings to roam around the City!");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 350, 25));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/b1.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();


    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void permhousingrequestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permhousingrequestjButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestPermHousingJPanel", new RequestPermHousingJPanel(userProcessContainer, userAccount, cd, system));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_permhousingrequestjButtonActionPerformed

    private void VocationalRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VocationalRequestJButtonActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestVocTrainingJPanel", new RequestVocTrainingJPanel(userProcessContainer, userAccount, cd, system));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_VocationalRequestJButtonActionPerformed

    private void GradRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradRequestJButtonActionPerformed
        // TODO add your handling code here

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestGradJPanel", new RequestGradJPanel(userProcessContainer, userAccount, cd, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_GradRequestJButtonActionPerformed

    private void TourismJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TourismJButtonActionPerformed
  CardLayout layout = (CardLayout) userProcessContainer.getLayout();
  userProcessContainer.add("RegisterTour", new RegisterTour(userProcessContainer, userAccount, cd, system));
  layout.next(userProcessContainer);
    }//GEN-LAST:event_TourismJButtonActionPerformed

    private void permhousingrequestjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permhousingrequestjButton1ActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestTempHousingJPanel", new RequestTempHousingJPanel(userProcessContainer, userAccount, cd, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_permhousingrequestjButton1ActionPerformed

    public void populateRequestTable() {

        txtWelcome.setText("Welcome back, " + userAccount.getUsername());


        DefaultTableModel eduModel = (DefaultTableModel) eduRequestsTable.getModel();
         eduModel.setRowCount(0);
        int totalRequests = 0;
        int acceptedRequests = 0;
        int rejectedRequests = 0;



        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            totalRequests = totalRequests + 1;

            if (request instanceof VocationalTrainingRequest) {
                Object[] row = new Object[4];
                row[0] = "VocationalTraining";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();

                row[3] = request.getRequestDate();

                eduModel.addRow(row);
            }

            if (request instanceof GradSchoolRequest) {
                Object[] row = new Object[4];
                row[0] = "Grad School";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();

                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

            if (request instanceof TempHousingRequest) {
                Object[] row = new Object[4];
                row[0] = "Temp Housing";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

            if (request instanceof PermHousingRequest) {
                Object[] row = new Object[4];
                row[0] = "Permanent Housing";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }

            if (request instanceof JobWorkRequest) {
                Object[] row = new Object[4];
                row[0] = "Employment Request";
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                row[3] = request.getRequestDate();
                eduModel.addRow(row);
            }


        }

        txtTotalRequests1.setText(Integer.toString(totalRequests));
    

    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GradRequestJButton;
    private javax.swing.JButton TourismJButton;
    private javax.swing.JButton VocationalRequestJButton;
    private javax.swing.JTable eduRequestsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton permhousingrequestjButton;
    private javax.swing.JButton permhousingrequestjButton1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel txtTotalRequests1;
    private javax.swing.JLabel txtWelcome;
    // End of variables declaration//GEN-END:variables
}
