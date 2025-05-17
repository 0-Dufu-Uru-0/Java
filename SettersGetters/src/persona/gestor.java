package persona;

import java.util.Scanner;

public class gestor {
  
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		estudiante estudiante1 = new estudiante(null, 0, 0);
		
	System.out.println("Ingresa tu nombre: ");
	estudiante1.setNombre(lector.nextLine());
	
	System.out.println("Ingresa tu dni: ");
	estudiante1.setDni(lector.nextInt());
	
	System.out.println("Ingresa tu edad: ");
	estudiante1.setEdad(lector.nextInt());
	
    System.out.println("Nombre:" + estudiante1.getNombre());
    System.out.println("Dni:" + estudiante1.getDni());
    System.out.println("Edad:" + estudiante1.getEdad());
			
	}
}
