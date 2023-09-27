package ExercicioQuatroSequencial;
import java.util.Scanner;


public class Salario {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu número de funcionário, por favor");
        int numero;
        numero = entrada.nextInt();
        System.out.println("Digite o número de horas trabalhadas, por favor");
        int horas;
        horas = entrada.nextInt();
        System.out.println("Digite o valor que recebe por hora, por favor");
        double valorhoras;
        valorhoras = entrada.nextDouble();

        double salario;
        salario = valorhoras * horas;

        System.out.println("O salário do funcionário número " + numero + " é " + salario);
        

        entrada.close();

    }

}
