package FichaTrabalho_01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double nota3 = input.nextDouble();
        double mediaPonderada = (nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.4) / (0.25 + 0.35 + 0.4);

        System.out.println("Nota: " + mediaPonderada);
        if (mediaPonderada > 9.5)
            System.out.println("Aluno aprovado");
        else
            System.out.println("Aluno reprovado");
    }
}
