package practico1;

public class ropa {
    private String tipo;
    private String marca;
    private int codigo;

    public ropa(String tipo, String marca, int codigo) {
        this.tipo = tipo;
        this.marca = marca;
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String nuevoTipo) {
        this.tipo = nuevoTipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int nuevoCodigo) {
        this.codigo = nuevoCodigo;
    }
}
