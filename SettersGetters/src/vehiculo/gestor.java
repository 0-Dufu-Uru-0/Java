package vehiculo;

import java.util.Scanner;

public class gestor {

	public static void main(String[] args) {
Scanner lector = new Scanner(System.in);

auto auto1 = new auto(null, 0, 0);

System.out.println("Ingresa la marca: ");
auto1.setMarca(lector.nextLine());

System.out.println("Ingresa el modelo: ");
auto1.setModelo(lector.nextInt());

System.out.println("Ingresa el valor: ");
auto1.setValor(lector.nextInt());

System.out.println("Nombre: " + auto1.getMarca());
System.out.println("Modelo: " + auto1.getModelo());
System.out.println("Valor: " + auto1.getValor());

	}
}
