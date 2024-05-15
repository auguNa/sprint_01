package s01_03.n1ejercicio1;

public class Futbol extends Noticia{
    private String competicion;
    private  String club;
    private String jugador;

    public Futbol(String titular, String texto, int puntuacion, double precio, String competicion, String club, String jugador) {
        super(titular, texto, puntuacion, precio);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
    }


    public double calcularPrecioNoticia(String competicion, String club, String jugador) {
        this.precio = 300;
        double precioTotal;
        return 0;
    }

    public double calcularPrecioNoticia() {
        return 0;
    }
}
