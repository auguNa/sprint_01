package s01_01.n1ejercicio1;

public class InstrumentoViento extends Instrumento {

    public InstrumentoViento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public String tocar() {
       return "Esta sonando un instrumento de viento";
    }
}
