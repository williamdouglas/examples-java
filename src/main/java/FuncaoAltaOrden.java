package main.java;

public class FuncaoAltaOrden {
    public static void main(String[] args) {
        // lambda que recebe os parâmetros e especifica comportamento
        Calculo soma = (a, b) -> a + b;

        // chamando interface funcional diretamente via lambda
        System.out.println(soma.calcular(3, 4));

        // chamando funcao de alta ordem
        System.out.println(executarOperacao(soma, 4, 5));
    }

    // função de alta ordem que executa uma função recebida como parâmetro
    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

// interface funcional de alta ordem que especifica parâmetros
@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}