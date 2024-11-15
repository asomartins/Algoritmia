package FichaTrabalho_00;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14, area, raio;

        System.out.println("Digite o valor do raio: ");
        raio = input.nextDouble();

        area = pi * (raio*raio);
        System.out.println("a área da circunferência é: " + area);
    }
}
