package s01_03.n1ejercicio1;

public abstract class Noticia {
    protected String titular;
    protected String texto;
    protected int puntuacion;
    public double precio;

    public Noticia(String titular, String texto, int puntuacion, double precio) {
        this.titular = titular;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.precio = precio;
    }

    public abstract double calcularPrecioNoticia();
}
