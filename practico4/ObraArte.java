package practico4;

public abstract class ObraArte {
    private String autor;
    private String caracteristica;
    private int valor;
    
    public ObraArte(String autor, String caracteristica, int valor) {
        this.autor = autor;
        this.caracteristica = caracteristica;
        this.valor = valor;
    }
    
    public abstract String mostrar();
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getCaracteristica() {
        return caracteristica;
    }
    
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
