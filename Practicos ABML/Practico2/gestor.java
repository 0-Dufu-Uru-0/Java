package practico2;

import java.util.Scanner;


	public class gestor {
		  
		public static void main(String[] args) {
			
			int opcion;
			libro[] arreglo = new libro[10];
			int cantidadRegistros = 0;
			
			
			do {
			
				Scanner lector = new Scanner(System.in);
				
				System.out.println("Bienvenido al menu de libro");
				System.out.println("Ingresa opcion deseada:");
				System.out.println("1- Ingresar Nuevo libro");
				System.out.println("2- Mostrar Lista de libros");
				System.out.println("3- Borrar un libro");
				System.out.println("4- Modificar el codigo del libro");
				System.out.println("5- Salir");
				opcion = lector.nextInt();
				
				
				switch (opcion) {
				
				case 1:
					altaLibro(arreglo, cantidadRegistros, lector);
					cantidadRegistros++;
					break;
					
				case 2:
					listarLibro(arreglo);
					break;
					
				case 3:
					System.out.println("Ingresa el codigo del libro a dar de baja: ");
					int codigo = lector.nextInt(); 
					bajaLibro(arreglo, codigo);
					break;
					
				case 4:
					modifLibro(arreglo,lector);
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
		
		public static void bajaLibro(libro[] arreglo, int codigo) {
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null && arreglo[i].getCodigo() == codigo) {
					arreglo[i] = null;
				}
			}
		}
	public static void modifLibro(libro[] arreglo, Scanner lector) {
		System.out.println("Modificar codigo del libro");
		int codigo1 = lector.nextInt();
		
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null && arreglo[i].getCodigo() == codigo1) {
					System.out.println("Libro Encontrado");
					System.out.println("Ingresa el codigo: ");
					int nuevoCodigo = lector.nextInt();
					arreglo[i].setCodigo(nuevoCodigo);
				}
			}
		}
		
		public static void altaLibro(libro[] arreglo, int cantidadRegistros, Scanner lector) {
			System.out.println("Ingresa Nombre: ");
			String nombre = lector.next();
			System.out.println("Ingresa Autor: ");
			String autor = lector.next();
			System.out.println("Ingresa anio: ");
			int anio = lector.nextInt();
			System.out.println("Ingresa codigo: ");
			int codigo = lector.nextInt();
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] == null) {
					arreglo[i] = new libro(nombre, autor, anio, codigo);
					break;
				}
			}
			
			
		}
		
		public static void listarLibro(libro[] arreglo) {
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null) {
					
					System.out.print("Libro N°"+ i +" nombre: " + arreglo[i].getNombre());
					System.out.print(" Autor: " + arreglo[i].getAnio());
					System.out.print(" anio: " + arreglo[i].getAnio());
					System.out.println(" Codigo: " + arreglo[i].getCodigo());
				}else {
					System.out.println("Pos N°" + i + "es null");
				}
				
			}
			
			
		}

	}


