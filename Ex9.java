package lista1;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args){

        //9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado.
        // Dica a=l²

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado: ");
        float lado = sc.nextFloat();

        float area = (float) Math.pow(lado, 2);

        System.out.printf("A área do quadrado é: " + area + "m²");
        sc.close();

    }

}
