package practico3;

abstract class edificio {
		
	private String duenio;
	private String direccion;
	private int numpuerta;

	public edificio(String duenio, String direccion, int numpuerta) {
		this.setDuenio(duenio);
        this.setDireccion(direccion);
        this.setNumpuerta(numpuerta);

	}
	public String mostrar(){
		return "duenio:" + getDuenio() + " direccion:" + getDireccion() + " Numero de puerta:" + getNumpuerta();

		}
	public String getDuenio() {
		return duenio;
	}
	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumpuerta() {
		return numpuerta;
	}
	public void setNumpuerta(int numpuerta) {
		this.numpuerta = numpuerta;
	}
}