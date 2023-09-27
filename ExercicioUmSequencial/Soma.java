package ExercicioUmSequencial;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite os números que deseja somar");
        int x;
        int y;
        int soma;

        x = entrada.nextInt();
        y = entrada.nextInt();

        soma = x + y;

        System.out.println("O resultado da soma é: " + soma);

        entrada.close();

    }
}

