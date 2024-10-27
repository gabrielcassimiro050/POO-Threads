package Atividade_06;

public class Produtor implements Runnable{

    Fila fila;
    Produtor(Fila fila){
        this.fila = fila;
    }

    @Override
    public void run(){
        int i = 0;
        do {
            fila.add(fila.size());
            System.out.println("Adicionou "+fila.size());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            ++i;
        }while(true);
    }
}
