package s01_01.n3ejercicio1;

public class NoticiaTenis extends Noticia{
    private String competicion;
    private String jugador;
    private static int contador = 1;
    private final int id;

    public NoticiaTenis(String titular, String competicion, String jugador) {
        super(titular);

        this.competicion = competicion;
        this.jugador = jugador;
        this.id = contador ++;
        calcularPrecioNoticia();
        calcularPuntuacion();
    }
    public int getId() {
        return id;
    }
    @Override
    public void calcularPrecioNoticia() {
        this.precio = 150;
        if (jugador.equalsIgnoreCase("Federer, Navidad, Djokovic")) {
            precio += 100;
        }
        setPrecio(precio);
    }


    @Override
    public void calcularPuntuacion() {
        int puntuacion = 4;
        if(jugador.equalsIgnoreCase("Federer, Navidad, Djokovic")){
            puntuacion += 3;
        }
    }

    @Override
    public String toString() {
        return "NoticiaTenis{" +
                "competicion='" + competicion + '\'' +
                ", jugador='" + jugador + '\'' +
                ", titular='" + titular + '\'' +
                ", puntuacion=" + puntuacion +
                ", texto='" + texto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
