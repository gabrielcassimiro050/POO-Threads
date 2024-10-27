package Atividade_05;

import sun.awt.image.ImageWatched;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Fila fila = new Fila();

        Thread[] consumir = new Thread[10];
        Thread[] produzir = new Thread[10];

        for(int i = 0; i < 10; ++i){
            consumir[i] = new Thread(new Consumidor(fila, i));
            produzir[i] = new Thread(new Produtor(fila, i));

            produzir[i].start();
            consumir[i].start();
        }
    }
}
