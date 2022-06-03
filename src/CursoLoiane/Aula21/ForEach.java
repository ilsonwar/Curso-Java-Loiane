package CursoLoiane.Aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int[]notas = new int[10];
        Random random = new Random();

        for(int i=0; i<notas.length; i++) {       //usar este para setar valores
            notas[i] = random.nextInt(10);
        }
        for(int i=0; i<notas.length; i++) {
            System.out.println(notas[i]);

        }
        System.out.println("Usando for each");
        for(int nota : notas){                   // usar este para da output nos valores
            System.out.println(nota);
        }

    }

}
