package Atividade_04;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Valor valor = new Valor();
        Thread[] thread = new Thread[5];

        for(int i = 0; i < 5; ++i){
            thread[i] = new Thread(new Contador(valor, i+1));
        }

        for(int i = 0; i < 5; ++i){
            thread[i].start();
            thread[i].join();
        }

        System.out.println("Valor final: " + valor.toString());
    }
}
