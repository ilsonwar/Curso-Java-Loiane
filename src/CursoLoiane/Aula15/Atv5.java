package CursoLoiane.Aula15;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Isira a quantidade de notas: ");
        double qnota = scan.nextDouble();

        double nota =0;
        for (int i = 0; i < qnota; i++) {
            System.out.println("Informe a nota do aluno: ");
            nota += scan.nextDouble();

        }
        double media = nota / qnota;
        System.out.println("Media do aluno: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");

        }
        if(media==10){
            System.out.println("Aprovado com distinção");

        }else{
            System.out.println("Reprovado");
        }
    }
}
