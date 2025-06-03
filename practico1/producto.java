package practico1;

abstract class producto {
	
private String tipo;
private String marca;
private int modelo;

public producto(String tipo, String marca, int modelo) {
	this.setTipo(tipo);
	this.setMarca(marca);
	this.modelo = (modelo);

}

public String mostrar(){
return "tipo:" + getTipo() + "marca:" + getMarca() + "modelo:" + getModelo();

}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getModelo() {
	return modelo;
}

public void setModelo(int modelo) {
	this.modelo = modelo;
}


}




