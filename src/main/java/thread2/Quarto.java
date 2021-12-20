package main.java.thread2;

import java.util.Arrays;
import java.util.List;

public class Quarto extends Comodo{

    @Override
    List<Atividade> obterAfazeresDoComodo() {
        // ArrayList<Atividade> objects = new ArrayList<>();
        // objects.add(this::arrumarCama);
        // objects.add(this::arrumarGuardaRoupa);
        // objects.add(this::arrumarCama);
        // return objects;

        return Arrays.asList(this::arrumarCama, this::arrumarGuardaRoupa, this::varrerQuarto);
    }

    private void arrumarGuardaRoupa() {
        System.out.println("Arrumar guarda roupa");
    }

    private void varrerQuarto() {
        System.out.println("Varrer quarto");
    }

    private void arrumarCama() {
        System.out.println("Arrumar cama");
    }
}