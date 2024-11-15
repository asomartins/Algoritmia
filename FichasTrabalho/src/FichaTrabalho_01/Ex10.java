package FichaTrabalho_01;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número");
        double num1 = input.nextDouble();
        System.out.println("Insira o segundo número");
        double num2 = input.nextDouble();
        System.out.println("Qual a operação aritmética deseja realizar?");
        System.out.println("+ Soma\n- Subtração\n* Multiplicação\n/ Divisão");
        String opcao = input.next();
        double resultado = 0;

        switch (opcao) {
            case "+":
                System.out.println("Operação escolhida: Soma");
                resultado = num1 + num2;
                break;
            case "-":
                System.out.println("Operação escolhida: Subtração");
                resultado = num1 - num2;
                break;
            case "*":
                System.out.println("Operação escolhida: Multiplicação");
                resultado = num1 * num2;
                break;
            case "/":
                System.out.println("Operação escolhida: Divisão");
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Erro: Operação inválida.");
        }

        System.out.println("Resultado da operação: " + resultado);
    }
}
