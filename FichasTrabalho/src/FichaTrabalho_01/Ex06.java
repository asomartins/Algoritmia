package FichaTrabalho_01;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Introduza o segundo número: ");
        int num2 = input.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " " + num2);
        else if (num2 > num1)
            System.out.println(num2 + " " + num1);
        else
            System.out.println("Números iguais");
    }
}