package Atividade_02;

public class Main {
    public static void main(String[] args) {
        Thread n_par_thread = new Thread(new N_pares());
        Thread n_impar_thread = new Thread(new N_impares());

        n_par_thread.start();
        n_impar_thread.start();
    }
}
