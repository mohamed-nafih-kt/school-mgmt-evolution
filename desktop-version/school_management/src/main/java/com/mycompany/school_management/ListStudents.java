package com.mycompany.school_management;

import functions_folder.ListStudentFunctions;
import functions_folder.Student;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListStudents extends javax.swing.JFrame {
    ListStudentFunctions lsfObj = new ListStudentFunctions();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ListStudents.class.getName());

    public ListStudents() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldLSsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBoxLSoption = new javax.swing.JComboBox<>();
        buttonLSsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLSresult = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        textFieldLSsearch.setEditable(false);
        textFieldLSsearch.setBackground(new java.awt.Color(204, 204, 204));
        textFieldLSsearch.setFocusable(false);
        jPanel1.add(textFieldLSsearch);
        textFieldLSsearch.setBounds(280, 70, 210, 30);

        jLabel1.setBackground(new java.awt.Color(65, 32, 169));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIST STUDENTS");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 50);

        comboBoxLSoption.setBackground(new java.awt.Color(177, 159, 249));
        comboBoxLSoption.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        comboBoxLSoption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Class", "Place" }));
        comboBoxLSoption.setOpaque(true);
        comboBoxLSoption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxLSoptionActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxLSoption);
        comboBoxLSoption.setBounds(90, 70, 180, 30);

        buttonLSsearch.setBackground(new java.awt.Color(204, 204, 204));
        buttonLSsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-30-2.png"))); // NOI18N
        buttonLSsearch.setMaximumSize(new java.awt.Dimension(25, 25));
        buttonLSsearch.setOpaque(true);
        buttonLSsearch.setPreferredSize(new java.awt.Dimension(25, 25));
        buttonLSsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLSsearchActionPerformed(evt);
            }
        });
        jPanel1.add(buttonLSsearch);
        buttonLSsearch.setBounds(490, 70, 30, 30);

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

        tableLSresult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adm no.", "Name", "Class", "Contact", "Place"
            }
        ));
        jScrollPane2.setViewportView(tableLSresult);
        if (tableLSresult.getColumnModel().getColumnCount() > 0) {
            tableLSresult.getColumnModel().getColumn(0).setPreferredWidth(60);
            tableLSresult.getColumnModel().getColumn(0).setMaxWidth(60);
            tableLSresult.getColumnModel().getColumn(1).setMinWidth(100);
            tableLSresult.getColumnModel().getColumn(1).setPreferredWidth(100);
            tableLSresult.getColumnModel().getColumn(2).setPreferredWidth(60);
            tableLSresult.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 130, 580, 190);

        jLabel9.setFont(new java.awt.Font("Kohinoor Bangla", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("list data by");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 50, 120, 30);

        jLabel2.setBackground(new java.awt.Color(177, 159, 249));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Results");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 110, 580, 20);

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

    private void buttonLSsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLSsearchActionPerformed
     
        String option = comboBoxLSoption.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) tableLSresult.getModel();
        model.setRowCount(0);
        ArrayList<Student> studentList;
        switch (option) {
            case "Class" ->{
                studentList = lsfObj.getListByClass(textFieldLSsearch.getText());
                System.out.println("size : "+studentList.size());
                for(Student s: studentList){
                    model.addRow(new Object[]{s.getAdm(),s.getName(),s.getClas(),s.getContact(),s.getPlace()});
                }
            }
            case "Place"->{                
                studentList = lsfObj.getListByPlace(textFieldLSsearch.getText());
                for(Student s: studentList){
                    model.addRow(new Object[]{s.getAdm(),s.getName(),s.getClas(),s.getContact(),s.getPlace()});
                }
            }
                
            case "All"->{
                studentList = lsfObj.getAllList();
                for(Student s: studentList){
                    model.addRow(new Object[]{s.getAdm(),s.getName(),s.getClas(),s.getContact(),s.getPlace()});
                }
            }
            default->{
                break;
            }
        }
        
    }//GEN-LAST:event_buttonLSsearchActionPerformed

    private void comboBoxLSoptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxLSoptionActionPerformed
       String option = comboBoxLSoption.getSelectedItem().toString();
               switch (option) {
            case "Class" ->{
                textFieldLSsearch.setBackground(Color.WHITE);
                textFieldLSsearch.setText("");
                textFieldLSsearch.setEditable(true);
                textFieldLSsearch.setFocusable(true);
            }
            case "Place"->{
                textFieldLSsearch.setBackground(Color.WHITE);
                textFieldLSsearch.setText("");
                textFieldLSsearch.setEditable(true);
                textFieldLSsearch.setFocusable(true);
            }
                
            case "All"->{
                textFieldLSsearch.setBackground(new java.awt.Color(204,204,204));
                textFieldLSsearch.setText("");
                textFieldLSsearch.setFocusable(false);
                textFieldLSsearch.setEditable(false);
                

            }
            default->{
                break;
            }
        }
    }//GEN-LAST:event_comboBoxLSoptionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new ListStudents().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLSsearch;
    private javax.swing.JComboBox<String> comboBoxLSoption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableLSresult;
    private javax.swing.JTextField textFieldLSsearch;
    // End of variables declaration//GEN-END:variables
}
