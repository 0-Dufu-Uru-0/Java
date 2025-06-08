package practico4;

public class Pintura extends ObraArte {
    
    public Pintura(String autor, String textura, int numColores) {
        super(autor, textura, numColores);
    }
    
    @Override
    public String mostrar() {
        return "Autor: " + getAutor() + " | Textura: " + getCaracteristica() + " | Colores: " + getValor();
    }
}
