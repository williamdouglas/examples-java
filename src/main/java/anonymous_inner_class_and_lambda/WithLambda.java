package main.java.anonymous_inner_class_and_lambda;

public class WithLambda {
    public static void main(String[] args) {
        Function addPrefix = valor -> "Sr. " + valor;

        System.out.println(addPrefix.generate("William"));
    } 
}