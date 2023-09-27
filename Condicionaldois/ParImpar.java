package Condicionaldois;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número para verificar se ele é par ou ímpar");

        int N;
         N = entrada.nextInt();

         if (N % 2 == 0) {
            System.out.println("O número informado é PAR");
         } else {
            System.out.println("O número informado é ÍMPAR");
         }

         entrada.close();
    }
}
