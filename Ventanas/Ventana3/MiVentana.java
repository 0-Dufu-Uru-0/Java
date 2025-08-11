package EjerciciosVentanas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


	
	public class MiVentana extends JFrame {

	    public MiVentana() {
	        this.setTitle("accion");
	        this.setSize(600, 600);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	     
	        
	        JPanel panel = new JPanel(new GridLayout(20, 35)); 
	         
	       
	       
	         JButton Button = new JButton("Botton");
	         JLabel etiqueta = new JLabel("Nombre:");
	         JTextField text = new JTextField(10); 
	         JLabel etiqueta2 = new JLabel("Apellido:");
	         JTextField text2 = new JTextField(10); 
	       
			 Button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					String nombre = text.getText();
					String apellido = text2.getText();
				 
					System.out.println(nombre);
					System.out.println(apellido);
					
				}
				
	    });
			 
			 panel.add(etiqueta);
			 panel.add(text);
			 panel.add(etiqueta2);
			 panel.add(text2);
			 panel.add(Button);
			 this.add(panel);
	    }
	}