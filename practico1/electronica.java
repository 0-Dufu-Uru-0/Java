package practico1;

	public class electronica extends producto{
		
		private int valor;
	    
		public electronica (String tipo, String marca, int modelo) {
			
			super(tipo, marca, modelo);
			
			this.valor = valor;

		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}

	
		}

	
	