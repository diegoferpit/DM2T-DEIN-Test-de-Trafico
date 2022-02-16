package com.testtrafico;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Diego
 */
public class componentesPreguntas extends javax.swing.JPanel {
    
    // Declaro los atibutos
    protected test t = new test(); 
    protected String pt, rc, re2, re3;
    protected ArrayList<test> escogerTest = t.listarPyR(); // En el ArrayList guardamos la info almacenada de listarPyR en el objeto    
    protected Stack < Integer > visualizarTestRnd = new Stack <  > (); // Empleamos stack para guardar los números aleatorios
    protected Random r = new Random(); // Implementamos random para escoger las preguntas y respuestas
    protected int epyr; // Es el id del random para escoger la pregunta y respuesta
    
    
    public componentesPreguntas() {
        initComponents();  
    }
    
    public void setPregunta(){
        label_pregunta.setText(t.getPregunta());
    }
    
    public void setRespuesta1(){
        rad_but_1.setText(t.getResCorrecta());
    }
    
    public void setRespuesta2(){
        rad_but_2.setText(t.getResErronea2());
    }
    
    public void setRespuesta3(){
        rad_but_3.setText(t.getResErronea3());
    }
    
    // Mostramos y avanzamos/retrocedemos en los paneles
    protected void mostrarTest(){    
        System.out.println("Pregunta actual");        
        generarTestAleatorio();

//        for (int i=0; i<visualizarTest.size(); i++) {
//            
//                // Se muestra en el panel
//                label_pregunta.setText(i+"-"+pt);
//                rad_but_1.setText("A) "+rc);
//                rad_but_2.setText("B) "+re2);
//                rad_but_3.setText("C) "+re3);
//            
//        }
//            componentesPreguntas cp = new componentesPreguntas();
//            cp.validate();  // Validamos
//            cp.repaint();   // Pintamos de nuevo el panel      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        label_pregunta = new javax.swing.JLabel();
        rad_but_1 = new javax.swing.JRadioButton();
        rad_but_2 = new javax.swing.JRadioButton();
        rad_but_3 = new javax.swing.JRadioButton();
        btn_anterior = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();

        label_pregunta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_pregunta.setForeground(new java.awt.Color(0, 0, 51));
        label_pregunta.setText("Pregunta del test");

        buttonGroup.add(rad_but_1);
        rad_but_1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rad_but_1.setText("Respuesta 1");
        rad_but_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_but_1ActionPerformed(evt);
            }
        });

        buttonGroup.add(rad_but_2);
        rad_but_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rad_but_2.setText("Respuesta 2");
        rad_but_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_but_2ActionPerformed(evt);
            }
        });

        buttonGroup.add(rad_but_3);
        rad_but_3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rad_but_3.setText("Respuesta 3");
        rad_but_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rad_but_3ActionPerformed(evt);
            }
        });

        btn_anterior.setBackground(new java.awt.Color(0, 0, 51));
        btn_anterior.setForeground(new java.awt.Color(255, 255, 255));
        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_siguiente.setBackground(new java.awt.Color(0, 0, 51));
        btn_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_siguiente.setText("Siguiente");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rad_but_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                        .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_pregunta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(rad_but_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rad_but_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(label_pregunta)
                .addGap(37, 37, 37)
                .addComponent(rad_but_1)
                .addGap(18, 18, 18)
                .addComponent(rad_but_2)
                .addGap(18, 18, 18)
                .addComponent(rad_but_3)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rad_but_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_but_1ActionPerformed
        seleccionarRespuesta();
    }//GEN-LAST:event_rad_but_1ActionPerformed

    private void rad_but_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_but_2ActionPerformed
        seleccionarRespuesta();
    }//GEN-LAST:event_rad_but_2ActionPerformed

    private void rad_but_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rad_but_3ActionPerformed
        seleccionarRespuesta();
    }//GEN-LAST:event_rad_but_3ActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        anteriorPregunta();
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        siguientePregunta();
    }//GEN-LAST:event_btn_siguienteActionPerformed

    // Guardamos de forma aleatoria el número para mostrarlo en pantalla
    protected void generarTestAleatorio(){
        // Recorremos el arrayList de escogerTest 
        for (int i = 0; i < escogerTest.size() ; i++) {
            // Realizamos un número random entre 1 y el tamaño del arrayList escogerTest
            epyr = r.nextInt(escogerTest.size());
            // Comprobamos que esté almacenado el mismo número
            while (visualizarTestRnd.contains(epyr)) {
                epyr = r.nextInt(escogerTest.size()); // Si no se crea otro número random
            }
            visualizarTestRnd.push(epyr); // Se borra el número para que no quede almacenado en la variable
        }
        System.out.println("Núm. aleatorios sin repetición:");
        System.out.println(visualizarTestRnd.toString());
    }
    
    // Aquí seleccionamos la respuesta del panel que ha escogido el usuario
    protected void seleccionarRespuesta() {
        if(rad_but_1.isSelected()) 
        if(rad_but_2.isSelected()) 
        if(rad_but_3.isSelected()) ;
    }
    
    // Debemos volver a la pregunta de antes y que esté la respuesta escogida
    // por el usuario en caso de que haya seleccionado.
    protected void anteriorPregunta(){
        System.out.println("Clickaste en "+btn_anterior.getActionCommand());
    }

    // Avanzamos a la siguiente pregunta y se muestra en el panel de componentes
    protected void siguientePregunta(){
        System.out.println("Clickaste en "+btn_siguiente.getActionCommand());
//        for (int i=0; i<escogerTest.size(); i++) {
//            pt = escogerTest.get(i).getPregunta();
//            rc = escogerTest.get(i).getResCorrecta();
//            re2 = escogerTest.get(i).getResErronea2();
//            re3 = escogerTest.get(i).getResErronea3();
//            
//            // Se muestra en el panel
//            label_pregunta.setText(i+"-"+pt);
//            rad_but_1.setText("A) "+rc);
//            rad_but_2.setText("B) "+re2);
//            rad_but_3.setText("C) "+re3);
//            // Se muestra en pantalla
//            System.out.println(i + pt);
//            System.out.println(i + rc);
//            System.out.println(i + re2);
//            System.out.println(i + re3);
//        }        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_siguiente;
    protected javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel label_pregunta;
    private javax.swing.JRadioButton rad_but_1;
    private javax.swing.JRadioButton rad_but_2;
    private javax.swing.JRadioButton rad_but_3;
    // End of variables declaration//GEN-END:variables

}
