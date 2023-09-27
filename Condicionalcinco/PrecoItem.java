package Condicionalcinco;

import java.util.Scanner;

public class PrecoItem {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código do item comprado");
        int cod;
        cod = entrada.nextInt();
        System.out.println("Informe a quantidade de itens comprados");
        int quant;
        quant = entrada.nextInt();
        double total;

        if (cod == 1) {
           total = quant + 4.0;

        } else if (cod == 2){
            total = quant * 4.50;

        } else if (cod == 3){
            total = quant * 5.0;

        } else if (cod == 4){
            total = quant * 2.0;

        } else {
            total = quant * 1.50;
        }
        System.out.println("O total a pagar é " + total);

        entrada.close();
            
    }
    
}
