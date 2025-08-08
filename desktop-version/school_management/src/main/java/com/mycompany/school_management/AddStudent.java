package com.mycompany.school_management;

import functions_folder.AddStudentFunctions;
import javax.swing.JOptionPane;


public class AddStudent extends javax.swing.JFrame {
    private MainMenu mainMenuRef;
    AddStudentFunctions asfObj = new AddStudentFunctions();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddStudent.class.getName());


    public AddStudent() {
        initComponents();   
    }
    public AddStudent(MainMenu mainMenu){
        initComponents();
        this.mainMenuRef = mainMenu;        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textFieldASplace = new javax.swing.JTextField();
        textFieldASname = new javax.swing.JTextField();
        textFieldAScls = new javax.swing.JTextField();
        textFieldAScnct = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        buttonASadd = new javax.swing.JButton();
        checkBoxASconfirm = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(670, 350));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(65, 32, 169));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD STUDENT");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-customer-100.png"))); // NOI18N
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 80, 130, 150);

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

        textFieldASplace.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Place", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N
        textFieldASplace.setOpaque(true);
        jPanel1.add(textFieldASplace);
        textFieldASplace.setBounds(60, 230, 220, 40);

        textFieldASname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N
        textFieldASname.setOpaque(true);
        jPanel1.add(textFieldASname);
        textFieldASname.setBounds(60, 130, 220, 40);

        textFieldAScls.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Class", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N
        textFieldAScls.setOpaque(true);
        jPanel1.add(textFieldAScls);
        textFieldAScls.setBounds(180, 80, 100, 40);

        textFieldAScnct.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N
        textFieldAScnct.setOpaque(true);
        jPanel1.add(textFieldAScnct);
        textFieldAScnct.setBounds(60, 180, 220, 40);

        jButton1.setText("upload");
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 240, 130, 30);

        buttonASadd.setBackground(new java.awt.Color(51, 51, 51));
        buttonASadd.setForeground(new java.awt.Color(255, 255, 255));
        buttonASadd.setText("add student");
        buttonASadd.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        buttonASadd.setOpaque(true);
        buttonASadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonASaddActionPerformed(evt);
            }
        });
        jPanel1.add(buttonASadd);
        buttonASadd.setBounds(490, 240, 110, 30);

        checkBoxASconfirm.setText("Confirm");
        jPanel1.add(checkBoxASconfirm);
        checkBoxASconfirm.setBounds(470, 210, 90, 30);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("All information provided herein has been verified to the extent of the details made available to the administration. To the best of our knowledge, the information is accurate and complete based on the records submitted.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(470, 80, 160, 130);

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Desclaimer");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 60, 70, 17);

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Auto Generated");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adm no.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 13))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 80, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 330);

        setSize(new java.awt.Dimension(670, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonASaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonASaddActionPerformed
       String name = textFieldASname.getText();
       String cls = textFieldAScls.getText();
       String contact = textFieldAScnct.getText();
       String place = textFieldASplace.getText();
       if(checkBoxASconfirm.isSelected()){
            asfObj.addStudent(name,cls,place,contact);
       }else JOptionPane.showMessageDialog(null, "please confirm details before submission","NOTE",JOptionPane.WARNING_MESSAGE);
       mainMenuRef.setUpMainMenu();
    }//GEN-LAST:event_buttonASaddActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AddStudent().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonASadd;
    private javax.swing.JCheckBox checkBoxASconfirm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField textFieldAScls;
    private javax.swing.JTextField textFieldAScnct;
    private javax.swing.JTextField textFieldASname;
    private javax.swing.JTextField textFieldASplace;
    // End of variables declaration//GEN-END:variables
}
