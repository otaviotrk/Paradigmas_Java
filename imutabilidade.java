public class imutabilidade {
    // Exemplos de uso do 'final'
    private final String name;
    private final int age;
    
    // Construtor para inicializar os campos 'name' e 'age'
    public imutabilidade(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Métodos apenas de leitura, sem setters para modificar os campos
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}
