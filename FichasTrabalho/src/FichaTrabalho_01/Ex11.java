package FichaTrabalho_01;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduza um saldo médio:");
        double saldo = input.nextDouble();
        System.out.println("Introduza o valor a movimentar:");
        double valorMovimento = input.nextDouble();

        if (valorMovimento < 0)
            saldo = saldo - (valorMovimento*(-1));
        else
            saldo = saldo + valorMovimento;

        if (saldo > 0){
            System.out.println("Saldo atual:"+saldo);
        }
        else {
            System.out.println("Operação inválida. Saldo insuficiente.");
        }
    }

}
