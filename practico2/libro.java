package practico2;

class libro extends publiocacion {
		
		private int valor;
	    
		public libro (String nombre, String autor, int anio) {
			
			super(nombre, autor, anio);
			
			this.valor = valor;

		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}
}
	
	