package FichaTrabalho_00;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        double largura, altura, area, perimetro;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a largura: ");
        largura = input.nextDouble();

        System.out.println("Insira a altura: ");
        altura = input.nextDouble();

        area = largura * altura;
        System.out.println("Valor da área:"+area);

        perimetro = 2 * (largura + altura);
        System.out.println("Valor do perímetro: "+perimetro);
    }
}
