package FichaTrabalho_00;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Inserir numeros - variaveis
        int num1, num2, soma;
        System.out.println("Insira um número:");
        num1 = input.nextInt();
        System.out.println("Insira um número:");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println("O resultado da soma é: "+soma);
    }
}
