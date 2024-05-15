package s01_01.n1ejercicio1;

public abstract class Instrumento {
    static {
        System.out.println("La clase Instrumento ha sido cargada.");
    }

    private String nombre;
    private double precio;

    public Instrumento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void tocacar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}

