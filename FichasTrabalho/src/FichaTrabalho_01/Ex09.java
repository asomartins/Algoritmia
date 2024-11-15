package FichaTrabalho_01;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo número");
        int num2 = input.nextInt();
        System.out.println("Insira o terceiro número");
        int num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Menor número: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("Menor número: " + num2);
        } else
            System.out.println("Menor número: " + num3);
    }
}
