/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GradSchoolRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.GradSchoolOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Citizen.CitizensDirectory;
import Business.WorkQueue.GradSchoolRequest;
import Business.WorkQueue.VocationalTrainingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.ViewAllCitizens;
//import userinterface.SystemAdminWorkArea.ViewAllCitizens;

/**
 *
 * @author manis
 */
public class GradSchoolWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GradSchoolWorkAreaJPanel
     */
    private JPanel processContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private final Organization gradSchoolOrganization;
    private CitizensDirectory cd;
    private Enterprise enterprise;
//    private EcoSystem business;

    public GradSchoolWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization gradSchoolOrganization, Enterprise enterprise, CitizensDirectory cd, EcoSystem business) {
        initComponents();

        this.processContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.gradSchoolOrganization = (GradSchoolOrganization) gradSchoolOrganization;
        this.enterprise = enterprise;
        this.cd = cd;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);


        int totalRequests = 0;
        int acceptedRequests = 0;
        int rejectedRequests = 0;
        int pendingRequests = 0;
        int totalRequestsUser = 0;
        int acceptedRequestsUser = 0;
        int rejectedRequestsUser = 0;
        int pendingRequestsUser = 0;
        int unassignedRequests = 0;

        for (WorkRequest request : gradSchoolOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof GradSchoolRequest) {
                totalRequests = totalRequests + 1;
                Object[] row = new Object[8];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeeName();
                row[3] = request.getStatus();
                row[4] = ((GradSchoolRequest) request).getDesUniv();
                row[5] = ((GradSchoolRequest) request).getDesProgram();
                row[6] = ((GradSchoolRequest) request).getBachelorUniv();
                row[7] = ((GradSchoolRequest) request).getBachelorGrade();

                if (request.getReceiver() == null) {
                    unassignedRequests = unassignedRequests + 1;
                } else if (request.getReceiver().getEmployee().equals(userAccount.getEmployee())) {
                    totalRequestsUser = totalRequestsUser + 1;
                    if (request.getStatus().equals("Accepted")) {
                        acceptedRequestsUser = acceptedRequestsUser + 1;
                    } else if (request.getStatus().equals("Rejected")) {
                        rejectedRequestsUser = rejectedRequestsUser + 1;
                    } else {
                        pendingRequestsUser = pendingRequestsUser + 1;
                    }

                }

                if (request.getStatus().equals("Accepted")) {
                    acceptedRequests = acceptedRequests + 1;
                } else if (request.getStatus().equals("Rejected")) {
                    rejectedRequests = rejectedRequests + 1;
                } else {
                    pendingRequests = pendingRequests + 1;
                }

                model.addRow(row);
            }

            txtTotalRequests.setText(Integer.toString(totalRequests));
            txtAccepted.setText(Integer.toString(acceptedRequests));
            txtRejection.setText(Integer.toString(rejectedRequests));
            txtPending.setText(Integer.toString(pendingRequests));

            txtTotalRequests1.setText(Integer.toString(totalRequestsUser));
            txtAccepted1.setText(Integer.toString(acceptedRequestsUser));
            txtRejected1.setText(Integer.toString(rejectedRequestsUser));
            txtPending1.setText(Integer.toString(pendingRequestsUser));

            txtWelcome.setText("Welcome back, " + userAccount.getEmployee().getEmployeeName() + "! There are " + (Integer.toString(unassignedRequests)) + " unassigned request(s) for review & " + (Integer.toString(pendingRequests)) + " in your queue.");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAccepted = new javax.swing.JLabel();
        txtWelcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalRequests = new javax.swing.JLabel();
        txtRejection = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalRequests1 = new javax.swing.JLabel();
        txtAccepted1 = new javax.swing.JLabel();
        txtRejected1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPending = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPending1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        btnViewAllCitizens = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAccepted.setBackground(new java.awt.Color(153, 255, 255));
        txtAccepted.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAccepted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAccepted.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAccepted.setFocusable(false);
        txtAccepted.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtAccepted, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 60, 30));

        txtWelcome.setBackground(new java.awt.Color(204, 204, 255));
        txtWelcome.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtWelcome.setFocusable(false);
        add(txtWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 580, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Requests");
        jLabel3.setFocusable(false);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtTotalRequests.setBackground(new java.awt.Color(153, 255, 255));
        txtTotalRequests.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotalRequests.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTotalRequests.setFocusable(false);
        txtTotalRequests.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtTotalRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, 30));

        txtRejection.setBackground(new java.awt.Color(153, 255, 255));
        txtRejection.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRejection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRejection.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRejection.setFocusable(false);
        txtRejection.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtRejection, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Overall - Across Organization");
        jLabel4.setFocusable(false);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Accepted");
        jLabel5.setFocusable(false);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Rejected");
        jLabel6.setFocusable(false);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txtTotalRequests1.setBackground(new java.awt.Color(153, 153, 255));
        txtTotalRequests1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotalRequests1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTotalRequests1.setFocusable(false);
        txtTotalRequests1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtTotalRequests1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, 30));

        txtAccepted1.setBackground(new java.awt.Color(153, 153, 255));
        txtAccepted1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAccepted1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAccepted1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAccepted1.setFocusable(false);
        txtAccepted1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtAccepted1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 60, 30));

        txtRejected1.setBackground(new java.awt.Color(153, 153, 255));
        txtRejected1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRejected1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRejected1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRejected1.setFocusable(false);
        txtRejected1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtRejected1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 60, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Rejected");
        jLabel7.setFocusable(false);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, 20));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Accepted");
        jLabel8.setFocusable(false);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, 10));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Requests");
        jLabel9.setFocusable(false);
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 10));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("My Requests");
        jLabel10.setFocusable(false);
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        txtPending.setBackground(new java.awt.Color(153, 255, 255));
        txtPending.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPending.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPending.setFocusable(false);
        txtPending.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 60, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Pending");
        jLabel11.setFocusable(false);
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        txtPending1.setBackground(new java.awt.Color(153, 153, 255));
        txtPending1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPending1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPending1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPending1.setFocusable(false);
        txtPending1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(txtPending1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 60, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Pending");
        jLabel12.setFocusable(false);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Admin Graduation Portal");
        jLabel13.setFocusable(false);
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 250, 40));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bachelor's University", "Sender", "Receiver", "Status", "University", "Program", "Bachelor's University", "GPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 610, 90));

        refreshJButton.setBackground(new java.awt.Color(153, 153, 153));
        refreshJButton.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 150, 25));

        assignJButton.setBackground(new java.awt.Color(153, 153, 153));
        assignJButton.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 150, 25));

        processJButton.setBackground(new java.awt.Color(153, 153, 153));
        processJButton.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 150, 25));

        btnViewAllCitizens.setBackground(new java.awt.Color(153, 153, 153));
        btnViewAllCitizens.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnViewAllCitizens.setText("View Citizen");
        btnViewAllCitizens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllCitizensActionPerformed(evt);
            }
        });
        add(btnViewAllCitizens, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 150, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/grad.JPG"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {

            JOptionPane.showMessageDialog(null, "Please select a record to proceed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a record to process", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        GradSchoolRequest request = (GradSchoolRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equals(null)) {
            request.setStatus("Processing");
        }
        ProcessGradReqJPanel processGradReqJPanel = new ProcessGradReqJPanel(processContainer, request, cd, business);
        processContainer.add("processGradReqJPanel", processGradReqJPanel);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void btnViewAllCitizensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllCitizensActionPerformed
        // TODO add your handling code here:
        ViewAllCitizens vc = new ViewAllCitizens(processContainer, business, cd);
        processContainer.add("ViewAllCitizens", vc);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_btnViewAllCitizensActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnViewAllCitizens;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel txtAccepted;
    private javax.swing.JLabel txtAccepted1;
    private javax.swing.JLabel txtPending;
    private javax.swing.JLabel txtPending1;
    private javax.swing.JLabel txtRejected1;
    private javax.swing.JLabel txtRejection;
    private javax.swing.JLabel txtTotalRequests;
    private javax.swing.JLabel txtTotalRequests1;
    private javax.swing.JLabel txtWelcome;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
