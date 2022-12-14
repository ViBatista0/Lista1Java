package lista1;

import java.util.Scanner;

public class Ex2 {

    /*2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.*/

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor = scanner.nextInt();

        System.out.println("O número antecessor de " + valor + " é : " + (valor-1));
        scanner.close();
    }

}
