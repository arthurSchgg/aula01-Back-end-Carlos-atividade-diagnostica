package Desafio03;

import java.util.HashSet;
import java.util.Scanner;

public class ControleAcesso {
    private HashSet<Integer> listaIds = new HashSet<>();
        
        public void addPerson(int id){
            if(!listaIds.contains(id)){
                listaIds.add(id);
            } else {
                System.out.println("Acesso negado: Participante já está lá dentro!");
            }
        }
        
        public void listPersons(){
            System.out.println("Quantidade exata de pessoas: " + listaIds.size());
        }

    
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        ControleAcesso controleAcesso = new ControleAcesso();

        int op = 0;

        while (op != 3){
            System.out.println("Controle de Acesso");
            System.out.println("[1] - Entrar no evento");
            System.out.println("[2] - Listar todos os participantes");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");
            op = SC.nextInt();

            switch (op){
                case 1 -> {
                    System.out.print("Insira o valor do deu id do crachá: ");
                    int numberCracha = SC.nextInt();

                    int id = 0;
                    controleAcesso.addPerson(id);
                }

                case 2 -> {
                    controleAcesso.listPersons();
                }

                case 0 -> {
                    System.out.println("Saindo...");
                }
            }
        }
    }
}
