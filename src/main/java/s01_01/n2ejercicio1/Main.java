package s01_02.n1ejercicio1;

public class Main {
    public static void main(String[] args) {
        Smartphone myphone = new Smartphone("N001", "NOKIA");

        System.out.println(myphone.alarma());
        System.out.println(myphone.fotografiar());
        System.out.println(myphone.llamar("66003342"));
    }
}