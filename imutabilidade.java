import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class imutabilidade {
    public static void main(String[] args) {
        // Lista inicial de números (mutável)
        List<Integer> mutableNumbers = new ArrayList<>();
        mutableNumbers.add(1);
        mutableNumbers.add(2);
        mutableNumbers.add(3);
        
        // Criando uma cópia imutável da lista usando Collections.unmodifiableList
        List<Integer> immutableNumbers = Collections.unmodifiableList(mutableNumbers);

        // Tentando adicionar um novo número à lista imutável resultará em uma exceção
        try {
            immutableNumbers.add(4);  // Isso lançará uma exceção UnsupportedOperationException
             System.out.println("Adicionado com sucesso!");
        } catch (UnsupportedOperationException e) {
            System.out.println("Não é possível modificar uma lista imutável.");
        }
        
        // Imprimindo a lista imutável após a tentativa de adicionar o 4
        System.out.println("Lista Imutável: " + immutableNumbers);

        // A lista original ainda é mutável
        mutableNumbers.add(4);
        System.out.println("Lista Mutável: " + mutableNumbers);
    }
}
