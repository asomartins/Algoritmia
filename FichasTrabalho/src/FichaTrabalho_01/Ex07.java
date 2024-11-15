package FichaTrabalho_01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza um número: ");
        int num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("O número é par");
        else
            System.out.println("O número é ímpar");
    }
}