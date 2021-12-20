package main.java.thread3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import javax.swing.GroupLayout.ParallelGroup;

public class ParallelStreamExample {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Duracao: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(ParallelStreamExample::fatorial);
        fim = System.currentTimeMillis();
        System.out.println("Duracao: " + (fim - inicio));

        List<String> nomes = Arrays.asList("William", "Douglas", "Oliveira", "Santos");
        nomes.parallelStream().forEach(System.out::println);
    }

    static long fatorial(long num) {
        long fat = 1;

        for (int i = 2; i <= num; i++) {
            fat *= i;
        }

        return fat;
    }
}
