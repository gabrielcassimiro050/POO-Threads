package Atividade_06;

public class Consumidor implements Runnable{
    Fila fila;
    Consumidor(Fila fila){
        this.fila = fila;
    }
    @Override
    public void run(){
        int j = 0;
        do {
            if(!fila.isEmpty()) {
                int i = fila.poll();
                System.out.println("Removeu " + i);
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
