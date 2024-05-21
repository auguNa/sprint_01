package s01_02.n1ejercicio1;

public class Smartphone extends Telefono implements Camara, Reloj {
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }


    public String fotografiar() {
        return "Se está haciendo una foto";
    }


    public String alarma() {
        return "Está sonando la alarma";
    }
}
