package lista1;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args){

        //10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e
        // escrever a área do losango. Dica a=D.d/2.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do diagonal maior: ");
        float dm = sc.nextFloat();

        System.out.println("Digite o valor do diagonal menor: ");
        float dmn = sc.nextFloat();

        float area = dm * dmn / 2;

        System.out.printf("A área do losango é: " + area + "m²");
        sc.close();


    }

}
