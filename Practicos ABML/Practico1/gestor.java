package practico1;

import java.util.Scanner;


	public class gestor {
		  
		public static void main(String[] args) {
			
			int opcion;
			ropa[] arreglo = new ropa[10];
			int cantidadRegistros = 0;
			
			
			do {
				
				Scanner lector = new Scanner(System.in);
				
				System.out.println("Bienvenido");
				System.out.println("Ingresa opcion deseada:");
				System.out.println("1- Ingresar Nueva ropa");
				System.out.println("2- Mostrar Lista de ropa");
				System.out.println("3- Borrar una prenda de ropa");
				System.out.println("4- Modificar codigo de ropa");
				System.out.println("5- Salir");
				opcion = lector.nextInt();
				
				switch (opcion) {
				case 1:
					altaRopa(arreglo, cantidadRegistros, lector);
					cantidadRegistros++;
					break;
					
				case 2:
					listarRopa(arreglo);
					break;
					
				case 3:
					System.out.println("Ingresa el codigo de ropa a dar de baja: ");
					int codigo = lector.nextInt(); 
					bajaRopa(arreglo, codigo);
					break;
					
				case 4:
					modifRopa(arreglo,lector);
					break;
					
				case 5:
					System.out.println("Salir del programa");
					System.exit(0);//use chat gpt para esta linea

				default:
					System.out.println("Opcion no disponible");
					break;
				}
				
			} while (opcion!=5);
			
		}
		
		public static void bajaRopa(ropa[] arreglo, int codigo) {
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null && arreglo[i].getCodigo() == codigo) {
					arreglo[i] = null;
				}
			}
		}
	public static void modifRopa(ropa[] arreglo, Scanner lector) {
		System.out.println("Modificar codigo de ropa");
		int codigo1 = lector.nextInt();
		
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null && arreglo[i].getCodigo() == codigo1) {
					System.out.println("Prenda de ropa Encontrada");
					System.out.println("Ingresa el codigo: ");
					int nuevoCodigo = lector.nextInt();
					arreglo[i].setCodigo(nuevoCodigo);
				}
			}
		}
		
		public static void altaRopa(ropa[] arreglo, int cantidadRegistros, Scanner lector) {
			System.out.println("Ingresa Tipo: ");
			String tipo = lector.next();
			System.out.println("Ingresa Marca: ");
			String marca = lector.next();
			System.out.println("Ingresa codigo: ");
			int codigo = lector.nextInt();
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] == null) {
					arreglo[i] = new ropa(tipo, marca, codigo);
					break;
				}
			}
			
			
		}
		
		public static void listarRopa(ropa[] arreglo) {
			
			for(int i=0; i<arreglo.length; i++) {
				if(arreglo[i] != null) {
					System.out.print("Ropa N°"+ i +" Tipo: " + arreglo[i].getTipo());
					System.out.print(" Marca: " + arreglo[i].getMarca());
					System.out.println(" Codigo: " + arreglo[i].getCodigo());
				}else {
					System.out.println("Pos N°" + i + "es null");
				}
				
			}
			
			
		}

	}

