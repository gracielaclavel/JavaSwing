/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import windows1.Java2;  // Importamos paquete y clase
import javax.swing.JFrame;

/**
 *
 * @author LAB18
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
          Java2 ventana = new Java2(); //creo un obejeto tipo Windows
        ventana.setVisible(true);
        ventana.setBounds(0, 0,600, 800);
        ventana.setTitle("Mi primer interfaz gràfica");// Aqui se coloca el nombre del titulo
        //La siguente sentencia es para finelizar el proyecto al cerra la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
