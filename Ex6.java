package lista1;

import java.util.Scanner;

public class Ex6 {

    //6) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divisão dos valores.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        float num1 = sc.nextInt();

        System.out.println("Digite outro valor: ");
        float num2 = sc.nextInt();

        float res = num1 / num2;

        System.out.printf("Resultado da divisão: " + res);
        sc.close();
    }


}
