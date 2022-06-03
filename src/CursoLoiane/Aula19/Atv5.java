package CursoLoiane.Aula19;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {

        double[] vetorA = new double[8];
        double[] vetorB = new double[8];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um número:");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * i;
        }
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valores do vetor "+(i+1)+"A: " + vetorA[i]);

        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Valores do vetor "+(i+1)+"B: " + vetorB[i]);
        }
    }
}
