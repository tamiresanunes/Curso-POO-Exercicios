package Condicionalquatro;

import java.util.Scanner;

public class Jogos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a hora de inicio do jogo");
        int I;
        I = entrada.nextInt();
        System.out.println("Informe a hora de fim do jogo");
        int F;
        F = entrada.nextInt();

        int duracao;

        if (I<F) {
            duracao = F - I;
            System.out.println("O jogo durou " +duracao+ " horas");
        } else {
            duracao = 24 - I + F;
            System.out.println("O jogo durou " +duracao+ " horas");
        }

        entrada.close();
    }
}
