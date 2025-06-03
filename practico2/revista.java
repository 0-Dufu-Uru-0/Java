package practico2;


class revista extends publiocacion {
		
		private int valor;
	    
		public revista (String nombre, String autor, int tipo) {
			
			super(nombre, autor, tipo);
			
			this.valor = valor;

		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}
}
	
	