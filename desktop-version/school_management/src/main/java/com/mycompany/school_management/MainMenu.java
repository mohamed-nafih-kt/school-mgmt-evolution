package com.mycompany.school_management;


import functions_folder.MainMenuFunctions;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MainMenu extends javax.swing.JFrame {
    MainMenuFunctions mmfObj;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainMenu.class.getName());

    public MainMenu() {
        initComponents();
        setUpMainMenu();
        
    }

    
    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelTotalStudents = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelMMunknown = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelMMpresent = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelMMabsent = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItem1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuItemAddStudent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemRemoveStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemEditDetails = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuItemSearchStudent = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuItemListStudent = new javax.swing.JMenuItem();
        menuMMdatabase = new javax.swing.JMenu();
        menuItemMMshowDB = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        setMinimumSize(new java.awt.Dimension(750, 450));
        setPreferredSize(new java.awt.Dimension(770, 450));
        setSize(new java.awt.Dimension(770, 450));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(65, 32, 169));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCHOOL MANAGEMENT");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 240, 50);

        labelTotalStudents.setBackground(new java.awt.Color(204, 204, 204));
        labelTotalStudents.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        labelTotalStudents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-students-100.png"))); // NOI18N
        labelTotalStudents.setText("NA");
        labelTotalStudents.setOpaque(true);
        jPanel1.add(labelTotalStudents);
        labelTotalStudents.setBounds(130, 140, 200, 130);

        jLabel4.setBackground(new java.awt.Color(177, 159, 249));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TOTAL STUDENTS");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 270, 200, 40);

        jPanel2.setBackground(new java.awt.Color(177, 159, 249));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(240, 0, 530, 50);

        jLabel2.setBackground(new java.awt.Color(177, 159, 249));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UNMARKED");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 280, 110, 40);

        labelMMunknown.setBackground(new java.awt.Color(255, 255, 255));
        labelMMunknown.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelMMunknown.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMMunknown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-decision-40.png"))); // NOI18N
        labelMMunknown.setText("N A");
        labelMMunknown.setOpaque(true);
        jPanel1.add(labelMMunknown);
        labelMMunknown.setBounds(490, 280, 100, 40);

        jLabel6.setBackground(new java.awt.Color(177, 159, 249));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRESENT");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 140, 110, 40);

        labelMMpresent.setBackground(new java.awt.Color(255, 255, 255));
        labelMMpresent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelMMpresent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMMpresent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-attendance-40.png"))); // NOI18N
        labelMMpresent.setText("N A");
        labelMMpresent.setOpaque(true);
        jPanel1.add(labelMMpresent);
        labelMMpresent.setBounds(490, 140, 100, 40);

        jLabel8.setBackground(new java.awt.Color(177, 159, 249));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ABSENT");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 210, 110, 40);

        labelMMabsent.setBackground(new java.awt.Color(255, 255, 255));
        labelMMabsent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelMMabsent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelMMabsent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-disapprove-40.png"))); // NOI18N
        labelMMabsent.setText("N A");
        labelMMabsent.setOpaque(true);
        jPanel1.add(labelMMabsent);
        labelMMabsent.setBounds(490, 210, 100, 40);

        jMenuBar1.setBackground(new java.awt.Color(65, 32, 169));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(135, 30));

        menuItem1.setText("Options");

        jMenu5.setBackground(new java.awt.Color(161, 169, 254));
        jMenu5.setText("MANAGE STUDENTS");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jMenu5.setMargin(new java.awt.Insets(3, 3, 3, 3));
        jMenu5.setOpaque(true);

        menuItemAddStudent.setBackground(new java.awt.Color(224, 225, 235));
        menuItemAddStudent.setText("ADD STUDENT");
        menuItemAddStudent.setMargin(new java.awt.Insets(3, 3, 3, 3));
        menuItemAddStudent.setOpaque(true);
        menuItemAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddStudentActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemAddStudent);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 2));
        jMenu5.add(jSeparator1);

        menuItemRemoveStudent.setBackground(new java.awt.Color(224, 225, 235));
        menuItemRemoveStudent.setText("REMOVE STUDENT");
        menuItemRemoveStudent.setMargin(new java.awt.Insets(3, 3, 3, 3));
        menuItemRemoveStudent.setOpaque(true);
        menuItemRemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRemoveStudentActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemRemoveStudent);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 2));
        jMenu5.add(jSeparator2);

        menuItemEditDetails.setBackground(new java.awt.Color(224, 225, 235));
        menuItemEditDetails.setText("EDIT DETAILS");
        menuItemEditDetails.setMargin(new java.awt.Insets(3, 3, 3, 3));
        menuItemEditDetails.setOpaque(true);
        menuItemEditDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditDetailsActionPerformed(evt);
            }
        });
        jMenu5.add(menuItemEditDetails);

        menuItem1.add(jMenu5);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOpaque(true);
        jSeparator4.setPreferredSize(new java.awt.Dimension(0, 2));
        menuItem1.add(jSeparator4);

        menuItemSearchStudent.setBackground(new java.awt.Color(161, 169, 254));
        menuItemSearchStudent.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuItemSearchStudent.setText("SEARCH STUDENT");
        menuItemSearchStudent.setOpaque(true);
        menuItemSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSearchStudentActionPerformed(evt);
            }
        });
        menuItem1.add(menuItemSearchStudent);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOpaque(true);
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 2));
        menuItem1.add(jSeparator3);

        menuItemListStudent.setBackground(new java.awt.Color(161, 169, 254));
        menuItemListStudent.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuItemListStudent.setText("LIST STUDENTS");
        menuItemListStudent.setOpaque(true);
        menuItemListStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListStudentActionPerformed(evt);
            }
        });
        menuItem1.add(menuItemListStudent);

        jMenuBar1.add(menuItem1);

        menuMMdatabase.setText("DataBase");

        menuItemMMshowDB.setBackground(new java.awt.Color(161, 169, 254));
        menuItemMMshowDB.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuItemMMshowDB.setText("SHOW DATA BASE");
        menuItemMMshowDB.setOpaque(true);
        menuItemMMshowDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMMshowDBActionPerformed(evt);
            }
        });
        menuMMdatabase.add(menuItemMMshowDB);

        jMenuBar1.add(menuMMdatabase);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(770, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSearchStudentActionPerformed
        System.out.println("search student");
        mmfObj.openSearchStudent();
    }//GEN-LAST:event_menuItemSearchStudentActionPerformed

    private void menuItemListStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListStudentActionPerformed
        System.out.println("list students");

        mmfObj.openListStudent();
    }//GEN-LAST:event_menuItemListStudentActionPerformed

    private void menuItemAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddStudentActionPerformed
        System.out.println("add students");

        mmfObj.openAddStudent(this);
    }//GEN-LAST:event_menuItemAddStudentActionPerformed

    private void menuItemRemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRemoveStudentActionPerformed
        System.out.println("remove students");

        mmfObj.openRemoveStudent(this);         
    }//GEN-LAST:event_menuItemRemoveStudentActionPerformed

    private void menuItemEditDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditDetailsActionPerformed
        System.out.println("edit students");
        JOptionPane.showMessageDialog(this, "page not available","error !",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItemEditDetailsActionPerformed

    private void menuItemMMshowDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMMshowDBActionPerformed
        System.out.println("show data base");
        mmfObj.showDataBase();
    }//GEN-LAST:event_menuItemMMshowDBActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() ->  new MainMenu().setVisible(true));
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel labelMMabsent;
    private javax.swing.JLabel labelMMpresent;
    private javax.swing.JLabel labelMMunknown;
    private javax.swing.JLabel labelTotalStudents;
    private javax.swing.JMenu menuItem1;
    private javax.swing.JMenuItem menuItemAddStudent;
    private javax.swing.JMenuItem menuItemEditDetails;
    private javax.swing.JMenuItem menuItemListStudent;
    private javax.swing.JMenuItem menuItemMMshowDB;
    private javax.swing.JMenuItem menuItemRemoveStudent;
    private javax.swing.JMenuItem menuItemSearchStudent;
    private javax.swing.JMenu menuMMdatabase;
    // End of variables declaration//GEN-END:variables

    protected void setUpMainMenu() {
        mmfObj = new MainMenuFunctions();
        SwingUtilities.invokeLater(()->{
        int total = mmfObj.getTotalStudents();
        int[] arr1 = mmfObj.getAttendance();
        labelTotalStudents.setText(String.valueOf(total));   
        labelMMpresent.setText(String.valueOf(arr1[0]));
        labelMMabsent.setText(String.valueOf(arr1[1]));
        labelMMunknown.setText(String.valueOf(arr1[2]));        
        });
    }
}
