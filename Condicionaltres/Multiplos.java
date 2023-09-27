package Condicionaltres;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe dois números para verificar se eles são múltiplos");

        int T, M;
        T = entrada.nextInt();
        M = entrada.nextInt();

        if (T % M == 0 || M % T == 0) {
            System.out.println("Eles são MÚLTIPLOS");
        } else {
            System.out.println("Eles são NÃO SÃO MÚLTIPLOS");
        }
    }
}
