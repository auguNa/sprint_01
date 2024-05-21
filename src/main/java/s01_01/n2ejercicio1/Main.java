package s01_01.n2ejercicio1;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("N001", "NOKIA");

        System.out.println(myPhone.alarma());
        System.out.println(myPhone.fotografiar());
        System.out.println(myPhone.llamar("66003342"));

    }
}