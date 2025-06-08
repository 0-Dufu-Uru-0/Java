package practico4;

public class Fotografia extends ObraArte {
    
    public Fotografia(String autor, String descripcion, int fecha) {
        super(autor, descripcion, fecha);
    }
    
    @Override
    public String mostrar() {
        return "Autor: " + getAutor() + " | Descripción: " + getCaracteristica() + " | Fecha: " + getValor();
    }
}
