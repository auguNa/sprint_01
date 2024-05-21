package s01_03.n2ejercicio2;

import java.util.Objects;

public class Restaurante implements Comparable<Restaurante> {
    private String nombre;
    private int puntuacion;

    // Constructor
    public Restaurante(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    // Override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return puntuacion == that.puntuacion && Objects.equals(nombre, that.nombre);
    }

    // Override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombre, puntuacion);
    }

    // Implement compareTo
    @Override
    public int compareTo(Restaurante other) {
        int nameComparison = this.nombre.compareTo(other.nombre);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.puntuacion, other.puntuacion);
        }
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", puntuación: " + puntuacion;
    }}