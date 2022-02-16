package com.testtrafico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class test {
    
    // Declaro los atributos
    protected int id;
    protected String pregunta, resCorrecta, resErronea2, resErronea3;

    // Declaro el constructor
    public test(int id, String pt, String rc, String re2, String re3) {
        this.id = id;
        this.pregunta = pt;
        this.resCorrecta = rc;
        this.resErronea2 = re2;
        this.resErronea3 = re3;
    }
    
    // Declaro otro constructor vacío
    public test() {
    }
    
    // Implemento los getters y stters
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getResCorrecta() {
        return resCorrecta;
    }

    public void setResCorrecta(String resCorrecta) {
        this.resCorrecta = resCorrecta;
    }

    public String getResErronea2() {
        return resErronea2;
    }

    public void setResErronea2(String resErronea2) {
        this.resErronea2 = resErronea2;
    }

    public String getResErronea3() {
        return resErronea3;
    }

    public void setResErronea3(String resErronea3) {
        this.resErronea3 = resErronea3;
    }
    
    
    protected ArrayList<test> listarPyR(){ 
        // Creo un array list para almacenar las preguntas y respuestas de la BBDD
        ArrayList<test> lista = new ArrayList();
        // Realizamos la conexión a la BBDD 
        String query = "SELECT * FROM test";
        try (            
            Connection con = DriverManager.getConnection("jdbc:sqlite:bdTestTrafico");
            var pst = con.prepareStatement(query)         
        ) {            
            // Mientras no llegue al final, almacenamos toda la info en objetos
            try(var rs = pst.executeQuery()){
                while(rs.next()){
                    test t = new test();                
                    t.setId(rs.getInt(1));
                    t.setPregunta(rs.getString(2));
                    t.setResCorrecta(rs.getString(3));
                    t.setResErronea2(rs.getString(4));
                    t.setResErronea3(rs.getString(5));
                    lista.add(t); // Añadimos la info al arrayList de objetos                 
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta", "", JOptionPane.ERROR_MESSAGE);
                System.err.println(ex.toString());
                return null;
            }   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar la conexión en la BBDD", "", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex.toString());            
        }      
        return lista; // Devolvemos el resultado completo del arrayList
    }
}