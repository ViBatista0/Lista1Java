package lista1;

import java.util.Scanner;

public class Ex8 {

    /* 8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do
    triângulo. Dica a=b.h/2 */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do triângulo: ");
        float base = sc.nextFloat();

        System.out.println("Digite a altura do triângulo: ");
        float altura = sc.nextFloat();

        float area = base * altura / 2;

        System.out.printf("A área do triângulo é: " + area + "m²");
        sc.close();

    }
}
