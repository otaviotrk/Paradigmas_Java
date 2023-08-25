import java.util.function.Function;

public class currying {
    public static void main(String[] args) {
        // Definindo uma função que realiza currying
        Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;
        
        // Aplicação parcial da função 'add' para criar uma nova função 'addFive'
        Function<Integer, Integer> addFive = add.apply(5);
        
        int result = addFive.apply(3);  // Saída: 8 (5 + 3)
        System.out.println(result);
    }
}
