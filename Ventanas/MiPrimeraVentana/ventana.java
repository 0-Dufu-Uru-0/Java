package MiPrimeraVentana;
import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame {
    public ventana() {
        this.setTitle("Mi primer ventana");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel(); 
        JLabel text1 = new JLabel("hola");
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField text = new JTextField(15); 
        JButton boton = new JButton("aceptar");

        panel.add(text1);
        panel.add(etiqueta);
        panel.add(text);
        panel.add(boton);

        this.add(panel);
       
        
    
        
    }
}
