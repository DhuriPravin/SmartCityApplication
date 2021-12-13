/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.JobRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.JobOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Citizen.CitizensDirectory;
import Business.WorkQueue.JobWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.ViewAllCitizens;

/**
 *
 * @author manis
 */
public class JobWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form JobWorkAreaJPanel
     */
    JPanel userProcessContainer; 
    UserAccount account; 
    Organization organization; 
    Enterprise enterprise; 
    EcoSystem business; 
    CitizensDirectory cd;
    UserAccountDirectory user_Dir;
    public JobWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise,CitizensDirectory cd,EcoSystem business) 
    {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = (JobOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        this.cd = cd;
        populateTable();
        System.out.println("after call PopulateTable");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        txtWelcome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalRequests1 = new javax.swing.JLabel();
        txtAcc = new javax.swing.JLabel();
        txtRej = new javax.swing.JLabel();
        txtPend = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotalRequests2 = new javax.swing.JLabel();
        txtAcc1 = new javax.swing.JLabel();
        txtRej1 = new javax.swing.JLabel();
        txtPend1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnViewAllVeterans = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Job Application Admin Dashboard");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 340, 30));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Course", "Highest Graduate Level", "Campus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 880, 90));

        assignJButton.setBackground(new java.awt.Color(20, 53, 95));
        assignJButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 120, 35));

        processJButton.setBackground(new java.awt.Color(204, 204, 204));
        processJButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        processJButton.setText("Process");
        processJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 120, 35));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 120, 35));

        txtWelcome.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtWelcome.setFocusable(false);
        txtWelcome.setOpaque(true);
        jPanel1.add(txtWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 580, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Overall - Across Organization");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setFocusable(false);
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 220, 50));

        txtTotalRequests1.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalRequests1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotalRequests1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalRequests1.setFocusable(false);
        txtTotalRequests1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtTotalRequests1.setOpaque(true);
        jPanel1.add(txtTotalRequests1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, 34));

        txtAcc.setBackground(new java.awt.Color(204, 204, 204));
        txtAcc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAcc.setFocusable(false);
        txtAcc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtAcc.setOpaque(true);
        jPanel1.add(txtAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 60, 34));

        txtRej.setBackground(new java.awt.Color(204, 204, 204));
        txtRej.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRej.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRej.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRej.setFocusable(false);
        txtRej.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtRej.setOpaque(true);
        jPanel1.add(txtRej, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 60, 34));

        txtPend.setBackground(new java.awt.Color(204, 204, 204));
        txtPend.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPend.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPend.setFocusable(false);
        txtPend.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPend.setOpaque(true);
        jPanel1.add(txtPend, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 60, 34));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Total Requests");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setFocusable(false);
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Total Accepted");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setFocusable(false);
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Total Rejected");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setFocusable(false);
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Total Pending");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.setFocusable(false);
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("My Requests");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setFocusable(false);
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 200, 40));

        txtTotalRequests2.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalRequests2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtTotalRequests2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalRequests2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotalRequests2.setFocusable(false);
        txtTotalRequests2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtTotalRequests2.setOpaque(true);
        jPanel1.add(txtTotalRequests2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 60, 34));

        txtAcc1.setBackground(new java.awt.Color(204, 204, 204));
        txtAcc1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAcc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAcc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAcc1.setFocusable(false);
        txtAcc1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtAcc1.setOpaque(true);
        jPanel1.add(txtAcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 60, 34));

        txtRej1.setBackground(new java.awt.Color(204, 204, 204));
        txtRej1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtRej1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRej1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtRej1.setFocusable(false);
        txtRej1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtRej1.setOpaque(true);
        jPanel1.add(txtRej1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 60, 34));

        txtPend1.setBackground(new java.awt.Color(204, 204, 204));
        txtPend1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPend1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPend1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPend1.setFocusable(false);
        txtPend1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtPend1.setOpaque(true);
        jPanel1.add(txtPend1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 60, 34));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Total Requests");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setFocusable(false);
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Total Accepted");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.setFocusable(false);
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Total Rejected");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setFocusable(false);
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Total Pending");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.setFocusable(false);
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, -1, -1));

        btnViewAllVeterans.setBackground(new java.awt.Color(20, 53, 94));
        btnViewAllVeterans.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnViewAllVeterans.setText("View Citizens");
        btnViewAllVeterans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllVeteransActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAllVeterans, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 120, 35));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/job.jpeg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

     public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
       

        model.setRowCount(0);
        System.out.println("Inside PopulateTable");
        int totalRequests = 0;
        int acceptedRequests = 0;
        int rejectedRequests = 0;
        int pendingRequests = 0;
        int totalRequestsUser = 0;
        int acceptedRequestsUser = 0;
        int rejectedRequestsUser = 0;
        int pendingRequestsUser = 0;
        int unassignedReq = 0;

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            //if (request instanceof JobWorkRequest)
            {
                totalRequests = totalRequests + 1;
                System.out.println("Inside LOOP");
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeeName();
                row[3] = request.getStatus();
                row[4] = ((JobWorkRequest) request).getAreaofInterest();
                row[5] = ((JobWorkRequest) request).getHighestQualification();
                row[6] = ((JobWorkRequest) request).getCampus();
                if (request.getReceiver() == null) {
                    unassignedReq = unassignedReq + 1;
                } else if (request.getReceiver().getEmployee().equals(account.getEmployee())) {
                    totalRequestsUser = totalRequestsUser + 1;
                    if (request.getStatus().equals("Approved")) {
                        acceptedRequestsUser = acceptedRequestsUser + 1;
                    } else if (request.getStatus().equals("Rejected")) {
                        rejectedRequestsUser = rejectedRequestsUser + 1;
                    } else {
                        pendingRequestsUser = pendingRequestsUser + 1;
                    }

                }

                if (request.getStatus() == null) {
                    pendingRequests = pendingRequests + 1;
                } else if (request.getStatus().equals("Approved")) {
                    acceptedRequests = acceptedRequests + 1;
                } else if (request.getStatus().equals("Rejected")) {
                    rejectedRequests = rejectedRequests + 1;
                }
                model.addRow(row);
            }
            txtTotalRequests1.setText(Integer.toString(totalRequests));
            txtAcc.setText(Integer.toString(acceptedRequests));
            txtRej.setText(Integer.toString(rejectedRequests));
            txtPend.setText(Integer.toString(pendingRequests));

            txtTotalRequests2.setText(Integer.toString(totalRequestsUser));
            txtAcc1.setText(Integer.toString(acceptedRequestsUser));
            txtRej1.setText(Integer.toString(rejectedRequestsUser));
            txtPend1.setText(Integer.toString(pendingRequestsUser));
        }
    }
    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        JobWorkRequest request = (JobWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equalsIgnoreCase("Approved") || request.getStatus().equalsIgnoreCase("Rejected")) {
            JOptionPane.showMessageDialog(null, "Already Processed!!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
            //btnReject.setEnabled(false);
        }

        if (request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equals(null)) {
            request.setStatus("Processing");
        }

        ProcessJobWorkRequestJPanel processWorkRequestJPanel = new ProcessJobWorkRequestJPanel(userProcessContainer, request, business);
        userProcessContainer.add("ProcessJobWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnViewAllVeteransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllVeteransActionPerformed
        // TODO add your handling code here:
        ViewAllCitizens vc = new ViewAllCitizens(userProcessContainer, business, cd);
        userProcessContainer.add("ViewAllCitizens", vc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewAllVeteransActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnViewAllVeterans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel txtAcc;
    private javax.swing.JLabel txtAcc1;
    private javax.swing.JLabel txtPend;
    private javax.swing.JLabel txtPend1;
    private javax.swing.JLabel txtRej;
    private javax.swing.JLabel txtRej1;
    private javax.swing.JLabel txtTotalRequests1;
    private javax.swing.JLabel txtTotalRequests2;
    private javax.swing.JLabel txtWelcome;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
