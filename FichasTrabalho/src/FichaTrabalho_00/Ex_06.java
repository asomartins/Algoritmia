package FichaTrabalho_00;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, valorExtra;

        System.out.println("Insira o valor 1");
        valor1 = input.nextInt();
        System.out.println("Insira o valor 2");
        valor2 = input.nextInt();

        /*
        valorExtra = valor1;
        valor1 = valor2;
        valor2 = valorExtra;

        System.out.println("Valor 1 = "+valor1);
        System.out.println("Valor 2 = "+valor2);

        */

        System.out.println("Valor 1: "+(valor1+valor2-valor1));
        System.out.println("Valor 2: "+(valor1+valor2-valor2));

    }
}
