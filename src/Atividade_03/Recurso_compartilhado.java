package Atividade_03;

public class Recurso_compartilhado {
    boolean disponivel;

    public synchronized void par(int i) throws InterruptedException {
        while(disponivel){
            wait();
        }
        System.out.println(i);
        disponivel = true;
        notify();
    }

    public synchronized void impar(int i) throws InterruptedException {
        while(!disponivel){
            wait();
        }
        System.out.println(i);
        disponivel = false;
        notify();
    }
}
