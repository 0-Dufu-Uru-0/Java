package practico4;

import java.util.Scanner;

public class gestor {

	private static char[] pintura;

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.println("Ingresa datos de su Pintura");
	        System.out.print("Nombre del autor: ");
	        String autorPintura = sc.nextLine();
	        System.out.print("Textura de la pintura: ");
	        String texturaPintura = sc.nextLine();
	        System.out.print("Numero de colores: ");
	        int numcoloresPintura = sc.nextInt(); sc.nextLine();

	        pintura pintura = new pintura(autorPintura, texturaPintura, numcoloresPintura);

	        System.out.println("Ingresa datos de su Escultura");
	        System.out.print("Nombre del autor: ");
	        String autorEscultura = sc.nextLine();
	        System.out.print("Ingresa su forma: ");
	        String formaEscultura = sc.nextLine();
	        System.out.print("Ingresa sus medidas: ");
	        int medidasEscultura = sc.nextInt(); sc.nextLine();

	       escultura escultura = new escultura(autorEscultura, formaEscultura, medidasEscultura);
	        
	        System.out.println("Ingresar datos de la Fotografia");
	        System.out.print("Nombre del autor: ");
	        String autorFotografia = sc.nextLine();
	        System.out.print("Ingresa una breve descripcion de la fotografia: ");
	        String descripcionFotografia = sc.nextLine();
	        System.out.print("Ingresa la fecha de la fotografia: ");
	        int fechaFotografia = sc.nextInt(); sc.nextLine();

	      fotografia fotografia = new fotografia(autorFotografia, descripcionFotografia, fechaFotografia );
	        
	        System.out.println("INFORMACIÓN INGRESADA");
	       System.out.println("Info de la Pintura");
	        System.out.println(pintura.mostrar());
	        System.out.println("Info de la Escultura");
	        System.out.println(escultura.mostrar());
	        System.out.println("Info de la Fotografia");
	        System.out.println(fotografia.mostrar());
	        
	        sc.close();
	        
	    }

	}
