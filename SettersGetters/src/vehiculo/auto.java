package vehiculo;

import java.util.Scanner;

public class auto extends vehiculo{
		
	 private int valor;
	    
		public auto (String marca, int modelo, int valor) {
			
			 super(marca, modelo);
			
			this.valor = valor;
			
		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;

		}
		}
		