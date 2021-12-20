package main.java.anonymous_inner_class_and_lambda;

public class WithAnonymousClass {
    public static void main(String[] args) {
        // Anonymous inner classes containing only one method should became lambdas
        Function addPrefix = new Function() {
            @Override
            public String generate(String nome) {
                return "Sr. " + nome;
            }
        };

        System.out.println(addPrefix.generate("William"));
    }
}

/* 
Other sonarlint examples:

Noncompliant Code Example
myCollection.stream().map(new Mapper<String,String>() {
  public String map(String input) {
    return new StringBuilder(input).reverse().toString();
  }
});

Predicate<String> isEmpty = new Predicate<String> {
    boolean test(String myString) {
        return myString.isEmpty();
    }
}
Compliant Solution
myCollection.stream().map(input -> new StringBuilder(input).reverse().toString());

Predicate<String> isEmpty = myString -> myString.isEmpty();
*/