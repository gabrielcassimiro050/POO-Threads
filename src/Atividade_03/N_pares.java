package Atividade_03;

public class N_pares implements Runnable{

    Recurso_compartilhado recurso;

    N_pares(Recurso_compartilhado recurso){
        this.recurso = recurso;
    }

    @Override
    public void run(){
        int i = 0;
        do{
            if(i%2==0) {
                try {
                    recurso.par(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            ++i;
        }while(i<20);
    }

    public synchronized void espera() throws InterruptedException {
        wait();
    }

    public synchronized void notifica() throws InterruptedException {
        notify();
    }
}
