package FichaTrabalho_00;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalHora, totalMinutos, totalSegundos, minutoFaixa1, minutoFaixa2, minutoFaixa3, minutoFaixa4, minutoFaixa5, somaMinutos, segundosFaixa1, segundosFaixa2,segundosFaixa3, segundosFaixa4, segundosFaixa5, somaSegundos;

        System.out.println("Faixa 1 - Minutos:");
        minutoFaixa1 = input.nextInt();
        System.out.println("Faixa 1 - Segundos:");
        segundosFaixa1 = input.nextInt();
        System.out.println("Faixa 2 - Minutos:");
        minutoFaixa2 = input.nextInt();
        System.out.println("Faixa 2 - Segundos:");
        segundosFaixa2 = input.nextInt();
        System.out.println("Faixa 3 - Minutos:");
        minutoFaixa3 = input.nextInt();
        System.out.println("Faixa 3 - Segundos:");
        segundosFaixa3 = input.nextInt();
        System.out.println("Faixa 4 - Minutos:");
        minutoFaixa4 = input.nextInt();
        System.out.println("Faixa 4 - Segundos:");
        segundosFaixa4 = input.nextInt();
        System.out.println("Faixa 5 - Minutos:");
        minutoFaixa5 = input.nextInt();
        System.out.println("Faixa 5 - Segundos:");
        segundosFaixa5 = input.nextInt();

        somaMinutos = minutoFaixa1 + minutoFaixa2 + minutoFaixa3 + minutoFaixa4 + minutoFaixa5;
        somaSegundos = segundosFaixa1 + segundosFaixa2 + segundosFaixa3 + segundosFaixa4 + segundosFaixa5;

        totalHora =  ((somaMinutos * 60) + somaSegundos) / 3600;
        totalMinutos = (((somaMinutos * 60) + somaSegundos) % 3600) / 60;
        totalSegundos = somaSegundos % 60;

        System.out.println("Tempo total: "+totalHora+"H"+totalMinutos+"m"+totalSegundos+"s");
    }
}
