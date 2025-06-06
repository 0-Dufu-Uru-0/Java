package practico3;


class casa extends edificio{
		
		private int valor;
	    
		public casa (String duenio, String direccion, int numpuertas) {
			
			super(duenio, direccion, numpuertas);
			
			this.valor = valor;

		}

		public int getValor() {
			return valor;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}
}
	
	