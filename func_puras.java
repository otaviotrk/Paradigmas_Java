import java.util.function.Function;

public class func_puras {
    public static void main(String[] args) {
        // Definindo uma função pura: sempre retorna o mesmo resultado para o mesmo argumento
        Function<Integer, Integer> addTwo = x -> x + 2;
        
        int result = addTwo.apply(3);  // Resultado sempre será 5, independentemente do contexto
        System.out.println(result);
    }
}
