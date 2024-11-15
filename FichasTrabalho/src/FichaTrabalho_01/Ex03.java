package FichaTrabalho_01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double imposto, salario;
        System.out.println("Insira o salário: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            imposto = 0.2 * salario;
            salario *= 0.8;
        } else if (salario > 15000 && salario <= 20000) {
            imposto = 0.3 * salario;
            salario *= 0.7;
        } else if (salario > 20000 && salario <= 25000) {
            imposto = 0.35 * salario;
            salario *= 0.65;
        } else {
            imposto = 0.4 * salario;
            salario *= 0.6;
        }

        System.out.println("Imposto a pagar: " + imposto);
        System.out.println("Novo salário: " + salario);
    }
}
