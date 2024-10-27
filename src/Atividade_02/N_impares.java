package Atividade_02;

import java.util.Random;

public class N_impares implements Runnable{
    @Override
    public void run(){
        int i = 0;
        do{
            Random r = new Random();
            if(i%2!=0) System.out.println(i);
            try {
                Thread.sleep(r.nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ++i;
        }while(i<20);
    }
}
