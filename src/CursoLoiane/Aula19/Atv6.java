package CursoLoiane.Aula19;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        int[] vetorA= new int[10];
        int[] vetorB= new int[10];
        int[] vetorC= new int[10];
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<vetorA.length; i++) {
            System.out.println("Entre com um valor inteiro para vetorA: ");
            vetorA[i] =scan.nextInt();

        }
        for (int i=0; i<vetorB.length; i ++){
            System.out.println("Entre com um valor inteiro para vetorB: ");
            vetorB[i] =scan.nextInt();
            vetorC[i]=vetorA[i]+vetorB[i];
        }
        for(int valores:vetorC){
            System.out.println("ValorC: "+valores);
        }
    }
}
