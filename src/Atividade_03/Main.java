package Atividade_03;

public class Main {
    public static void main(String[] args) {
        Recurso_compartilhado recurso = new Recurso_compartilhado();
        Thread n_par_thread = new Thread(new N_pares(recurso));
        Thread n_impar_thread = new Thread(new N_impares(recurso));

        n_par_thread.start();
        n_impar_thread.start();
    }
}
