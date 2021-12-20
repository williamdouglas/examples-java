package main.java.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExampleAPIJava8 {
    private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        casa.obterAfazeresDaCasa().forEach(atividade -> pessoasParaExecutarAtividade.execute(
                // () -> atividade.realizar()));
                atividade::realizar));
        pessoasParaExecutarAtividade.shutdown();
    }
}
