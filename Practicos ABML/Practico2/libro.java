package practico2;

public class libro {
    private String nombre;
    private String autor;
    private int anio;
    private int codigo;

    public libro(String nombre, String autor, int anio, int codigo) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getMarca() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int nuevoAnio) {
        this.anio = nuevoAnio;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int nuevoCodigo) {
        this.codigo = nuevoCodigo;
    }
}