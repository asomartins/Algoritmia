package FichaTrabalho_01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o salário:");
        double salario = input.nextDouble();

        double taxa = 0;

        if (salario <= 15000) {
            taxa = salario * 0.2;
            System.out.println("Taxa a pagar (20%):" + taxa);
        } else {
            taxa = salario * 0.3;
            System.out.println("Taxa a pagar (30%)" + taxa);
        }
    }
}
