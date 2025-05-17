package persona;

import java.util.Scanner;

public class estudiante extends persona{
	
	private int edad;
    
	public estudiante (String nombre, int dni, int edad) {
		
		super(nombre, dni);
		
		this.edad = edad;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;

	}
	}