package practico2;

import java.util.Scanner;

public class gestor {

	private static char[] artcientifico;

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

	        System.out.println("Ingresar datos de un LIBRO");
	        System.out.print("Nombre: ");
	        String nombreLibro = sc.nextLine();
	        System.out.print("Autor: ");
	        String autorLibro = sc.nextLine();
	        System.out.print("Anio: ");
	        int anioLibro = sc.nextInt(); sc.nextLine();

	        libro libro = new libro(nombreLibro, autorLibro, anioLibro);

	        System.out.println("Ingresar datos de una REVISTA");
	        System.out.print("Nombre: ");
	        String nombreRevista = sc.nextLine();
	        System.out.print("Autor: ");
	        String autorRevista = sc.nextLine();
	        System.out.print("Tipo: ");
	        int tipoRevista = sc.nextInt(); sc.nextLine();

	        revista revista = new revista(nombreRevista, autorRevista, tipoRevista);
	        
	        System.out.println("Ingresar datos de un ARTICULO CIENTIFICO");
	        System.out.print("Nombre: ");
	        String nombreArt = sc.nextLine();
	        System.out.print("Autor: ");
	        String autorArt = sc.nextLine();
	        System.out.print("Tipo: ");
	        int tipoArt = sc.nextInt(); sc.nextLine();

	        artcientifico articulo = new artcientifico(nombreArt, autorArt, tipoArt);
	        
	        System.out.println("INFORMACIÓN INGRESADA");
	       System.out.println("Info del libro");
	        System.out.println(libro.mostrar());
	        System.out.println("Info de la revista");
	        System.out.println(revista.mostrar());
	        System.out.println("Info del articulo cientifico");
	        System.out.println(articulo.mostrar());
	        
	        sc.close();
	        
	    }

	}


