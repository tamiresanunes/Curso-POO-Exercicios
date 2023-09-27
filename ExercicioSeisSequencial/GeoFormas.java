package ExercicioSeisSequencial;

import java.util.Scanner;

public class GeoFormas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double A, B, C;
        double triangulo, trapezio, circulo, quadrado, retangulo;

        System.out.println("Informe o valor de A");
        A = entrada.nextDouble();
        System.out.println("Informe o valor de B");
        B = entrada.nextDouble();
        System.out.println("Informe o valor de C");
        C = entrada.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.println("A área do triângulo retângulo que tem A por base e C por altura é: " + triangulo);
        System.out.println("A área do círculo de raio C é: " + circulo);
        System.out.println("A área do trapézio que tem A e B por base e C por altura é: " + trapezio);
        System.out.println("A área do quadrado que tem lado B é: " + quadrado);
        System.out.println("A área do retângulo que tem lados A e B é: " + retangulo);

        entrada.close();

    }

}
