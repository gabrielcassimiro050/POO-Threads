package Atividade_04;

public class Contador implements Runnable{
    Valor i;
    int id;

    Contador(Valor i, int id){
        this.i = i;
        this.id = id;
    }

    @Override
    public void run(){
        int j = 0;
        do {
            incrementar();
            ++j;
        }while(j < 100000);
        System.out.println("Thread "+id+" terminou em "+i.valor);
    }

    public synchronized void incrementar(){
        i.valor++;
    }
}
