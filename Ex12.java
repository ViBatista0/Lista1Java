package lista1;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args){

        /* 12) Escreva um algoritmo para ler as dimensões de um círculo (raio), calcular e escrever a área do círculo.
        a=pi*r²*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio da circunferência: ");
        float raio = sc.nextFloat();

        float area = (float) (Math.PI * (float) Math.pow(raio, 2));

        System.out.printf("A dimensão da circunferência é: " + area + "m²");
        sc.close();

    }

}
