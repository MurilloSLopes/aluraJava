package br.com.alura.condicionais;
import java.util.Scanner; // Importação necessária para ativar a leitura de dados do teclado

public class Exercicios {
    public static void main(String[] args) {
        // --- EXERCICIO 01 ---
        // Descobrir se um número é par ou ímpar
        int numero = 4;
        if (numero % 2 == 0) { // O operador % retorna o resto da divisão. Se o resto da divisão por 2 for 0, é par.
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
        System.out.println();

        // --- EXERCICIO 02 ---
        // Estrutura condicional encadeada (if / else if / else)
        double media = 4.3;
        if (media >= 7.0) {
            System.out.println("O estudante teve média " + media + " e foi aprovado");
        } else if (media <= 5.0) { // Só chega aqui se a primeira condição (>= 7.0) for falsa
            System.out.println("O estudante teve media " + media + " e foi reprovado");
        } else { // Se não for >= 7.0 e nem <= 5.0, cai no "caso contrário" (recuperação)
            System.out.println("O estudante teve media " + media + " e esta de recuperação");
        }
        System.out.println();

        // --- EXERCICIO 03 ---
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in); // Criando a ferramenta leitora apenas ''''UMA VEZ'''' no código '''TODO'''

        System.out.print("Digite sua senha: ");
        String tentativasenha = scanner.nextLine(); // Pausa o programa e aguarda o "Enter" para capturar o texto digitado

        // Para comparar o conteúdo de Strings (textos), usamos SEMPRE o .equals() em vez de ==
        if (tentativasenha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado!");
        }
        System.out.println();

        // --- EXERCICIO 04 ---
        // Reutilizando o mesmo Scanner criado no Ex 03
        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt(); // Captura números inteiros
        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("O maior numero é " + numero1 + ".");
        } else if (numero1 < numero2) {
            System.out.println("O maior numero é " + numero2 + ".");
        } else {
            System.out.println("Numeros iguais!");
        }
        System.out.println();

        // --- EXERCICIO 05 ---
        System.out.print("Digite o valor da compra: ");
        double compra = scanner.nextDouble();
        scanner.nextLine(); // Limpeza de buffer! Necessário para "engolir" o Enter que sobrou do nextDouble() acima

        if (compra >= 100.00) {
            System.out.println("Desconto de 10% aplicado!\n" +
                    "Novo valor: R$" + (compra * 0.90)); // Multiplicar por 0.90 já dá o valor final (90% do original)
        } else {
            System.out.println("Nenhum desconto aplicado!\n" +
                    "Valor total: R$" + compra);
        }
        System.out.println();

        // --- EXERCICIO 06 ---
        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String diaSemana = scanner.nextLine(); // Funciona perfeitamente porque o buffer foi limpo no exercício anterior

        // O operador || significa "OU". Se QUALQUER uma das condições for verdadeira, ele entra no if.
        if (diaSemana.equals("segunda") || diaSemana.equals("terca") || diaSemana.equals("quarta")
                || diaSemana.equals("quinta") || diaSemana.equals("sexta")) {
            System.out.println(diaSemana + " é um dia util");
        } else {
            System.out.println(diaSemana + " não é um dia util.");
        }
        System.out.println();

        // --- EXERCICIO 07 ---
        System.out.print("Digite o valor do empréstimo: ");
        int valor = scanner.nextInt();
        scanner.nextLine(); // Nova limpeza de buffer após a leitura de um número (nextInt)

        // O operador && significa "E". AMBAS as condições precisam ser verdadeiras para entrar no if.
        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido para empréstimo.");
        }
        System.out.println();

        // --- EXERCICIO 08 ---
        System.out.print("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();

        // Condição complexa validando todas as regras matemáticas de um triângulo usando o operador && (E)
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
        System.out.println();

        // --- EXERCICIO 09 ---
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        // Armazenando o resultado das condições lógicas (true ou false) direto em variáveis booleanas.
        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível para doação de sangue.");
        } else {
            System.out.println("O doador não é compatível. Motivo:");
            // O operador ! (NOT) inverte o valor booleano. Se a idadeValida for false, o ! a transforma em true para mostrar o erro.
            if (!idadeValida) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("- Deve pesar mais de 50 kg.");
            }
        }
        System.out.println();

        // --- EXERCICIO 10 ---
        int codigoCorreto = 2023;
        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        System.out.print("Digite o código de acesso: ");
        int codigoDigitado = scanner.nextInt();
        System.out.print("Digite o nível de permissão: ");
        int nivelPermissao = scanner.nextInt();

        // Separar as regras complexas em variáveis booleanas com nomes descritivos deixa o if principal muito mais limpo
        boolean codigoValido = codigoDigitado == codigoCorreto;
        boolean permissaoValida = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo;

        if (codigoValido && permissaoValida) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. Motivo(s):");
            if (!codigoValido) {
                System.out.println("- Código de acesso incorreto.");
            }
            if (!permissaoValida) {
                System.out.println("- Nível de permissão inválido.");
            }
        }
        System.out.println();
        scanner.close(); // Encerra a conexão com o teclado UMA ÚNICA VEZ ao final de todos os exercícios
    }
}