package com.testtrafico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class test {
    
    int id;
    String pregunta, res1, res2, res3;

    public test(int id, String preguntaTest, String res1, String res2, String res3) {
        this.id = id;
        this.pregunta = preguntaTest;
        this.res1 = res1;
        this.res2 = res2;
        this.res3 = res3;
    }

    public test() {
    }
    
    
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

    public String getRes1() {
        return res1;
    }

    public void setRes1(String res1) {
        this.res1 = res1;
    }

    public String getRes2() {
        return res2;
    }

    public void setRes2(String res2) {
        this.res2 = res2;
    }

    public String getRes3() {
        return res3;
    }

    public void setRes3(String res3) {
        this.res3 = res3;
    }

}
