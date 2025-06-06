package practico4;

abstract class obraarte {
	
	 private String titulo;
	 private String autor;
	 private int dimenciones;

	public obraarte(String titulo, String autor, int dimenciones) {
		
		this.setTitulo(titulo);
        this.setAutor(autor);
        this.setDimenciones(dimenciones);

	}
	public String mostrar(){
		return "titulo:" + getTitulo() + " autor:" + getAutor() + " dimenciones:" + getDimenciones();

		}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getDimenciones() {
		return dimenciones;
	}
	public void setDimenciones(int dimenciones) {
		this.dimenciones = dimenciones;
	}
}