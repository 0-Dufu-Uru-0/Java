package practico2;

abstract class publiocacion {
		
	private String nombre;
	private String autor;
	private int anio;

	public publiocacion(String nombre, String autor, int anio) {
		this.setNombre(nombre);
        this.setAutor(autor);
        this.setAnio(anio);

	}
	public String mostrar(){
		return "nombre:" + getNombre() + " autor:" + getAutor() + " anio:" + getAnio();

		}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
}