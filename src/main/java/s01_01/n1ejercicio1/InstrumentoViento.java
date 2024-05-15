package s01_01.n1ejercicio1;

public class InstrumentoViento extends Instrumento {

    public InstrumentoViento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocacar() {
        System.out.println("Esta sonando un instrumento de viento");
    }
}
