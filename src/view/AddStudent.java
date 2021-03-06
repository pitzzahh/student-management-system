/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

import fileHandling.Process;

import javax.swing.JOptionPane;
import model.Student;
/**
 *
 * @author pitzzahh
 */
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form addStudent
     */
    public AddStudent() {
        initComponents();
        
        Process.students = new ArrayList<>();
        Process.courses = new ArrayList<>();
        
        Process.populateStudents();
        Process.populateCourses();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/add_student_small.png")));
        
        if(Process.isDarkTheme()) {
            addStudentPanel.setBackground(Process.DARK_COLOR);
            addStudentHeader.setForeground(Process.LIGHT_COLOR);
            firstNameLabel.setForeground(Process.LIGHT_COLOR);
            lastNameLabel.setForeground(Process.LIGHT_COLOR);
            ageLabel.setForeground(Process.LIGHT_COLOR);
            addressLabel.setForeground(Process.LIGHT_COLOR);
            studentIdLabel.setForeground(Process.LIGHT_COLOR);
            courseLabel.setForeground(Process.LIGHT_COLOR);
        }
        else {
            addStudentPanel.setBackground(Process.LIGHT_COLOR);
        }
        
        if(Process.getCourses().length != 0) {
            coursesComboBox.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
            coursesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(Process.getCourses()));
        }
        else {
            coursesComboBox.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
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

        addStudentPanel = new javax.swing.JPanel();
        addStudentHeader = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameInput = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageInput = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressInput = new javax.swing.JTextField();
        studentIdLabel = new javax.swing.JLabel();
        studentIdInput = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        coursesComboBox = new javax.swing.JComboBox<>();
        addStudentButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Student");
        setResizable(false);

        addStudentHeader.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        addStudentHeader.setText("Add Student Information");

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        firstNameLabel.setText("First Name:");

        firstNameInput.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        lastNameLabel.setText("Last Name:");

        lastNameInput.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        ageLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        ageLabel.setText("Age:");

        ageInput.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        addressLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        addressLabel.setText("Address:");

        addressInput.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        studentIdLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        studentIdLabel.setText("Student ID:");

        studentIdInput.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        studentIdInput.addActionListener(this::studentIdInputActionPerformed);

        courseLabel.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        courseLabel.setText("Course:");

        coursesComboBox.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        coursesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addStudentButton.setBackground(new java.awt.Color(255, 255, 255));
        addStudentButton.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/icons/save_medium.png")))); // NOI18N
        addStudentButton.addActionListener(this::addStudentButtonActionPerformed);

        javax.swing.GroupLayout addStudentPanelLayout = new javax.swing.GroupLayout(addStudentPanel);
        addStudentPanel.setLayout(addStudentPanelLayout);
        addStudentPanelLayout.setHorizontalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentPanelLayout.createSequentialGroup()
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudentPanelLayout.createSequentialGroup()
                                .addGap(468, 468, 468)
                                .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addStudentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstNameLabel)
                                    .addComponent(addressLabel)
                                    .addComponent(studentIdLabel)
                                    .addComponent(courseLabel)
                                    .addComponent(ageLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addStudentHeader)
                                    .addComponent(studentIdInput)
                                    .addComponent(addressInput)
                                    .addComponent(coursesComboBox, 0, 410, Short.MAX_VALUE)
                                    .addComponent(firstNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                    .addComponent(ageInput))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addStudentPanelLayout.setVerticalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIdLabel)
                    .addComponent(studentIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLabel)
                    .addComponent(coursesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        if(Process.courses.isEmpty()) {
            JOptionPane.showMessageDialog(null, "CANNOT ADD STUDENT BECAUSE THERE ARE NO COURSES AVAILABLE");
            this.dispose();
        }
        else {
            if((firstNameInput.getText().trim().isEmpty() && lastNameInput.getText().trim().isEmpty() && addressInput.getText().trim().isEmpty() && studentIdInput.getText().trim().isEmpty()) && !Process.isNumber(studentIdInput.getText())) {
                JOptionPane.showMessageDialog(null, "PLEASE INSERT THE FIELDS PROPERLY");
            }
            else {
               Process.exist = false;
                for (Student student : Process.students) {
                    if (student.getStudentNumber().equals(studentIdInput.getText().trim())) {
                        Process.exist = true;
                        break;
                    }
                }
                if(Process.exist) {
                    JOptionPane.showMessageDialog(null, "STUDENT ALREADY EXISTS");
                }
                else {
                    Student student = new Student(firstNameInput.getText().trim(), lastNameInput.getText().trim(), Byte.parseByte(ageInput.getText().trim()), addressInput.getText().trim(), studentIdInput.getText().trim(), Process.courses.get(coursesComboBox.getSelectedIndex()));
                    Process.students.add(student);
                    Process.saveStudentsToAFile();
                    JOptionPane.showMessageDialog(null, "STUDENT ADDED");      
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void studentIdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdInputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.JLabel addStudentHeader;
    private javax.swing.JPanel addStudentPanel;
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField ageInput;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JComboBox<String> coursesComboBox;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField studentIdInput;
    private javax.swing.JLabel studentIdLabel;
    // End of variables declaration//GEN-END:variables
}
