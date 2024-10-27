package Atividade_06;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Fila fila = new Fila();

        Thread consumir = new Thread(new Consumidor(fila));
        Thread produzir = new Thread(new Produtor(fila));

        produzir.start();
        consumir.start();
    }
}
