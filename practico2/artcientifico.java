package practico2;

class artcientifico extends publiocacion {
		
		private int valor;
	    
		public artcientifico (String nombre, String autor, int tipo) {
			
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
	
	