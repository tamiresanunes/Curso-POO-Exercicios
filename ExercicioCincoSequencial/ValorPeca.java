package ExercicioCincoSequencial;
import java.util.Scanner;

public class ValorPeca {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código da primeira peça");
        int cod1;
        cod1 = entrada.nextInt();
        System.out.println("Digite a quantidade de peças");
        int quant1;
        quant1 = entrada.nextInt();
        System.out.println("Digite o valor da primeira peça");
        double prec1;
        prec1 = entrada.nextDouble();

        System.out.println("Digite o código da segunda peça");
        int cod2;
        cod2 = entrada.nextInt();
        System.out.println("Digite a quantidade de peças");
        int quant2;
        quant2 = entrada.nextInt();
        System.out.println("Digite o valor da segunda peça");
        double prec2;
        prec2 = entrada.nextDouble();

        double total;

        total = prec1 * quant1 + prec2 * quant2;

        System.out.println("O total a ser pago das peças cujos códigos são " + cod1 + " e " + cod2 + ", é: " + total);

        entrada.close();
    }
}
