package s01_01.n3ejercicio1;

import java.util.Objects;

public class NoticiaF1 extends Noticia {
    private String escuderia;
    private static int contador = 1;
    private final int id;

    public NoticiaF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
        this.id = contador ++;
        calcularPrecioNoticia();
        calcularPuntuacion();
    }

    @Override
    public void calcularPrecioNoticia() {
        this.precio = 100;
        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            precio += 50;
        }
        setPrecio(precio);
    }

    public int getId() {
        return id;
    }

    @Override
    public void calcularPuntuacion() {
        int puntuacion = 4;
        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            puntuacion += 2;
        }
        setPuntuacion(puntuacion);
    }

    @Override
    public String toString() {
        return "NoticiaF1{" +
                "escuderia='" + escuderia + '\'' +
                ", titular='" + titular + '\'' +
                ", texto='" + texto + '\'' +
                ", puntuacion=" + puntuacion +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoticiaF1 noticiaF1)) return false;
        return id == noticiaF1.id && Objects.equals(escuderia, noticiaF1.escuderia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(escuderia, id);
    }
}
