
package com.mycompany.school_management;

import functions_folder.DataBaseViewerFunctions;
import java.sql.Connection;
import javax.swing.SwingUtilities;



public class DataBaseViewer extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DataBaseViewer.class.getName());

    public DataBaseViewer() {
        initComponents();
        setupDataBaseView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDBVinterface = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 350));
        setMinimumSize(new java.awt.Dimension(650, 350));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        textAreaDBVinterface.setBackground(new java.awt.Color(31, 31, 32));
        textAreaDBVinterface.setColumns(20);
        textAreaDBVinterface.setForeground(new java.awt.Color(255, 255, 255));
        textAreaDBVinterface.setLineWrap(true);
        textAreaDBVinterface.setRows(5);
        textAreaDBVinterface.setText("Data Base...\n");
        textAreaDBVinterface.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textAreaDBVinterface);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 350);

        setSize(new java.awt.Dimension(650, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new DataBaseViewer().setVisible(true));
    }
    
    void setupDataBaseView(){
        SwingUtilities.invokeLater(()->{
            String s = new DataBaseViewerFunctions().setView();
            textAreaDBVinterface.setText(s);
        }); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaDBVinterface;
    // End of variables declaration//GEN-END:variables
}
