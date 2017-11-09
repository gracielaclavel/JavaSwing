/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows1;
import javax.swing.*; //Agregando import
import java.awt.*;

/**
 *
 * @author LAB18
 */
public class Java2 extends JFrame //Llamando a los elemento que voy a utilizar
{
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton; 
    JCheckBox cbox;
    JRadioButton rb;
    
    public Java2()
    {
        panel = new JPanel(); //Creo un objeto tipo JPanel
        label=new JLabel();
        text=new JTextField(15);//15 es la cant de caracteres
        boton = new JButton();
        cbox =new JCheckBox();
        rb=new JRadioButton ();
        
        this.add(panel);//Recomendable agregar el JPanel al JFrame
        panel.add(label);// Agregamos un objeto al panel
        panel.add(text);
        panel.add(boton);
        panel.add(cbox);
        panel.add(rb);
     
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.yellow);
    }
    
}
