package MiPrimeraVentana;


import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ventana extends JFrame {
    public ventana() {
        this.setTitle("Guardar libros");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(20, 35)); 
        
        JLabel etiqueta = new JLabel("ISBN:");
        
        JTextField text = new JTextField(8); 
        JLabel etiqueta2 = new JLabel("autor:");
        JTextField text2 = new JTextField(8); 
        JLabel etiqueta3 = new JLabel("titulo:");
        JTextField text3 = new JTextField(8); 
        JButton button2 = new JButton("Guardar");
        JButton Button1 = new JButton("Mostrar");
       JTable tabla = new JTable(3, 3);

 
       
   	 button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				  ArrayList<String> dato = new ArrayList<>();

			
				       
			        
			        dato.add(text.getText());
			        dato.add(text2.getText());
			      dato.add(text3.getText());

			        
			        System.out.println(dato);

			}
			
	    });
       
   	 Button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
			String texto = new String();
			texto = text.getText();
			String texto2 = new String();
			texto2 = text2.getText();
			String texto3 = new String();
			texto3 = text3.getText();
System.out.println(texto);
System.out.println(texto2);
System.out.println(texto3);

			}
			
	    });
       
   	 
   	 
        panel.add(etiqueta);
        panel.add(text);
        panel.add(etiqueta2);
        panel.add(text2);
        panel.add(etiqueta3);
        panel.add(text3);
        
        panel.add(button2);
        panel.add(Button1);
        panel.add(tabla);
   	 this.add(panel);
    }  
}