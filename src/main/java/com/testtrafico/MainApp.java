package com.testtrafico;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class MainApp extends javax.swing.JFrame {
    
    public MainApp() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(777,444);
        this.setResizable(false);
    }
    
    protected void escogerBBDD() {
        //Recuperamos la ruta en la que queremos guardar
        var fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            txtF_elegir_bbdd.setText(fc.getSelectedFile().getName());
        }
    }
    
    protected void comenzarTests(){        
        test t = new test();
        //String query = "SELECT * FROM test where id=?";
        try (            
            Connection con = DriverManager.getConnection("jdbc:sqlite:bdTestTrafico");
            //var pstTest = con.prepareStatement(query) // PrepareStatement para evitar SQL injection           
        ) {
            JOptionPane.showMessageDialog(null, "Conexión establecida");
            this.setVisible(false);
            frame_test.setLocationRelativeTo(null);
            frame_test.setSize(555,222);
            frame_test.setResizable(false);
            frame_test.setVisible(true);
                   
//            try(var rs = pstTest.executeQuery()){
//                while(rs.next()){
//                    System.out.format(rs.getString(1));
//                    System.out.format(rs.getString(2));
//                    System.out.format(rs.getString(3));
//                    System.out.format(rs.getString(4));
//                }
//            } catch (SQLException ex) {
//                System.out.println("Error al ejecutar la consulta");
//            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la conexión en la BBDD", "", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex.toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_test = new javax.swing.JFrame();
        panel_menu_titulo2 = new javax.swing.JPanel();
        label_titulo1 = new javax.swing.JLabel();
        panel_menu_titulo1 = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        panel_inicio = new javax.swing.JPanel();
        label_elegir_bbdd = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtF_elegir_bbdd = new javax.swing.JTextField();
        btn_elegir_bbdd = new javax.swing.JButton();
        label_num_preguntas = new javax.swing.JLabel();
        spinner_num_preguntas = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        btn_empezar = new javax.swing.JButton();

        frame_test.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_menu_titulo2.setBackground(new java.awt.Color(0, 0, 51));

        label_titulo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_titulo1.setForeground(new java.awt.Color(255, 255, 255));
        label_titulo1.setText("Test de tráfico");

        javax.swing.GroupLayout panel_menu_titulo2Layout = new javax.swing.GroupLayout(panel_menu_titulo2);
        panel_menu_titulo2.setLayout(panel_menu_titulo2Layout);
        panel_menu_titulo2Layout.setHorizontalGroup(
            panel_menu_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_titulo2Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(label_titulo1)
                .addGap(327, 327, 327))
        );
        panel_menu_titulo2Layout.setVerticalGroup(
            panel_menu_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu_titulo2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(label_titulo1)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout frame_testLayout = new javax.swing.GroupLayout(frame_test.getContentPane());
        frame_test.getContentPane().setLayout(frame_testLayout);
        frame_testLayout.setHorizontalGroup(
            frame_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu_titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frame_testLayout.setVerticalGroup(
            frame_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_testLayout.createSequentialGroup()
                .addComponent(panel_menu_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_menu_titulo1.setBackground(new java.awt.Color(0, 0, 51));

        label_titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(255, 255, 255));
        label_titulo.setText("Test de tráfico");

        javax.swing.GroupLayout panel_menu_titulo1Layout = new javax.swing.GroupLayout(panel_menu_titulo1);
        panel_menu_titulo1.setLayout(panel_menu_titulo1Layout);
        panel_menu_titulo1Layout.setHorizontalGroup(
            panel_menu_titulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_titulo1Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(label_titulo)
                .addContainerGap())
        );
        panel_menu_titulo1Layout.setVerticalGroup(
            panel_menu_titulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_titulo1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(label_titulo)
                .addGap(44, 44, 44))
        );

        panel_inicio.setBackground(new java.awt.Color(204, 204, 255));

        label_elegir_bbdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_elegir_bbdd.setText("Elegir Base de datos");

        txtF_elegir_bbdd.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        btn_elegir_bbdd.setText("...");
        btn_elegir_bbdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elegir_bbddActionPerformed(evt);
            }
        });

        label_num_preguntas.setText("Número de preguntas a realizar");

        btn_empezar.setText("Empezar");
        btn_empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_inicioLayout = new javax.swing.GroupLayout(panel_inicio);
        panel_inicio.setLayout(panel_inicioLayout);
        panel_inicioLayout.setHorizontalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_inicioLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_inicioLayout.createSequentialGroup()
                                .addComponent(label_num_preguntas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinner_num_preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_inicioLayout.createSequentialGroup()
                                .addComponent(label_elegir_bbdd)
                                .addGap(202, 202, 202)
                                .addComponent(txtF_elegir_bbdd, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_elegir_bbdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)))
                    .addGroup(panel_inicioLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btn_empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(146, 146, 146))
        );
        panel_inicioLayout.setVerticalGroup(
            panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_inicioLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_elegir_bbdd)
                    .addComponent(txtF_elegir_bbdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_elegir_bbdd))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_num_preguntas)
                    .addComponent(spinner_num_preguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btn_empezar)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu_titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_menu_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_elegir_bbddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elegir_bbddActionPerformed
        escogerBBDD();
    }//GEN-LAST:event_btn_elegir_bbddActionPerformed

    private void btn_empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empezarActionPerformed
        comenzarTests();
    }//GEN-LAST:event_btn_empezarActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_elegir_bbdd;
    private javax.swing.JButton btn_empezar;
    private javax.swing.JFrame frame_test;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_elegir_bbdd;
    private javax.swing.JLabel label_num_preguntas;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo1;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_menu_titulo1;
    private javax.swing.JPanel panel_menu_titulo2;
    private javax.swing.JSpinner spinner_num_preguntas;
    private javax.swing.JTextField txtF_elegir_bbdd;
    // End of variables declaration//GEN-END:variables

}
