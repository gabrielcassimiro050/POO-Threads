package Atividade_05;

import java.util.Queue;

public class Consumidor implements Runnable{

    int id;
    Fila fila;

    Consumidor(Fila fila, int id){
        this.fila = fila;
        this.id = id;
    }
    @Override
    public void run(){
        int j = 0;
        do {
            if(!fila.isEmpty()) {
                int i = fila.poll();
                System.out.println(id+" Removeu " + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ++j;
        }while(true);
    }
}
