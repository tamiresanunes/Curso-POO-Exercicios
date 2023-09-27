package Condicionalum;
import java.util.Scanner;

public class NegativoPositivo {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número");

        int N;
        N = entrada.nextInt();

        if (N > 0) {
           System.out.println("O número informado é POSITIVO!"); 
        } else {
            System.out.println("O número informado é NEGATIVO!");
        }

        entrada.close();
    }
    
}
