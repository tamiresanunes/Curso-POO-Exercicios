package ExercicioDoisSequencial;
import java.util.Scanner;
import java.util.Locale;

public class Area {
    public static void main(String[] args){

        Scanner entrada= new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Informe o valor do raio do círculo");

        double A, R, pi= 3.14159;

        R = entrada.nextDouble();
        A = pi * R * R;

        System.out.println("O valor da área do círculo é: " + A);
        /*System.out.printf("A=%.4f%n", A);*/

		entrada.close();

    }
}
