package practico3;


public class casa {
    private String duenio;
    private String nombre;
    private int numdecasa;


    public casa(String duenio, String nombre, int numdecasa) {
        this.duenio = duenio;
        this.nombre = nombre;
        this.numdecasa = numdecasa;
    
    }

    public String getduenio() {
        return duenio;
    }

    public void setNombre(String nuevoDuenio) {
        this.duenio = nuevoDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumdecasa() {
        return numdecasa;
    }

    public void setNumdecasa(int nuevoNumdecasa) {
        this.numdecasa = nuevoNumdecasa;
    }
}