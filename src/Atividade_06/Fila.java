package Atividade_06;

import java.util.ArrayList;

public class Fila {
    ArrayList<Integer> fila;
    Fila(){
        fila = new ArrayList<Integer>();
    }
    public synchronized void add(int i){
        fila.add(i);
    }

    public synchronized int poll(){
        int value = fila.get(0);
        fila.remove(0);
        return value;
    }

    public boolean isEmpty(){
        return fila.size()==0 ? true : false;
    }

    public int size(){
        return fila.size();
    }
}
