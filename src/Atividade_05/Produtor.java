package Atividade_05;

import java.util.Queue;

public class Produtor implements Runnable{

    int id;
    Fila fila;

    Produtor(Fila fila, int id){
        this.fila = fila;
        this.id = id;
    }

    @Override
    public void run(){
        int i = 0;
        do {
            fila.add(fila.size());
            System.out.println(id+" Adicionou "+fila.size());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            ++i;
        }while(true);
    }
}
