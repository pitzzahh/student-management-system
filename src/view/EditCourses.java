/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import javax.swing.JOptionPane;
import controller.Process;
import java.util.ArrayList;
import view.editCourseDetails.EditCourseDetails;
/**
 *
 * @author 19
 */
public class EditCourses extends javax.swing.JFrame {
    public static int selectedCourse;
    /**
     * Creates new form EditCourses
     */
    public EditCourses() {
        
        initComponents();
        
        Process.subjects = new ArrayList<>();
        Process.courses = new ArrayList<>();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/add_course_small.png")));
        
        Process.populateSubjects();
        Process.populateCourses();
        
        if(Process.isDarkTheme()) {
            editOrRemoveCoursePanel.setBackground(Process.DARK_COLOR);
            editOrRemoveCoursesHeader.setForeground(Process.LIGHT_COLOR);
            chooseACourseLabel.setForeground(Process.LIGHT_COLOR);
        }
        else {
            editOrRemoveCoursePanel.setBackground(Process.LIGHT_COLOR);
        }
        
        if(Process.getCourses().length != 0) {
            coursesComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            coursesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(Process.getCourses()));
        }
        else {
            coursesComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            coursesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"NO COURSES AVAILABLE"}));
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

        editOrRemoveCoursePanel = new javax.swing.JPanel();
        editOrRemoveCoursesHeader = new javax.swing.JLabel();
        chooseACourseLabel = new javax.swing.JLabel();
        coursesComboBox = new javax.swing.JComboBox();
        editCourseButton = new javax.swing.JButton();
        removeCourseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit or Remove Course");
        setResizable(false);

        editOrRemoveCoursesHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        editOrRemoveCoursesHeader.setText("Edit or Remove Course");

        chooseACourseLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chooseACourseLabel.setText("Choose a Course:");

        coursesComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        coursesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        coursesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesComboBoxActionPerformed(evt);
            }
        });

        editCourseButton.setBackground(new java.awt.Color(255, 255, 255));
        editCourseButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        editCourseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-edit-30.png"))); // NOI18N
        editCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCourseButtonActionPerformed(evt);
            }
        });

        removeCourseButton.setBackground(new java.awt.Color(255, 255, 255));
        removeCourseButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        removeCourseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Remove_24px.png"))); // NOI18N
        removeCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCourseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editOrRemoveCoursePanelLayout = new javax.swing.GroupLayout(editOrRemoveCoursePanel);
        editOrRemoveCoursePanel.setLayout(editOrRemoveCoursePanelLayout);
        editOrRemoveCoursePanelLayout.setHorizontalGroup(
            editOrRemoveCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editOrRemoveCoursePanelLayout.createSequentialGroup()
                .addGroup(editOrRemoveCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editOrRemoveCoursePanelLayout.createSequentialGroup()
                        .addGroup(editOrRemoveCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editOrRemoveCoursePanelLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(editOrRemoveCoursesHeader))
                            .addGroup(editOrRemoveCoursePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chooseACourseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coursesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editOrRemoveCoursePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        editOrRemoveCoursePanelLayout.setVerticalGroup(
            editOrRemoveCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editOrRemoveCoursePanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(editOrRemoveCoursesHeader)
                .addGap(27, 27, 27)
                .addGroup(editOrRemoveCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseACourseLabel)
                    .addComponent(coursesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(editOrRemoveCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(removeCourseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editCourseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editOrRemoveCoursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editOrRemoveCoursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void removeCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCourseButtonActionPerformed
        if(Process.courses.isEmpty()) {
            JOptionPane.showMessageDialog(null, "THERE ARE NO COURSE TO BE REMOVED");
        }
        else {
            selectedCourse = coursesComboBox.getSelectedIndex();
            Process.courses.remove(selectedCourse);
            Process.saveCoursesToAFile();
            JOptionPane.showMessageDialog(null, "COURSE REMOVED SUCCESSFULLY");
            this.dispose();
        }
    }//GEN-LAST:event_removeCourseButtonActionPerformed

    private void editCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCourseButtonActionPerformed
        selectedCourse = coursesComboBox.getSelectedIndex();
        new EditCourseDetails().setVisible(true);
    }//GEN-LAST:event_editCourseButtonActionPerformed

    private void coursesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursesComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(EditCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCourses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseACourseLabel;
    private javax.swing.JComboBox coursesComboBox;
    private javax.swing.JButton editCourseButton;
    private javax.swing.JPanel editOrRemoveCoursePanel;
    private javax.swing.JLabel editOrRemoveCoursesHeader;
    private javax.swing.JButton removeCourseButton;
    // End of variables declaration//GEN-END:variables
}
