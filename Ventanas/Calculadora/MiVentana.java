package EjerciciosVentanas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


	
	public class MiVentana extends JFrame {

	    public MiVentana() {
	        this.setTitle("Calculadora");
	        this.setSize(600, 600);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	     
	        
	        JPanel panel = new JPanel(new GridLayout(20, 35)); 
	         
	       
	       
	     
	         JLabel etiqueta = new JLabel("numero:");
	         JTextField text = new JTextField(8); 
	         JLabel etiqueta2 = new JLabel("numero2:");
	         JTextField text2 = new JTextField(8); 
	         JButton Button1 = new JButton("sumar");
	         JButton Button2 = new JButton("restar");
	         JButton Button3 = new JButton("multiplicar");
	         JButton Button4 = new JButton("dividir");
	         JLabel etiqueta3 = new JLabel("Resultado:");
	       
			 Button1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					String texto1 = text.getText();     
					String texto2 = text2.getText();      

				        int num1 = Integer.parseInt(texto1);
				        int num2 = Integer.parseInt(texto2);

					    int resultado = num1 + num2;

					 etiqueta3.setText("Resultado: " + resultado);
				}
				
	    });
			 Button2.addActionListener(new ActionListener() {
					
				@Override
				public void actionPerformed(ActionEvent e) {
				
					String texto1 = text.getText();     
					String texto2 = text2.getText();      

				        int num1 = Integer.parseInt(texto1);
				        int num2 = Integer.parseInt(texto2);

					    int resultado = num1 - num2;

					 etiqueta3.setText("Resultado: " + resultado);
				}
				
	    });
			 Button3.addActionListener(new ActionListener() {
					
				@Override
				public void actionPerformed(ActionEvent e) {
				
					String texto1 = text.getText();     
					String texto2 = text2.getText();      

				        int num1 = Integer.parseInt(texto1);
				        int num2 = Integer.parseInt(texto2);

					    int resultado = num1 * num2;

					 etiqueta3.setText("Resultado: " + resultado);
				}
				
	    });
			 Button4.addActionListener(new ActionListener() {
					
				@Override
				public void actionPerformed(ActionEvent e) {
				
					String texto1 = text.getText();     
					String texto2 = text2.getText();      

				        int num1 = Integer.parseInt(texto1);
				        int num2 = Integer.parseInt(texto2);

					    int resultado = num1 / num2;

					 etiqueta3.setText("Resultado: " + resultado);
				}
				
	    });
			 
			 panel.add(etiqueta);
			 panel.add(text);
			 panel.add(etiqueta2);
			 panel.add(text2);
			 
			 panel.add(Button1);
			 panel.add(Button2);
			 panel.add(Button3);
			 panel.add(Button4);
			 
		
			 panel.add(etiqueta3);
			 
			 this.add(panel);
	    }
	}