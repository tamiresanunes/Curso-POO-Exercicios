package ExercicioTresSequencial;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] arg){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe os números que deseja descobrir a diferença");

        int a, b, c, d, diferenca;
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        diferenca = a * b - c * d;

        System.out.println("O resultado da difrença dos números informados é: " + diferenca);

        entrada.close();


    }
    
}
