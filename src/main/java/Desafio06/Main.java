package Desafio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Peca peca = new Peca();

        int op = 99;

        while (op != 0) {
            System.out.println("Registro central");
            System.out.println("[1] - Cadastrar peça padrão");
            System.out.println("[2] - Cadastrar peça frágil");
            System.out.println("[0] - Cadastrar peça pesada");
            System.out.print("Escolha uma opção: ");
            op = SC.nextInt();

            switch (op) {
                case 1 -> {

                }

                case 2 -> {

                }

                case 0 -> {

                }
            }
        }
    }
}
