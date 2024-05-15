package s01_03.n1ejercicio1;

import java.util.ArrayList;

public class Redactor {
    private String nombre;
    protected final String DNI;
    private double sueldo =1500;
    private ArrayList <Noticia> noticiaEscrita;

    public Redactor(String nombre, String dni) {
        this.nombre = nombre;
        DNI = dni;
        this.sueldo = sueldo;
        this.noticiaEscrita = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Noticia> getNoticiaEscrita() {
        return noticiaEscrita;
    }

    public String getDni() {
        return DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String toString() {
        return "Redactor" +
                "nombre='" + nombre + '\'' +
                ", dni='" + DNI + '\'' +
                ", sueldo=" + sueldo;
    }
}
