package Condicionalsete;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, y;
        System.out.println("Digite a primeira coordenada");
        x = entrada.nextDouble();
        System.out.println("Digite a segunda coordenada");
        y = entrada.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        entrada.close();

    }
}
