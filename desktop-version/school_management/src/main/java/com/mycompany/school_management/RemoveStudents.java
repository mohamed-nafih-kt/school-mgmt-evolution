package com.mycompany.school_management;

import functions_folder.RemoveStudentFunctions;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RemoveStudents extends javax.swing.JFrame {
    private MainMenu mainMenuRef;
    RemoveStudentFunctions rsfObj = new RemoveStudentFunctions();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RemoveStudents.class.getName());

    public RemoveStudents() {
        initComponents();
    }
    public RemoveStudents(MainMenu mainMenu) {
        initComponents();
        this.mainMenuRef = mainMenu; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldRSadm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonRSsearch = new javax.swing.JButton();
        labelRScontact = new javax.swing.JLabel();
        labelRSname = new javax.swing.JLabel();
        labelRSclass = new javax.swing.JLabel();
        labelRSplace = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelRSadm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        checkBoxRSconfirm = new javax.swing.JCheckBox();
        buttonRSremove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(670, 350));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);
        jPanel1.add(textFieldRSadm);
        textFieldRSadm.setBounds(290, 70, 210, 30);

        jLabel1.setBackground(new java.awt.Color(65, 32, 169));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REMOVE STUDENT");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 50);

        buttonRSsearch.setBackground(new java.awt.Color(102, 102, 102));
        buttonRSsearch.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        buttonRSsearch.setForeground(new java.awt.Color(255, 255, 255));
        buttonRSsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-30.png"))); // NOI18N
        buttonRSsearch.setBorder(null);
        buttonRSsearch.setOpaque(true);
        buttonRSsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRSsearchActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRSsearch);
        buttonRSsearch.setBounds(500, 70, 40, 30);

        labelRScontact.setBackground(new java.awt.Color(234, 234, 234));
        labelRScontact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelRScontact.setOpaque(true);
        jPanel1.add(labelRScontact);
        labelRScontact.setBounds(80, 260, 220, 40);

        labelRSname.setBackground(new java.awt.Color(234, 234, 234));
        labelRSname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelRSname.setOpaque(true);
        jPanel1.add(labelRSname);
        labelRSname.setBounds(80, 110, 220, 40);

        labelRSclass.setBackground(new java.awt.Color(234, 234, 234));
        labelRSclass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Class", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelRSclass.setOpaque(true);
        jPanel1.add(labelRSclass);
        labelRSclass.setBounds(200, 160, 100, 40);

        labelRSplace.setBackground(new java.awt.Color(234, 234, 234));
        labelRSplace.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Place", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelRSplace.setOpaque(true);
        jPanel1.add(labelRSplace);
        labelRSplace.setBounds(80, 210, 220, 40);

        jPanel2.setBackground(new java.awt.Color(177, 159, 249));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(300, 0, 370, 50);

        jLabel9.setFont(new java.awt.Font("Kohinoor Bangla", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("search students by");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 50, 120, 30);

        labelRSadm.setBackground(new java.awt.Color(234, 234, 234));
        labelRSadm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adm No.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelRSadm.setOpaque(true);
        jPanel1.add(labelRSadm);
        labelRSadm.setBounds(80, 160, 100, 40);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("The student has been removed from the system in accordance with institutional policies. All actions have been taken based on the information available to the administration at the time of removal. Under substantiated by verifiable documentation, if the removal of the student from the system is found to be an error, the institution and the Student Information Systems (SIS) Administrator will be held accountable.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(360, 120, 210, 140);

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Desclaimer");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(360, 100, 70, 20);

        checkBoxRSconfirm.setText("Confirm");
        jPanel1.add(checkBoxRSconfirm);
        checkBoxRSconfirm.setBounds(360, 270, 90, 30);

        buttonRSremove.setBackground(new java.awt.Color(51, 51, 51));
        buttonRSremove.setForeground(new java.awt.Color(255, 255, 255));
        buttonRSremove.setText("remove");
        buttonRSremove.setBorder(null);
        buttonRSremove.setOpaque(true);
        buttonRSremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRSremoveActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRSremove);
        buttonRSremove.setBounds(490, 270, 80, 30);

        jLabel2.setBackground(new java.awt.Color(177, 159, 249));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admission Number");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 70, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(670, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRSsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRSsearchActionPerformed
            String adm = textFieldRSadm.getText();
            ArrayList<String> results = rsfObj.getStudentDetails(adm);
            System.out.println("updating ui..");
            if (results.size() >= 4) {
                labelRSadm.setText(results.get(0));
                labelRSname.setText(results.get(1));
                labelRSclass.setText(results.get(2));
                labelRSplace.setText(results.get(3));
                labelRScontact.setText(results.get(4));
            } else {
                JOptionPane.showMessageDialog(null, "No student found with that Admission Number.", "Not Found", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_buttonRSsearchActionPerformed

    private void buttonRSremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRSremoveActionPerformed
        if(checkBoxRSconfirm.isSelected()){
            rsfObj.deleteStudent(labelRSadm.getText());
        }else JOptionPane.showMessageDialog(null, "Confirm before deleting record", "Confirm", JOptionPane.INFORMATION_MESSAGE);
        mainMenuRef.setUpMainMenu();
    }//GEN-LAST:event_buttonRSremoveActionPerformed


    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RemoveStudents().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRSremove;
    private javax.swing.JButton buttonRSsearch;
    private javax.swing.JCheckBox checkBoxRSconfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelRSadm;
    private javax.swing.JLabel labelRSclass;
    private javax.swing.JLabel labelRScontact;
    private javax.swing.JLabel labelRSname;
    private javax.swing.JLabel labelRSplace;
    private javax.swing.JTextField textFieldRSadm;
    // End of variables declaration//GEN-END:variables
}
