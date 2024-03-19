package java_poo.agregacao;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Apucarana", "86870000", "jacutinga");
        Pessoa pessoa1 = new Pessoa("Celso", 22, "10240728947", endereco1);

        pessoa1.falar("Oi Tudo Bem!");
    }    
}