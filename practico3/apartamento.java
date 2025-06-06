package practico3;


class apartamento extends edificio{
		
		private int valor;
	    
		public apartamento (String duenio, String direccion, int numpuerta) {
			
			super(duenio, direccion, numpuerta);
			
			this.valor = valor;

		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}
}
	
	