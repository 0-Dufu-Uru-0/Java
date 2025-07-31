package MiPrimeraVentana;

import javax.swing.*;
import java.awt.*;

public class Ventana2 extends JFrame {
    public Ventana2() {
        this.setTitle("Mi primer ventana");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
   
        JPanel panel = new JPanel(new GridLayout(10, 10)); 
      
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField text = new JTextField(10); 
        JLabel etiqueta2 = new JLabel("Apellido:");
        JTextField text2 = new JTextField(10); 
        JLabel etiqueta3 = new JLabel("Cedula:");
        JTextField text3 = new JTextField(10); 
        JLabel etiqueta4 = new JLabel("Edad:");
        JTextField text4 = new JTextField(10); 
        String[] rol = {"Hombre", "Mujer"};
        JComboBox<String> comboBox = new JComboBox<>(rol);
       JButton boton = new JButton("Registrate");
     
  
        panel.add(etiqueta);
        panel.add(text);
        panel.add(text2);
        panel.add(etiqueta2);
        panel.add(text3);
        panel.add(etiqueta3);
        panel.add(text4);
        panel.add(etiqueta4);
     
        panel.add(text);
        panel.add(comboBox);
        panel.add(boton);
     
        this.add(panel);
       
        
    
        
    }
}