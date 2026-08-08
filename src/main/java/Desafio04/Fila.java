package Desafio04;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
    private Queue<Person> filaJovem = new ArrayDeque<>();
    private Queue<Person> filaEspecial = new ArrayDeque<>();
    
    public void addClient(Person person){
    }
    
    public void callClient(Person person){
    }
    
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        Fila fila = new Fila();

        int op = 0;

        while (op != 3){
            System.out.println("Controle de Acesso");
            System.out.println("[1] - Entrar na fila");
            System.out.println("[2] - Chamar o cliente da fila");
            System.out.println("[3] - Sair");
            System.out.print("Escolha uma opção: ");
            op = SC.nextInt();

            switch (op){
                case 1 -> {
                    System.out.print("Insira seu nome: ");
                    String nome = SC.nextLine();
                    
                    System.out.println("Você é prioritario? ");
                    boolean prioritario;
                }

                case 2 -> {
                }

                case 0 -> {
                    System.out.println("Saindo...");
                }
            }
        }
        
        
    }
}
