package lista1;

import java.util.Scanner;

public class Ex7 {

    /*7) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do
     retângulo. Dica a=b.h*/

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        float base = sc.nextFloat();

        System.out.println("Digite a altura do retângulo: ");
        float altura = sc.nextFloat();

        float area = base * altura;

        System.out.printf("A área do retângulo é: " + area  + "m²");
        sc.close();
    }

}
