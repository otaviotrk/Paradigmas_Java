public class recursao {
    // Função recursiva para calcular o fatorial de um número
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));  // Saída: 120
    }
}
