/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;
import Business.Person;
import Business.User;
import Business.passwordHashing;
import Business.personDirectory;
import Business.userDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class managePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form managePersonJPanel
     */
    
    private JPanel userProcessContainer;
    //private AccountDirectory accountDirectory;
    private personDirectory persondirectory;
    private userDirectory userdirectory;
    private Person result;
    private boolean checkEnableValue;
    private String checkEnable;
    


    managePersonJPanel(JPanel userProcessContainer, personDirectory persondirectory, userDirectory userdirectory, Person result) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.persondirectory = persondirectory;
        this.userdirectory = userdirectory;
        this.result = result;
        checkEnableValue = userdirectory.searchEnabled(result);
        
        
        populatePersonDetails();
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtManageFirstName = new javax.swing.JTextField();
        txtManageLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtManageEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSaveManagePerson = new javax.swing.JButton();
        btnUpdateManagePerson = new javax.swing.JButton();
        txtManageUserID = new javax.swing.JTextField();
        txtManageNUID = new javax.swing.JTextField();
        txtManageUsername = new javax.swing.JTextField();
        txtManagePassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtManageEnabled = new javax.swing.JTextField();
        btnChangePasswordfromManagePerson = new javax.swing.JButton();

        setBackground(new java.awt.Color(254, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Person Menu");

        jLabel2.setText("UserID:");

        jLabel6.setText("First Name:");

        jLabel7.setText("Last Name:");

        txtManageFirstName.setEnabled(false);

        txtManageLastName.setEnabled(false);

        jLabel8.setText("Email:");

        jLabel3.setText("NUID:");

        jLabel4.setText("Username:");

        txtManageEmail.setEnabled(false);

        jLabel5.setText("Password:");

        btnSaveManagePerson.setBackground(new java.awt.Color(255, 204, 153));
        btnSaveManagePerson.setText("Save");
        btnSaveManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveManagePersonActionPerformed(evt);
            }
        });

        btnUpdateManagePerson.setBackground(new java.awt.Color(255, 204, 153));
        btnUpdateManagePerson.setText("Update");
        btnUpdateManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateManagePersonActionPerformed(evt);
            }
        });

        txtManageUserID.setEnabled(false);
        txtManageUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManageUserIDActionPerformed(evt);
            }
        });

        txtManageNUID.setEnabled(false);

        txtManageUsername.setEnabled(false);

        txtManagePassword.setEditable(false);
        txtManagePassword.setText("**************");
        txtManagePassword.setEnabled(false);

        jLabel9.setText("Enabled?:");

        txtManageEnabled.setEnabled(false);
        txtManageEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManageEnabledActionPerformed(evt);
            }
        });

        btnChangePasswordfromManagePerson.setBackground(new java.awt.Color(255, 204, 153));
        btnChangePasswordfromManagePerson.setText("Change Password?");
        btnChangePasswordfromManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordfromManagePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtManageEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManageFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManageLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManageEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(btnSaveManagePerson)
                        .addGap(43, 43, 43)
                        .addComponent(btnUpdateManagePerson)))
                .addContainerGap(325, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnChangePasswordfromManagePerson)
                .addGap(360, 360, 360))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtManageNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtManageUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtManagePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtManageUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(311, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtManageFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtManageLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtManageEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtManageEnabled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveManagePerson)
                    .addComponent(btnUpdateManagePerson))
                .addGap(18, 18, 18)
                .addComponent(btnChangePasswordfromManagePerson)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtManageUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtManageNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtManageUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtManagePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(309, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtManageEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManageEnabledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManageEnabledActionPerformed

    private void txtManageUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManageUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManageUserIDActionPerformed

    private void btnUpdateManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateManagePersonActionPerformed
        // TODO add your handling code here:
           btnSaveManagePerson.setEnabled(true);
           btnUpdateManagePerson.setEnabled(false);
           
           txtManageFirstName.setEnabled(true);
           txtManageEmail.setEnabled(true);
           txtManageNUID.setEnabled(true);
           txtManagePassword.setEnabled(true);
           txtManageUsername.setEnabled(true);
           txtManageUserID.setEnabled(true);
           txtManageLastName.setEnabled(true);
           txtManageEnabled.setEnabled(true);
           
       
           
           
    }//GEN-LAST:event_btnUpdateManagePersonActionPerformed

    private void btnSaveManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveManagePersonActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null,"Information Saved, Login as admin again to see changes","Information",JOptionPane.INFORMATION_MESSAGE);
        
  /*      if(passwordHashing.loginUser(txtManageUsername.getText(),txtManagePassword.getText())==false)
        {
            JOptionPane.showMessageDialog(null,"Password matching a previous password, please try a different one","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
    */    
        result.setEmail(txtManageEmail.getText());
        result.setFirstName(txtManageFirstName.getText());
        result.setLastName(txtManageLastName.getText());
        result.setNUID(txtManageNUID.getText());
        result.setPassword(txtManagePassword.getText());
        result.setUserId(txtManageUserID.getText());
        //result.setUsername(txtManageUsername.getText());
        
        for (passwordHashing.UserPasswordHistory user : passwordHashing.usernameList) {
        if (user.username.equals(result.getUsername())) {
           user.username=txtManageUsername.getText();
           result.setUsername(txtManageUsername.getText()); 
        }
        
        for(User username: userdirectory.userList){
            if(result.getNUID().equals(username.getUser_NUID()))
            {
                username.setUser_Username(result.getUsername());
                username.setUser_Password(result.getPassword());
                username.setUser_UserId(result.getUserId());
            }
        }
        
        
        checkEnable=txtManageEnabled.getText();
        checkEnableValue=Boolean.valueOf(checkEnable);
        userdirectory.updateEnabled(result,checkEnableValue);
        
        
         
        
        }   
    }//GEN-LAST:event_btnSaveManagePersonActionPerformed

    private void btnChangePasswordfromManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordfromManagePersonActionPerformed
        // TODO add your handling code here:
           User current_user=new User();
           JOptionPane.showMessageDialog(null,"Going to Change Password Page","Information",JOptionPane.INFORMATION_MESSAGE);
            for (User user: userdirectory.userList){
                if(result.getNUID().equals(user.getUser_NUID()))
                {
                   current_user = user; 
                }
            }
            
            changePasswordJPanel panel = new changePasswordJPanel(userProcessContainer,persondirectory,userdirectory,current_user);
            userProcessContainer.add("changePasswordJPanel",panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_btnChangePasswordfromManagePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePasswordfromManagePerson;
    private javax.swing.JButton btnSaveManagePerson;
    private javax.swing.JButton btnUpdateManagePerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtManageEmail;
    private javax.swing.JTextField txtManageEnabled;
    private javax.swing.JTextField txtManageFirstName;
    private javax.swing.JTextField txtManageLastName;
    private javax.swing.JTextField txtManageNUID;
    private javax.swing.JTextField txtManagePassword;
    private javax.swing.JTextField txtManageUserID;
    private javax.swing.JTextField txtManageUsername;
    // End of variables declaration//GEN-END:variables

    private void populatePersonDetails() {
        txtManageEmail.setText(result.getEmail());
        this.txtManageFirstName.setText(result.getFirstName());
        this.txtManageLastName.setText(result.getLastName());
        this.txtManageNUID.setText(result.getNUID());
        this.txtManagePassword.setText(result.getPassword());
        this.txtManageUserID.setText(result.getUserId());
        this.txtManageUsername.setText(result.getUsername());
        
        checkEnable = Boolean.toString(checkEnableValue);
        this.txtManageEnabled.setText(checkEnable);
        btnSaveManagePerson.setEnabled(false);
        btnUpdateManagePerson.setEnabled(true);
        
        
        
    }
}
