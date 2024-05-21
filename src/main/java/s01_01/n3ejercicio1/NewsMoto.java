package s01_01.n3ejercicio1;

public class NoticiaMotociclismo extends Noticia {
    private String equipo;
    private static int contador = 1;
    private final int id;

    public NoticiaMotociclismo(String titular, String equipo) {
        super(titular);
        this.equipo = equipo;
        this.id = contador ++;
        calcularPrecioNoticia();
        calcularPuntuacion();
    }

    @Override
    public void calcularPrecioNoticia() {
        this.precio = 100;
        if (equipo.equalsIgnoreCase("Honda") || equipo.equalsIgnoreCase("Yamaha")) {
            precio += 50;
        }
        setPrecio(precio);
    }

    @Override
    public void calcularPuntuacion() {
        int puntuacion = 3;
        if (equipo.equalsIgnoreCase("Honda") || equipo.equalsIgnoreCase("Yamaha")) {
            puntuacion += 3;
        }
        setPuntuacion(puntuacion);

    }

    @Override
    public String toString() {
        return "NoticiaMotociclismo{" +
                "equipo='" + equipo + '\'' +
                ", titular='" + titular + '\'' +
                ", texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                ", precio=" + precio +
                '}';
    }
}
