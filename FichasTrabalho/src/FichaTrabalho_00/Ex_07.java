package FichaTrabalho_00;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Pedir os preços dos produtos

        System.out.println("Insira o preço do primeiro produto");
        double preco1 = input.nextDouble();
        System.out.println("Insira o preço do segundo produto");
        double preco2 = input.nextDouble();
        System.out.println("Insira o preço do terceiro produto");
        double preco3 = input.nextDouble();

        System.out.println("********************************");

        //Aplicar o desconto de 10%
        double totalDesconto = (preco1 + preco2 + preco3) * 0.9;
        System.out.println("O Total com desconto é: "+totalDesconto);
    }
}
