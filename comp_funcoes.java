import java.util.function.Function;

public class comp_funcoes {
    public static void main(String[] args) {
        // Definindo funções de transformação
        Function<Integer, Integer> addOne = x -> x + 1;
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;
        
        // Compondo as funções usando 'andThen' e 'compose'
        Function<Integer, Integer> composed = addOne.andThen(multiplyByTwo);
        
        System.out.println(composed.apply(5));  // Saída: 12
    }
}
