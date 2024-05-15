package s01_01.n1ejercicio2;

public class Coche {
    private static final String marca = "Toyota";
    private static String modelo;
    private final int potencia;

    public Coche(String modelo, int potencia) {
        Coche.modelo = modelo;
        this.potencia = potencia;
    }

    public static void frenar() {
        System.out.println("El vehículo está frenando");
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }

    public static String getMarca() {
        return marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

   }
