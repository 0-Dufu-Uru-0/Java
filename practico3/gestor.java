package practico3;

import java.util.Scanner;

public class gestor {

	private static char[] casa, apartamento;

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.println("Ingresar datos de su casa");
	        System.out.print("Nombre del duenio: ");
	        String duenioCasa = sc.nextLine();
	        System.out.print("Direccion de la casa: ");
	        String direccionCasa = sc.nextLine();
	        System.out.print("Num de puertas de la casa: ");
	        int numpuertasCasa= sc.nextInt();

	        casa casa = new casa(duenioCasa, direccionCasa, numpuertasCasa);

	        System.out.println("Ingresar datos del apartamento");
	        System.out.print("Nombre del duenio: ");
	        String duenioApartamento = sc.nextLine();
	        System.out.print("Direccion del edificio: ");
	        String direccionApartamento = sc.nextLine();
	        System.out.print("Numero de puerta: ");
	        int numpuertaApartamento = sc.nextInt(); 
	        apartamento ap = new apartamento(duenioApartamento, direccionApartamento, numpuertaApartamento);
	        
	        System.out.println("INFORMACIÓN INGRESADA");
	       System.out.println("Info de casa");
	        System.out.println(casa.mostrar());
	        System.out.println("Info del apartamento");
	        System.out.println(ap.mostrar());
	       
	        sc.close();
	        
	    }

	}
