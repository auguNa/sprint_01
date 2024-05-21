package s01_01.n3ejercicio1;

public class NoticiaBaloncesto extends Noticia {
    private String competicion;
    private String club;
    private static int contador = 1;
    private final int id;

    public NoticiaBaloncesto(String titular, String competicion, String club) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
        this.id = contador ++;
        calcularPrecioNoticia();
        calcularPuntuacion();
    }
    public int getId() {
        return id;
    }
    @Override
    public void calcularPrecioNoticia() {
        this.precio = 250;
        if (competicion.equalsIgnoreCase("Euroliga")) {
            precio += 75;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            precio += 75;
        }
        setPrecio(precio);
    }

    @Override
    public void calcularPuntuacion() {
        int puntuacion = 4;
        if (competicion.equalsIgnoreCase("Euroliga")) {
            puntuacion += 3;
        } else if (competicion.equalsIgnoreCase("ABC")) {
            puntuacion += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            puntuacion += 1;
        }
        setPuntuacion(puntuacion);
    }

    @Override
    public String toString() {
        return "NoticiaBaloncesto{" +
                "competicion='" + competicion + '\'' +
                ", club='" + club + '\'' +
                ", titular='" + titular + '\'' +
                ", texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                ", precio=" + precio +
                '}';
    }
}
