package practico1;

public class ropa extends producto{
	
	private int valor;
    
	public ropa (String tipo, String marca, int cantidad) {
		
		super(tipo, marca, cantidad);
		
		this.valor = valor;

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setCantidad(int nextInt) {
		
	}

	public String getCantidad() {
		return null;
	}

	@Override
	public String getTipo() {
		return super.getTipo();
		
	}

	@Override
	public String getMarca() {
		return super.getMarca();
	}


	}
