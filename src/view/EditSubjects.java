/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import controller.Process;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import view.editSubjectDetails.EditSubjectDetails;

/**
 *
 * @author 19
 */
public class EditSubjects extends javax.swing.JFrame {
    public static int selectedSubject;
    /**
     * Creates new form removeSubjects
     */
    public EditSubjects() {

        initComponents();

        Process.subjects = new ArrayList<>();
        Process.populateSubjects();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/edit_subject_small.png")));
        
        if(Process.isDarkTheme()) {
            editOrRemoveSubjectsPanel.setBackground(Process.DARK_COLOR);
            editOrRemoveSubjectsHeader.setForeground(Process.LIGHT_COLOR);
            chooseASubjectLabel.setForeground(Process.LIGHT_COLOR);
        }
        else {
            editOrRemoveSubjectsPanel.setBackground(Process.LIGHT_COLOR);
        }
        if(Process.getSubjects().length != 0) {
            subjectsComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            subjectsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(Process.getSubjects()));
        }
        else {
            subjectsComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            subjectsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"NO SUBJECTS AVAILABLE"}));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editOrRemoveSubjectsPanel = new javax.swing.JPanel();
        chooseASubjectLabel = new javax.swing.JLabel();
        subjectsComboBox = new javax.swing.JComboBox();
        editOrRemoveSubjectsHeader = new javax.swing.JLabel();
        removeSubject = new javax.swing.JButton();
        editSubjectDetaisl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edir or Remove Subjects");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        chooseASubjectLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chooseASubjectLabel.setText("Choose a Subject:");

        subjectsComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subjectsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        subjectsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectsComboBoxActionPerformed(evt);
            }
        });

        editOrRemoveSubjectsHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        editOrRemoveSubjectsHeader.setText("Edit or Remove Subjects");

        removeSubject.setBackground(new java.awt.Color(255, 255, 255));
        removeSubject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removeSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Remove_24px.png"))); // NOI18N
        removeSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSubjectActionPerformed(evt);
            }
        });

        editSubjectDetaisl.setBackground(new java.awt.Color(255, 255, 255));
        editSubjectDetaisl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editSubjectDetaisl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-30.png"))); // NOI18N
        editSubjectDetaisl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSubjectDetaislActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editOrRemoveSubjectsPanelLayout = new javax.swing.GroupLayout(editOrRemoveSubjectsPanel);
        editOrRemoveSubjectsPanel.setLayout(editOrRemoveSubjectsPanelLayout);
        editOrRemoveSubjectsPanelLayout.setHorizontalGroup(
            editOrRemoveSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editOrRemoveSubjectsPanelLayout.createSequentialGroup()
                .addGroup(editOrRemoveSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editOrRemoveSubjectsPanelLayout.createSequentialGroup()
                        .addGroup(editOrRemoveSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editOrRemoveSubjectsPanelLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(editOrRemoveSubjectsHeader))
                            .addGroup(editOrRemoveSubjectsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chooseASubjectLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subjectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editOrRemoveSubjectsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editSubjectDetaisl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        editOrRemoveSubjectsPanelLayout.setVerticalGroup(
            editOrRemoveSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editOrRemoveSubjectsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(editOrRemoveSubjectsHeader)
                .addGap(27, 27, 27)
                .addGroup(editOrRemoveSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseASubjectLabel)
                    .addComponent(subjectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editOrRemoveSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editSubjectDetaisl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editOrRemoveSubjectsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editOrRemoveSubjectsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subjectsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectsComboBoxActionPerformed

    private void removeSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSubjectActionPerformed
        if(Process.subjects.isEmpty()) {
            JOptionPane.showMessageDialog(null, "THERE ARE NO SUBJECTS TO BE REMOVED");
        }
        else {
            selectedSubject = subjectsComboBox.getSelectedIndex();
            Process.subjects.remove(selectedSubject);
            Process.saveSubjectsToAFile();
            JOptionPane.showMessageDialog(null, "SUBJECT REMOVED SUCCESSFULLY");
            this.dispose();
        }
    }//GEN-LAST:event_removeSubjectActionPerformed

    private void editSubjectDetaislActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSubjectDetaislActionPerformed
        
        if(Process.subjects.isEmpty()) {
            JOptionPane.showMessageDialog(null, "THERE ARE NO SUBJECTS TO BE EDITED");
        } 
        else {
            selectedSubject = subjectsComboBox.getSelectedIndex();
            new EditSubjectDetails().setVisible(true);
        }
    }//GEN-LAST:event_editSubjectDetaislActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EditSubjects().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseASubjectLabel;
    private javax.swing.JLabel editOrRemoveSubjectsHeader;
    private javax.swing.JPanel editOrRemoveSubjectsPanel;
    private javax.swing.JButton editSubjectDetaisl;
    private javax.swing.JButton removeSubject;
    private javax.swing.JComboBox subjectsComboBox;
    // End of variables declaration//GEN-END:variables
}
