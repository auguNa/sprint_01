package s01_01.n1ejercicio1;

public class InstrumentoCuerda extends Instrumento{
    public InstrumentoCuerda(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void tocacar() {
        System.out.println("Esta sonando un instumento de cuerda");
    }

}
