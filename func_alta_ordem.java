import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class func_alta_ordem {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Definindo funções de transformação usando lambda
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> doubleIt = x -> x * 2;
        
        // Usando 'map' para aplicar as funções aos elementos da lista
        numbers.stream()
               .map(square.andThen(doubleIt))  // Compondo funções usando 'andThen'
               .forEach(System.out::println);
    }
}
