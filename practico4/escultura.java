package practico4;

public class Escultura extends ObraArte {
    
    public Escultura(String autor, String forma, int medidas) {
        super(autor, forma, medidas);
    }
    
    @Override
    public String mostrar() {
        return "Autor: " + getAutor() + " | Forma: " + getCaracteristica() + " | Medidas: " + getValor();
    }
}
