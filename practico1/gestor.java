package practico1;

import java.util.Scanner;

	public class gestor {
		  
		public static void main(String[] args) {
			
			Scanner lector = new Scanner(System.in);
			
			electronica electronica1 = new electronica(null, null, 0);
			
		System.out.println("Ingresa el tipo: ");
		electronica1.setTipo(lector.nextLine());
		
		System.out.println("Ingresa la marca: ");
		electronica1.setMarca(lector.nextLine());
		
		System.out.println("Ingresa el modelo: ");
		electronica1.setModelo(lector.nextInt());
		
		System.out.println("Ingrese el valor: ");
		electronica1.setValor(lector.nextInt());
		
	    System.out.println("tipo:" + electronica1.getTipo());
	    System.out.println("marca:" + electronica1.getMarca());
	    System.out.println("modelo:" + electronica1.getModelo());
		System.out.println("valor:" + electronica1.getValor());

		}
	

	}