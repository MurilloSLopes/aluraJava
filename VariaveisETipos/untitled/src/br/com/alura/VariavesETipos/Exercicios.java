package br.com.alura.VariavesETipos;

public class Exercicios {
    public static void main(String[] args) {
        /* declaração de variaveis:
        String para nomes
        int para numeros inteiro
        double para numeros com ( , )
        boolean para opçao (true - false)
        */
        String nome = "Maria";
        int idade = 25;
        double altura = 1.68;
        boolean estudante = true;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante: " + estudante);
        System.out.println();//usando apenas para quebrar linha

        double valorDouble = 19.5; //defini o valor double como double
        int valorInt = (int) valorDouble; //conversao do valor double para int
        System.out.println("O valor do produto é: " + valorInt + "\n"); //outra maneira de quebrar linha é adicionando o ( + "\n")

        //tarefa usando os primitivos
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;
        double media = (nota1 + nota2 + nota3 ) / 3;
        System.out.println("A media das notas é: " + media);
        System.out.println();

        int celsius = 20;
        double fahrenheit = (celsius * 9.0 / 5.0 ) + 32;
        System.out.println("A temperatura em graus Fahrenheit: " + fahrenheit);
        System.out.println();

        String titulo = "O Pequeno Principe";
        String autor = "Antoine de Saint-Exupéry";
        int paginas = 96;
        double valor = 39.9;
        char categoria = 'F';
        String categoriaDescricao;
        if (categoria == 'F') {
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "Historia";
        } else {
            categoriaDescricao = "Categoria inválida";
        }
        System.out.println("Livro cadastrado: " + titulo + "\n" +
        "De " + autor + "\n" +
        "Ele possui " + paginas + " paginas\n" +
        "Custa R$" + valor + "\n" +
        "Pertence a categoria " + categoriaDescricao);
        System.out.println();


        double preco = 150.00;
        if (preco <= 50.00) {
            System.out.println("Categoria do produto: Econômico");
        } else if (preco > 50.00 && preco <= 200.00) {
            System.out.println("Categoria do produto: Intermediário");
        } else {
            System.out.println("Categoria do produto: Premium");
        }
        System.out.println();

        int numero = 7;
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        System.out.println();

        double valorReais = 451.50;
        double taxaCambio = 5.25;
        double valorDolares = valorReais / taxaCambio;
        System.out.println("O valor em dólares é: US$ " + valorDolares);
        System.out.println();

        int idade2 = 17;
        String mensagem;
        if (idade2 >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }
        System.out.println(mensagem);

    }
}
