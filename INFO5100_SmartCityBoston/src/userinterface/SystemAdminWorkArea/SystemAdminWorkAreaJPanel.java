/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GradSchoolOrganization;
import Business.Organization.Organization;
import Business.Organization.PermHousingOrganization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.Citizen.CitizensDirectory;
import Business.WorkQueue.GradSchoolRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author manis
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel processContainer;
    EcoSystem ecosystem;
    CitizensDirectory cd;
    UserAccountDirectory user_Dir;
    private FileWriter writer;
    private File file;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CitizensDirectory cd, UserAccountDirectory user_Dir) throws IOException {
        initComponents();
        this.processContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.cd = cd;
        this.user_Dir = user_Dir;

        populateTree();
        genFile();
        getEduFile();

    }

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        ArrayList<Network> networkList = ecosystem.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;

        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(i);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }

    public void getEduFile() throws IOException {

        String USER_HEADER = "Sender,receiver,requestDate,resolveDate,status,desUni,desProgram,bachGrade,hsGrade,bachProg";
        String LINE_BREAK = "\n";
        String USER_CAT_PATH = "/Users/pravin/Downloads/SmartCityApplication-main/gradStats.csv";

        file = new File(USER_CAT_PATH);
        if (file.exists()) {
            file.delete();
        }

        file.createNewFile();
        System.out.println("New Edu File Created");
        writer = new FileWriter(file);

        writer.append(USER_HEADER);
        writer.append(LINE_BREAK);

        for (Network network
                : ecosystem.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {

                        if (request instanceof GradSchoolRequest) {
                            String column = request.getSender() + "," + request.getReceiver() + "," + request.getRequestDate() + "," + request.getResolveDate() + "," + request.getStatus() + "," + ((GradSchoolRequest) request).getDesUniv() + "," + ((GradSchoolRequest) request).getDesProgram() + "," + ((GradSchoolRequest) request).getBachelorDegree() + "," + ((GradSchoolRequest) request).getHighschoolGrade() + "," + ((GradSchoolRequest) request).getBachelorDegree();

                            writer.append(column);
                            writer.append(LINE_BREAK);
                            System.out.println(column);
                        }
                    }
                }
            }
        }
        writer.flush();
        writer.close();
    }


    public void genFile() throws IOException {

        String USER_HEADER = "org,sender,receiver,requestDate,resolvedDate,status";
        String LINE_BREAK = "\n";
        String USER_CAT_PATH = "/Users/pravin/Downloads/SmartCityApplication-main/stats.csv";

        file = new File(USER_CAT_PATH);
        if (file.exists()) {
            file.delete();
        }

        file.createNewFile();
        System.out.println("New OverallStats File Created");
        writer = new FileWriter(file);

        writer.append(USER_HEADER);
        writer.append(LINE_BREAK);

        for (Network network
                : ecosystem.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                        String column = organization + "," + request.getSender() + "," + request.getReceiver() + "," + request.getRequestDate() + "," + request.getResolveDate() + "," + request.getStatus();

                        writer.append(column);
                        writer.append(LINE_BREAK);
                        System.out.println(column);

                    }
                }
            }
        }
        writer.flush();
        writer.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        btnRegisterCitizen = new javax.swing.JButton();
        btnViewAllCitizen = new javax.swing.JButton();
        pictureArea1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonManage = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 556));

        jTree.setBackground(new java.awt.Color(102, 102, 102));
        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Selected Node:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 120, 20));

        lblSelectedNode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSelectedNode.setText("<View_selected_node>");
        jPanel2.add(lblSelectedNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 90, 160, 20));

        btnManageNetwork.setBackground(new java.awt.Color(102, 102, 102));
        btnManageNetwork.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnManageNetwork.setForeground(new java.awt.Color(0, 51, 102));
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, 30));

        btnManageEnterprise.setBackground(new java.awt.Color(102, 102, 102));
        btnManageEnterprise.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnManageEnterprise.setForeground(new java.awt.Color(0, 51, 102));
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 200, 30));

        btnManageAdmin.setBackground(new java.awt.Color(102, 102, 102));
        btnManageAdmin.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnManageAdmin.setForeground(new java.awt.Color(0, 51, 102));
        btnManageAdmin.setText("Manage Enterprise Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 30));

        btnRegisterCitizen.setBackground(new java.awt.Color(102, 102, 102));
        btnRegisterCitizen.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnRegisterCitizen.setForeground(new java.awt.Color(0, 51, 102));
        btnRegisterCitizen.setText("Register Citizen");
        btnRegisterCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCitizenActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegisterCitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 200, 30));

        btnViewAllCitizen.setBackground(new java.awt.Color(102, 102, 102));
        btnViewAllCitizen.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnViewAllCitizen.setForeground(new java.awt.Color(0, 51, 102));
        btnViewAllCitizen.setText("View All Citizens");
        btnViewAllCitizen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllCitizenActionPerformed(evt);
            }
        });
        jPanel2.add(btnViewAllCitizen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 200, 30));
        jPanel2.add(pictureArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 340, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Citizen Services");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 160, -1));

        buttonManage.setBackground(new java.awt.Color(102, 102, 102));
        buttonManage.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        buttonManage.setForeground(new java.awt.Color(0, 51, 102));
        buttonManage.setText("Delete Citizen");
        buttonManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageActionPerformed(evt);
            }
        });
        jPanel2.add(buttonManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sysadmin.jpeg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 680));

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(processContainer, ecosystem);
        processContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(processContainer, ecosystem);
        processContainer.add("manageEnterpriseJPanel", manageEnterpriseJPanel);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(processContainer, ecosystem);
        processContainer.add("manageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnRegisterCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCitizenActionPerformed
        // TODO add your handling code here:
        RegisterCitizen rc = new RegisterCitizen(processContainer, ecosystem, cd, user_Dir);
        processContainer.add("RegisterCitizen", rc);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_btnRegisterCitizenActionPerformed

    private void btnViewAllCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllCitizenActionPerformed
        // TODO add your handling code here:
        ViewAllCitizens vc = new ViewAllCitizens(processContainer, ecosystem, cd);
        processContainer.add("ViewAllCitizens", vc);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_btnViewAllCitizenActionPerformed

    private void buttonManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageActionPerformed
        // TODO add your handling code here:
        ManageCitizens mc = new ManageCitizens(processContainer, ecosystem, cd);
        processContainer.add("ManageCitizens", mc);
        CardLayout layout = (CardLayout) processContainer.getLayout();
        layout.next(processContainer);
    }//GEN-LAST:event_buttonManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JButton btnRegisterCitizen;
    private javax.swing.JButton btnViewAllCitizen;
    private javax.swing.JToggleButton buttonManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JLabel pictureArea1;
    // End of variables declaration//GEN-END:variables
}
