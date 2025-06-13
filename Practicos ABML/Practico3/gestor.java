package practico3;

import java.util.Scanner;


	public class gestor {
		  
		public static void main(String[] args) {
			
			int opcion;
			casa[] arreglo = new casa[10];
			int cantidadRegistros = 0;
			
			
			do {
			
				Scanner lector = new Scanner(System.in);
				
				System.out.println("Bienvenido al menu de casa");
				System.out.println("Ingresa opcion deseada:");
				System.out.println("1- Ingresar Nueva casa");
				System.out.println("2- Mostrar Lista de casas");
				System.out.println("3- Borrar una casa");
				System.out.println("4- Modificar el numero de casa");
				System.out.println("5- Salir");
				opcion = lector.nextInt();
				
				
				switch (opcion) {
				
				case 1:
					altaCasa(arreglo, cantidadRegistros, lector);
					cantidadRegistros++;
					break;
					
				case 2:
					listarCasa(arreglo);
					break;
					
				case 3:
					System.out.println("Ingresa el numero de casa a dar de baja: ");
					int numdecasa = lector.nextInt(); 
					bajaCasa(arreglo, numdecasa);
					break;
					
				case 4:
					modifCasa(arreglo,lector);
					break;
					
				case 5:
					System.out.println("Salir del programa");
					System.exit(0);

				default:
					System.out.println("Opcion no disponible");
					break;
				}
				
			} while (opcion!=5);
			
		}
		
		public static void bajaCasa(casa[] arreglo, int numdecasa) {
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null && arreglo[i].getNumdecasa() == numdecasa) {
					arreglo[i] = null;
				}
			}
		}
	public static void modifCasa(casa[] arreglo, Scanner lector) {
		System.out.println("Modificar el numero de casa");
		int numdecasa1 = lector.nextInt();
		
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null && arreglo[i].getNumdecasa() == numdecasa1) {
					System.out.println("Casa Encontrada");
					System.out.println("Ingresa el codigo: ");
					int nuevoNumdecasa = lector.nextInt();
					arreglo[i].setNumdecasa(nuevoNumdecasa);
				}
			}
		}
		
		public static void altaCasa(casa[] arreglo, int cantidadRegistros, Scanner lector) {
			System.out.println("Ingresa duenio: ");
			String duenio = lector.next();
			System.out.println("Ingresa nombre: ");
			String nombre = lector.next();
			System.out.println("Ingresa numero de casa: ");
			int numdecasa = lector.nextInt();
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] == null) {
					arreglo[i] = new casa(duenio, nombre, numdecasa);
					break;
				}
			}
			
			
		}
		
		public static void listarCasa(casa[] arreglo) {
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null) {
					
					System.out.print("casa N°"+ i +" duenio: " + arreglo[i].getduenio());
					System.out.print(" nombre: " + arreglo[i].getNombre());
					System.out.print(" numero de casa: " + arreglo[i].getNumdecasa());
				}else {
					System.out.println("Pos N°" + i + "es null");
				}
				
			}
			
			
		}

	}
