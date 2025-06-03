package practico1;

public class alimento extends producto{
	
	private int valor;
    
	public alimento (String tipo, String nombre, int cantidad) {
		
		super(tipo, nombre, cantidad);
		
		this.valor = valor;

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	}

