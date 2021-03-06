/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import fileHandling.Process;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.Student;
/**
 *
 * @author 19
 */
public class ViewStudents extends javax.swing.JFrame {

    /**
     * Creates new form viewStudents
     */
    public ViewStudents() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/view_students_small.png")));
        
        Process.students = new ArrayList<>();
        Process.populateStudents();
        
        addStudentToTable();
        JTableHeader tableHeader = studentsTable.getTableHeader();
        
        if(Process.isDarkTheme()) {
            viewStudentsPanel.setBackground(Process.DARK_COLOR);
            viewStudentsHeader.setForeground(Process.LIGHT_COLOR);
            tableScroller.setBackground(Process.LIGHT_COLOR);
            tableScroller.setForeground(Process.DARK_COLOR);
            studentsTable.setBackground(Process.DARK_COLOR);
            studentsTable.setForeground(Process.LIGHT_COLOR);
            tableHeader.setBackground(Process.LIGHT_COLOR);
            tableHeader.setForeground(Process.DARK_COLOR);
        }
        else {
            viewStudentsPanel.setBackground(Process.LIGHT_COLOR);
            viewStudentsHeader.setForeground(Process.DARK_COLOR);
        }
    }
    private void addStudentToTable() {
        DefaultTableModel table = (DefaultTableModel) studentsTable.getModel();
        
        Object[] rowData = new Object[studentsTable.getColumnCount()];
        
        for (Student student : Process.students) {
            rowData[0] = student.getFirstName();
            rowData[1] = student.getLastName();
            rowData[2] = student.getAge();
            rowData[3] = student.getAddress();
            rowData[4] = student.getStudentNumber();
            rowData[5] = student.getCourse().getCourseDescription();
            table.addRow(rowData);
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

        viewStudentsPanel = new javax.swing.JPanel();
        viewStudentsHeader = new javax.swing.JLabel();
        tableScroller = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Students Information");

        viewStudentsHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        viewStudentsHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewStudentsHeader.setText("Students Information");
        viewStudentsHeader.setAlignmentY(0.0F);
        viewStudentsHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tableScroller.setBackground(new java.awt.Color(255, 255, 255));

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Age", "Address", "Student Number", "Student Course"
            }
        ) {
            final boolean[] canEdit = new boolean[] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        studentsTable.setGridColor(new java.awt.Color(0, 0, 0));
        studentsTable.setSelectionBackground(new java.awt.Color(0, 102, 255));
        studentsTable.getTableHeader().setReorderingAllowed(false);
        tableScroller.setViewportView(studentsTable);

        javax.swing.GroupLayout viewStudentsPanelLayout = new javax.swing.GroupLayout(viewStudentsPanel);
        viewStudentsPanel.setLayout(viewStudentsPanelLayout);
        viewStudentsPanelLayout.setHorizontalGroup(
            viewStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStudentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableScroller)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewStudentsPanelLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(viewStudentsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(282, 282, 282))
        );
        viewStudentsPanelLayout.setVerticalGroup(
            viewStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStudentsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewStudentsHeader)
                .addGap(18, 18, 18)
                .addComponent(tableScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewStudentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewStudentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewStudents().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable studentsTable;
    private javax.swing.JScrollPane tableScroller;
    private javax.swing.JLabel viewStudentsHeader;
    private javax.swing.JPanel viewStudentsPanel;
    // End of variables declaration//GEN-END:variables
}
