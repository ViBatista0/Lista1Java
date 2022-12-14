package lista1;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args){

        /*11) Escreva um algoritmo para ler as dimensões de um trapézio (base maior, base menor e altura), calcular e
         escrever a área do trapézio. a=(B+b).h/2*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base maior do trapézio: ");
        float bm = sc.nextFloat();

        System.out.println("Agora digite a base menor: ");
        float bmn = sc.nextFloat();

        System.out.println("Digite a altura do trapézio: ");
        float h = sc.nextFloat();

        float a = (bm + bmn) * h / 2;

        System.out.printf("A área do trapézio equivale a: " + a + "m²");
        sc.close();
    }

}
