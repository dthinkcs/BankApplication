/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankapplication.view.operations;

import com.bankapplication.controller.CustomerController;
import com.bankapplication.database.ConnectionManager;
import com.bankapplication.model.Customer;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author derickfelix
 */
public class RegisterCustomer extends javax.swing.JDialog {

    private File file;
    private ConnectionManager connectionManager;
    private CustomerController customerController;
    private Customer customer;

    /**
     * Creates new form RegisterCustomer
     */
    public RegisterCustomer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        customOperations();
    }

    private void customOperations() {
        // Min: 1000, Max: 9999
        int random = (int) (Math.random() * 9999 + 1000);
        // generate a random account number
        txtAccountNumber.setText(Integer.toString(random));
        this.connectionManager = new ConnectionManager();
        this.customerController = new CustomerController(connectionManager);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSex = new javax.swing.ButtonGroup();
        paneTittle = new javax.swing.JPanel();
        panelbTitle = new javax.swing.JLabel();
        paneBody = new javax.swing.JPanel();
        cmbAccount = new javax.swing.JComboBox<>();
        lblAddress = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cmbDay = new javax.swing.JComboBox<>();
        radioFemale = new javax.swing.JRadioButton();
        txtAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        cmbMonth = new javax.swing.JComboBox<>();
        lblSex = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();
        lblDOB = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        lblAccount = new javax.swing.JLabel();
        paneThumbnail = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        btnBrowsePicture = new javax.swing.JButton();
        txtAccountNumber = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trisoft Bank - New Customer");

        paneTittle.setBackground(new java.awt.Color(0, 83, 165));

        panelbTitle.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        panelbTitle.setForeground(new java.awt.Color(254, 254, 254));
        panelbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelbTitle.setText("TRISOFT BANK OF USA");

        javax.swing.GroupLayout paneTittleLayout = new javax.swing.GroupLayout(paneTittle);
        paneTittle.setLayout(paneTittleLayout);
        paneTittleLayout.setHorizontalGroup(
            paneTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneTittleLayout.setVerticalGroup(
            paneTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTittleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelbTitle)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        paneBody.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        paneBody.setToolTipText("");

        cmbAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account Type", "Savings", "Current" }));

        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Address:");

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        btnGroupSex.add(radioFemale);
        radioFemale.setText("Female");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        lblSex.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSex.setText("Sex:");

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965" }));

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOB.setText("DOB:");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        btnGroupSex.add(radioMale);
        radioMale.setText("Male");

        lblAccount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAccount.setText("Account Type:");

        paneThumbnail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout paneThumbnailLayout = new javax.swing.GroupLayout(paneThumbnail);
        paneThumbnail.setLayout(paneThumbnailLayout);
        paneThumbnailLayout.setHorizontalGroup(
            paneThumbnailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneThumbnailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneThumbnailLayout.setVerticalGroup(
            paneThumbnailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneThumbnailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnBrowsePicture.setText("Browse Picture");
        btnBrowsePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowsePictureActionPerformed(evt);
            }
        });

        txtAccountNumber.setEnabled(false);

        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName1.setText("Account Number:");

        lblStatus.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(168, 1, 1));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paneBodyLayout = new javax.swing.GroupLayout(paneBody);
        paneBody.setLayout(paneBodyLayout);
        paneBodyLayout.setHorizontalGroup(
            paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBodyLayout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword))
                    .addGroup(paneBodyLayout.createSequentialGroup()
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSex, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                            .addComponent(lblName1))
                        .addGap(58, 58, 58)
                        .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountNumber)
                            .addComponent(cmbAccount, 0, 475, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addGroup(paneBodyLayout.createSequentialGroup()
                                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paneBodyLayout.createSequentialGroup()
                                        .addComponent(radioMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioFemale))
                                    .addGroup(paneBodyLayout.createSequentialGroup()
                                        .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 195, Short.MAX_VALUE))
                            .addComponent(txtName))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneThumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowsePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(paneBodyLayout.createSequentialGroup()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        paneBodyLayout.setVerticalGroup(
            paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBodyLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(paneThumbnail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrowsePicture)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paneBodyLayout.createSequentialGroup()
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(lblSex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        paneBodyLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAccount, lblAddress, lblDOB, lblName, lblPassword, lblSex});

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(495, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(paneBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear)
                        .addComponent(btnCancel))
                    .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed

    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBrowsePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowsePictureActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser();
        int i = choose.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            file = choose.getSelectedFile();
            Image img = getToolkit().createImage(file.getAbsolutePath())
                    .getScaledInstance(110, 110, Image.SCALE_SMOOTH);
            lblPicture.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btnBrowsePictureActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {

            String acc = txtAccountNumber.getText();
            String name = txtName.getText();
            String address = txtAddress.getText();
            String accType = cmbAccount.getSelectedItem().toString();

            char sex = 'm';
            if (radioFemale.isSelected()) {
                sex = 'f';
            }
            // Database mask yy-mm-dd
            String dob = (String) cmbYear.getSelectedItem() + "-" + cmbMonth.getSelectedItem() + "-" + cmbDay.getSelectedItem();
            String psw = txtPassword.getText();
            if (fieldsIsEmpty()) {
                lblStatus.setText("Error: Some of the fields is empty!");
            } else {
                customer = new Customer(acc, name, address, accType, sex, dob);
                customer.setPassword(psw);
                customerController.store(customer);
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e);
        }

    }//GEN-LAST:event_btnRegisterActionPerformed
    
    
    /**
     * It clear all the fields in this form
     */
    private void clearFields() {
        // Combo box
        this.cmbAccount.setSelectedIndex(0);
        this.cmbDay.setSelectedIndex(0);
        this.cmbMonth.setSelectedIndex(0);
        this.cmbYear.setSelectedIndex(0);
        // Text
        this.txtName.setText(null);
        this.txtAddress.setText(null);
        this.txtPassword.setText(null);
    }
    
    /**
     * Checks if there is an empty field
     * 
     * @return It there is an empty field, if so it returns true
     */
    private boolean fieldsIsEmpty() {
        return txtAccountNumber.getText() == null || txtAddress.getText() == null
                || txtName.getText() == null || txtPassword.getText() == null
                || cmbAccount.getSelectedIndex() == 0 || cmbDay.getSelectedIndex() == 0
                || cmbMonth.getSelectedIndex() == 0 || cmbYear.getSelectedIndex() == 0;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowsePicture;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.ButtonGroup btnGroupSex;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbAccount;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel paneBody;
    private javax.swing.JPanel paneThumbnail;
    private javax.swing.JPanel paneTittle;
    private javax.swing.JLabel panelbTitle;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
