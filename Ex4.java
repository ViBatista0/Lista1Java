package lista1;

import java.util.Scanner;

public class Ex4 {

    //4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro valor: ");
        int num2 = sc.nextInt();

        int res = num1 - num2;

        System.out.println("Resultado da subtração dos valores: " + res);

        sc.close();

    }

}
