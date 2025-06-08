package practico4;

import java.util.Scanner;

public class Gestor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] tiposObra = {"Pintura", "Escultura", "Fotografía"};
        String[][] prompts = {
            {"Nombre del autor: ", "Textura de la pintura: ", "Número de colores: "},
            {"Nombre del autor: ", "Forma de la escultura: ", "Medidas: "},
            {"Nombre del autor: ", "Descripción: ", "Fecha: "}
        };
        
        ObraArte[] obras = new ObraArte[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nIngresa datos de " + tiposObra[i]);
            
            System.out.print(prompts[i][0]);
            String autor = sc.nextLine();
            System.out.print(prompts[i][1]);
            String caracteristica = sc.nextLine();
            System.out.print(prompts[i][2]);
            int valor = sc.nextInt();
            sc.nextLine();
            
            switch (i) {
                case 0:
                    obras[i] = new Pintura(autor, caracteristica, valor);
                    break;
                case 1:
                    obras[i] = new Escultura(autor, caracteristica, valor);
                    break;
                case 2:
                    obras[i] = new Fotografia(autor, caracteristica, valor);
                    break;
            }
        }
        
        System.out.println("\n=== INFORMACIÓN INGRESADA ===");
        for (int i = 0; i < 3; i++) {
            System.out.println(tiposObra[i] + ": " + obras[i].mostrar());
        }
        
        sc.close();
    }
}
