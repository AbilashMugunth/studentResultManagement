/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addStudent = new javax.swing.JButton();
        addStudentResult = new javax.swing.JButton();
        listStudents = new javax.swing.JButton();
        listStudentResults = new javax.swing.JButton();
        updateStudentMarks = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addStudent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addStudent.setText("Add Student");
        addStudent.setPreferredSize(new java.awt.Dimension(200, 30));
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });
        getContentPane().add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        addStudentResult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addStudentResult.setText("Add Student Result");
        addStudentResult.setPreferredSize(new java.awt.Dimension(200, 30));
        addStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentResultActionPerformed(evt);
            }
        });
        getContentPane().add(addStudentResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        listStudents.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        listStudents.setText("List Students");
        listStudents.setPreferredSize(new java.awt.Dimension(200, 30));
        listStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(listStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        listStudentResults.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        listStudentResults.setText("List Student Results");
        listStudentResults.setPreferredSize(new java.awt.Dimension(200, 30));
        listStudentResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listStudentResultsActionPerformed(evt);
            }
        });
        getContentPane().add(listStudentResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        updateStudentMarks.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        updateStudentMarks.setText("Update Student Marks");
        updateStudentMarks.setPreferredSize(new java.awt.Dimension(200, 30));
        updateStudentMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentMarksActionPerformed(evt);
            }
        });
        getContentPane().add(updateStudentMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        logout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logout.setText("Log Out");
        logout.setPreferredSize(new java.awt.Dimension(200, 30));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        InsertNewStudent frame = new InsertNewStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_addStudentActionPerformed

    private void addStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentResultActionPerformed
        InsertResult frame = new InsertResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_addStudentResultActionPerformed

    private void listStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listStudentsActionPerformed
        ListStudent frame = new ListStudent();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_listStudentsActionPerformed

    private void listStudentResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listStudentResultsActionPerformed
        ListResult frame = new ListResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_listStudentResultsActionPerformed

    private void updateStudentMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentMarksActionPerformed
        UpdateResult frame = new UpdateResult();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_updateStudentMarksActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this page ...", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            setVisible(false);
            Home frame = new Home();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_logoutActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JButton addStudentResult;
    private javax.swing.JButton listStudentResults;
    private javax.swing.JButton listStudents;
    private javax.swing.JButton logout;
    private javax.swing.JButton updateStudentMarks;
    // End of variables declaration//GEN-END:variables
}
