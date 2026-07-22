package br.com.alura.condicionais;

public class Principal {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 2890.00;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor irrf: " + irrf);
        } else if (isento) {
            System.out.println("Isento de irrf");
        } else {
            System.out.println("Não a valor de irrf.");
        }


    }
}
