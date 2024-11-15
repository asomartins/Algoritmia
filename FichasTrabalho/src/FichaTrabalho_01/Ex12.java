package FichaTrabalho_01;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecione uma opção \n1.Criar\n2.Atualizar\n3.Eliminar\n4.Sair");
        int opcao = input.nextInt();
        String operacao = "";

        switch (opcao) {
            case 1:
                operacao = "Criar";
                break;
            case 2:
                operacao = "Atualizar";
                break;
            case 3:
                operacao = "Eliminar";
                break;
            case 4:
                operacao = "Sair";
                break;
            default:
                System.out.println("Erro: Operação inválida");
        }
        if (!operacao.isEmpty())
            System.out.println("Operação escolhida: " + operacao);
    }
}
