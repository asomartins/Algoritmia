package FichaTrabalho_00;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma, subtracao, multiplicacao, divisao;

        System.out.println("Insira um número");
        num1 = input.nextInt();
        System.out.println("Insira um número");
        num2 = input.nextInt();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        System.out.println("Soma = "+soma);
        System.out.println("Subtração = "+subtracao);
        System.out.println("Multiplicação = "+multiplicacao);
        System.out.println("Divisão = "+divisao);
    }
}
