package s01_03.n1ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App.start();
        Scanner sc = new Scanner(System.in);
        ArrayList<Redactor> redactors = new ArrayList<>();

        int opcion;
        do {
            System.out.println("1.- Introducir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introducir noticia a un redactor.");
            System.out.println("4.- Eliminar noticia (debe pedir redactor y titular de la noticia).");
            System.out.println("5.- Mostrar todas las noticias por redactor.");
            System.out.println("6.- Calcular puntuación de la noticia.");
            System.out.println("7.- Calcular precio-noticia.");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    introducirRedactor(redactors);
                    break;
                case 2:
                    eliminarRedactor(redactors);
                    break;
                case 3:
                     introducirNoticia(redactors);
                    break;
                case 4:
                    //  eliminarNoticia(redactors);
                    break;
                case 5:
                    // mostrarNoticias(redactors);
                    break;
                case 6:
                    //calcularPuntuacion(redactors);
                    break;
                case 7:
                    // calcularPrecioNoticia(redactors);
                case 0:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 0);
    }

    public static void introducirRedactor(ArrayList<Redactor> redactors) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dni: ");
        String dni = sc.nextLine();

        Redactor redactor = buscarRedactor(redactors, dni);
        if (redactor == null) {
            redactor = crearRedactor(redactors, dni);
            redactors.add(redactor);
            System.out.println("Redactor creado con exito!");
        } else {
            System.out.println("El Redactor ya existe!");
        }
    }

    public static Redactor buscarRedactor(ArrayList<Redactor> redactors, String dni) {
        int i = 0;
        Redactor redactor = null;
        while (i < redactors.size() && redactor == null) {
            if (redactors.get(i) instanceof Redactor && redactors.get(i).getDni().equalsIgnoreCase(dni)) {
                redactor = (Redactor) redactors.get(i);
            }
            i++;
        }
        return redactor;
    }

    public static Redactor crearRedactor(ArrayList<Redactor> redactors, String dni) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = sc.nextLine();
        Redactor redactor = new Redactor(nombre, dni);
        return redactor;
    }

    public static void eliminarRedactor(ArrayList<Redactor> redactors) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el DNI del redactor: ");
        String dni = sc.next();

        Redactor redactor = buscarRedactor(redactors, dni);
        if (redactor != null) {
            redactors.remove(redactor);
            System.out.println("Redactor eliminado con éxito.");
        } else {
            System.out.println("El redactor no se encuentra en la aplicación.");
        }
    }

    public static void introducirNoticia (ArrayList<Redactor> redactors){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el DNI del redactor: ");
        String dni = sc.next();

        Redactor redactor = buscarRedactor(redactors, dni);
        if (redactor != null) {
            System.out.println("Introduce el tipo de noticia: 1. Futbol || 2. Baloncesto || 3. Tenis || 4. F1 || 5. Motociclismo");
            int tipoNoticia = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce el titular de la noticia: ");
            String nombreTitular = sc.nextLine();

            Noticia noticia = buscarNoticia(redactor.getNoticiaEscrita(), nombreTitular);
            switch (tipoNoticia){
                case 1:
                    Futbol futbol = buscarFutbol(redactors, nombreTitular);
            }
        }
    }
    public static Noticia buscarNoticia(ArrayList<Noticia> noticias, String nombreTitular){
        int i= 0;
        Noticia noticia = null;
        while (i < noticias.size() && noticia == null){
            if(nombreTitular.equalsIgnoreCase(noticias.get(i).titular)) {
                noticia = noticias.get(i);
            }
            i++;
        }
        return noticia;
    }
}
