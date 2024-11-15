package FichaTrabalho_00;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        double num1, num2, num3, notaPeso1, notaPeso2, notaPeso3, somaPesos, somaPonderada, mediaAritmetica, mediaPonderada;

        System.out.println("Digite um número: ");
        num1 = inputUser.nextDouble();
        System.out.println("Digite um número: ");
        num2 = inputUser.nextDouble();
        System.out.println("Digite um número: ");
        num3 = inputUser.nextDouble();

        System.out.println("***********************");
        mediaAritmetica = (num1 + num2 + num3) / 3;
        System.out.println("A média dos números é: " +mediaAritmetica);

        notaPeso1 = num1 * 0.2;
        notaPeso2 = num2 * 0.3;
        notaPeso3 = num3 * 0.5;

        somaPonderada = notaPeso1 + notaPeso2 + notaPeso3;
        somaPesos = 0.2 + 0.3 + 0.5;

        mediaPonderada = somaPonderada / somaPesos;

        System.out.println("A média ponderada dos números é: " +mediaPonderada);
    }
}
