package FichaTrabalho_01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.println("Insira o primeiro valor");
        num1 = input.nextInt();
        System.out.println("Insira o segundo valor");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.println("Maior número:" + num1);
        else
            System.out.println("Maior número:" + num2);
    }
}