
package com.mycompany.school_management;

import functions_folder.RemoveStudentFunctions;
import functions_folder.SearchStudentFunctions;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import functions_folder.Student;

public class SearchStudent extends javax.swing.JFrame {
    ArrayList<Student> studentList;
    RemoveStudentFunctions rsfObj = new RemoveStudentFunctions();
    SearchStudentFunctions ssfObj = new SearchStudentFunctions();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SearchStudent.class.getName());


    public SearchStudent() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldSSinput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBoxSSinput = new javax.swing.JComboBox<>();
        buttonSSsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelSScontact = new javax.swing.JLabel();
        labelSSname = new javax.swing.JLabel();
        labelSSclass = new javax.swing.JLabel();
        labelSSplace = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSSresult = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        labelSSadm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);
        jPanel1.add(textFieldSSinput);
        textFieldSSinput.setBounds(290, 70, 210, 30);

        jLabel1.setBackground(new java.awt.Color(65, 32, 169));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH STUDENT");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 50);

        comboBoxSSinput.setBackground(new java.awt.Color(177, 159, 249));
        comboBoxSSinput.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        comboBoxSSinput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Admission Number" }));
        comboBoxSSinput.setOpaque(true);
        jPanel1.add(comboBoxSSinput);
        comboBoxSSinput.setBounds(110, 70, 180, 30);

        buttonSSsearch.setBackground(new java.awt.Color(102, 102, 102));
        buttonSSsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-30-2.png"))); // NOI18N
        buttonSSsearch.setOpaque(true);
        buttonSSsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSSsearchActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSSsearch);
        buttonSSsearch.setBounds(500, 70, 30, 30);

        jLabel2.setBackground(new java.awt.Color(177, 159, 249));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Search Results");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 110, 230, 20);

        labelSScontact.setBackground(new java.awt.Color(234, 234, 234));
        labelSScontact.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelSScontact.setOpaque(true);
        jPanel1.add(labelSScontact);
        labelSScontact.setBounds(260, 270, 220, 40);

        labelSSname.setBackground(new java.awt.Color(234, 234, 234));
        labelSSname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelSSname.setOpaque(true);
        jPanel1.add(labelSSname);
        labelSSname.setBounds(260, 110, 220, 40);

        labelSSclass.setBackground(new java.awt.Color(234, 234, 234));
        labelSSclass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Class", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelSSclass.setOpaque(true);
        jPanel1.add(labelSSclass);
        labelSSclass.setBounds(380, 170, 100, 40);

        labelSSplace.setBackground(new java.awt.Color(234, 234, 234));
        labelSSplace.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Place", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelSSplace.setOpaque(true);
        jPanel1.add(labelSSplace);
        labelSSplace.setBounds(260, 220, 220, 40);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-customer-100.png"))); // NOI18N
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 110, 170, 200);

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

        tableSSresult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adm no.", "Name"
            }
        ));
        tableSSresult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSSresultMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableSSresult);
        if (tableSSresult.getColumnModel().getColumnCount() > 0) {
            tableSSresult.getColumnModel().getColumn(0).setMinWidth(60);
            tableSSresult.getColumnModel().getColumn(0).setPreferredWidth(60);
            tableSSresult.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 130, 230, 190);

        jLabel9.setFont(new java.awt.Font("Kohinoor Bangla", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("search student by");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 50, 120, 30);

        labelSSadm.setBackground(new java.awt.Color(234, 234, 234));
        labelSSadm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adm No.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        labelSSadm.setOpaque(true);
        jPanel1.add(labelSSadm);
        labelSSadm.setBounds(260, 170, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 330);

        setSize(new java.awt.Dimension(670, 355));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSSsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSSsearchActionPerformed
        String input = comboBoxSSinput.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) tableSSresult.getModel();
        model.setRowCount(0);
        if(input.equals("Admission Number")){
            studentList = ssfObj.searchStudentById(textFieldSSinput.getText());
            Student s = studentList.get(0);
            model.addRow(new Object[]{s.getAdm(),s.getName()});            
            labelSSadm.setText(Integer.toString(s.getAdm()));
            labelSSname.setText(s.getName());
            labelSSclass.setText(s.getClas());
            labelSSplace.setText(s.getPlace());
            labelSScontact.setText(s.getContact());
        }
        else{
            studentList = ssfObj.searchStudentByName(textFieldSSinput.getText());
            System.out.println("list sizze: "+studentList.size());
            for(Student s: studentList){
                model.addRow(new Object[]{s.getAdm(),s.getName()});
            }
              
        }
    }//GEN-LAST:event_buttonSSsearchActionPerformed

    private void tableSSresultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSSresultMouseClicked
        int row = tableSSresult.getSelectedRow();
        Student s = studentList.get(row);
        labelSSadm.setText(Integer.toString(s.getAdm()));
        labelSSname.setText(s.getName());
        labelSSclass.setText(s.getClas());
        labelSSplace.setText(s.getPlace());
        labelSScontact.setText(s.getContact());
    }//GEN-LAST:event_tableSSresultMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new SearchStudent().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSSsearch;
    private javax.swing.JComboBox<String> comboBoxSSinput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelSSadm;
    private javax.swing.JLabel labelSSclass;
    private javax.swing.JLabel labelSScontact;
    private javax.swing.JLabel labelSSname;
    private javax.swing.JLabel labelSSplace;
    private javax.swing.JTable tableSSresult;
    private javax.swing.JTextField textFieldSSinput;
    // End of variables declaration//GEN-END:variables
}
