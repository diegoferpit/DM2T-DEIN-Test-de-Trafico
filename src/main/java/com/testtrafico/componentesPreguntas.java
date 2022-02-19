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
    protected ArrayList<test> listaDesordenada = new ArrayList();
    protected Stack < Integer > visualizarIdTestRnd = new Stack <  > (); // Empleamos stack para guardar los números aleatorios
    protected Random r = new Random(); // Implementamos random para escoger las preguntas y respuestas
    protected int epyr, idT, idVTR; // Es el id del random para escoger la pregunta y respuesta
    protected boolean click;
    
    
    public componentesPreguntas() {
        initComponents();
        jScrollPane1.setAutoscrolls(false);
    }
    
    public void setPregunta(){
        txtA_pregunta.setText(t.getPregunta());
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
    
    // Mostramos cuando el usuario comienza a hacer el test
    protected void mostrarTest(){    
        System.out.println("Pregunta actual");
        generarNumeroAleatorio();
        guardarTestAleatorio();
        mostrarTestAleatorio();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        rad_but_1 = new javax.swing.JRadioButton();
        rad_but_2 = new javax.swing.JRadioButton();
        rad_but_3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_pregunta = new javax.swing.JTextArea();

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

        txtA_pregunta.setColumns(20);
        txtA_pregunta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtA_pregunta.setForeground(new java.awt.Color(0, 0, 51));
        txtA_pregunta.setRows(5);
        txtA_pregunta.setText("Pregunta\n");
        txtA_pregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtA_pregunta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(rad_but_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addComponent(rad_but_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rad_but_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rad_but_1)
                .addGap(30, 30, 30)
                .addComponent(rad_but_2)
                .addGap(30, 30, 30)
                .addComponent(rad_but_3)
                .addContainerGap(30, Short.MAX_VALUE))
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

    // Guardamos de forma aleatoria el número para mostrarlo en pantalla
    protected void generarNumeroAleatorio(){
        // Recorremos el arrayList de escogerTest 
        for (int i = 0; i < escogerTest.size() ; i++) {
            // Realizamos un número random entre 1 y el tamaño del arrayList escogerTest
            epyr = r.nextInt(escogerTest.size());
            // Comprobamos si está almacenado el mismo número
            while (visualizarIdTestRnd.contains(epyr)) {
                epyr = r.nextInt(escogerTest.size()); // Si no se crea otro número random
            }
            visualizarIdTestRnd.push(epyr); // Se añade el número al array
        }
        System.out.println("Núm. aleatorios sin repetición:");
        System.out.println(visualizarIdTestRnd.toString());
    }
    
    protected void guardarTestAleatorio(){
        for (int i=0; i<escogerTest.size(); i++) {         
            // Almacenamos el valor del Id Random en la variable y lo comprobamos
            idVTR = visualizarIdTestRnd.get(i);
            for (int j=0; j<visualizarIdTestRnd.size(); j++){
                // Si se da el valor, se reciben los datos y se guardan
                if(j == idVTR){
                    test ld = new test(); 
                    ld.setPregunta(pt = escogerTest.get(j).getPregunta());
                    ld.setResCorrecta(rc = escogerTest.get(j).getResCorrecta());
                    ld.setResErronea2(re2 = escogerTest.get(j).getResErronea2());
                    ld.setResErronea3(re3 = escogerTest.get(j).getResErronea3());  
                    listaDesordenada.add(ld); // Añadimos los datos a un arrayList de objetos
                    
//                    pt = escogerTest.get(j).getPregunta();
//                    rc = escogerTest.get(j).getResCorrecta();
//                    re2 = escogerTest.get(j).getResErronea2();
//                    re3 = escogerTest.get(j).getResErronea3();  
                    System.out.println(idVTR);
                    System.out.println(pt);
                    System.out.println(rc);
                    System.out.println(re2);
                    System.out.println(re3);
                }               
            }
        }
    }
    
    
    protected void mostrarTestAleatorio(){
        // Papel y boli
        for (int i=0; i<listaDesordenada.size(); i++) {
            idVTR = visualizarIdTestRnd.get(i);
            System.out.println(idVTR);
            for (int j=0; j<listaDesordenada.size(); j++) { 
                if(j == idVTR){
                    txtA_pregunta.setText(listaDesordenada.get(i).getPregunta());
                    rad_but_1.setText(listaDesordenada.get(i).getResCorrecta());
                    rad_but_2.setText(listaDesordenada.get(i).getResErronea2());
                    rad_but_3.setText(listaDesordenada.get(i).getResErronea3());
                    
//                    System.out.println(listaDesordenada.get(j).getPregunta());
//                    System.out.println(listaDesordenada.get(j).getResCorrecta());
//                    System.out.println(listaDesordenada.get(j).getResErronea2());
//                    System.out.println(listaDesordenada.get(j).getResErronea3());
               }
            }
        }
    }
    
    
    // Aquí seleccionamos la respuesta del panel que ha escogido el usuario
    protected Stack < Integer > sr = new Stack <  > ();
    protected int seleccionarRespuesta() {
        if(rad_but_1.isSelected()){ System.out.println("Correcta"); sr.add(1); return 1;}
        if(rad_but_2.isSelected()){ System.out.println("Erronea"); sr.add(2); return 2;}
        if(rad_but_3.isSelected()){ System.out.println("Erronea"); sr.add(3); return 3;}
        else sr.add(-1); return -1;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rad_but_1;
    private javax.swing.JRadioButton rad_but_2;
    private javax.swing.JRadioButton rad_but_3;
    private javax.swing.JTextArea txtA_pregunta;
    // End of variables declaration//GEN-END:variables

}
