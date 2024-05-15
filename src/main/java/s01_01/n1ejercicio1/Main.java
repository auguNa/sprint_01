package s01_01.n1ejercicio1;

public class Main {
    public static void main(String[] args) {
        InstrumentoViento flauta = new InstrumentoViento("Flauta", 100);
        InstrumentoCuerda guitarra = new InstrumentoCuerda("Guitarra", 200);
        InstrumentoPercucion bateria = new InstrumentoPercucion("Bateria", 300);

        System.out.println(Instrumento.class.getSimpleName());
    }
}