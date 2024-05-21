package s01_02.n1ejercicio1;

public class Telefono {
    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public  String llamar(String numero){
        return "Se llama:" + numero;
    }
}
