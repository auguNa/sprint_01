package s01_01.n3ejercicio1;

public class NoticiaFutbol extends Noticia {
    private String competicion;
    private String club;
    private String jugador;
    private static int contador = 1;
    private final int id;


    public NoticiaFutbol(String titular, String competicion, String club,
                         String jugador) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
        this.id = contador ++;
        calcularPrecioNoticia();
        calcularPuntuacion();
    }

    public void calcularPrecioNoticia() {
        this.precio = 300;
        if (competicion.equalsIgnoreCase("Liga de Campeones")) {
            precio += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            precio += 100;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            precio += 50;
        }
        setPrecio(precio);
    }

    @Override
    public void calcularPuntuacion() {
        int puntuacion = 5;
        if (competicion.equalsIgnoreCase("Liga de Campeones")) {
            puntuacion += 3;
        } else if (competicion.equalsIgnoreCase("Liga")) {
            puntuacion += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            puntuacion += 1;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            puntuacion += 1;
        }
        setPuntuacion(puntuacion);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "NoticiaFutbol{" +
                "competicion='" + competicion + '\'' +
                ", club='" + club + '\'' +
                ", jugador='" + jugador + '\'' +
                ", titular='" + titular + '\'' +
                ", texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                ", precio=" + precio +
                '}';
    }
}





