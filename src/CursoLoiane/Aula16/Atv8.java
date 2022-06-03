package CursoLoiane.Aula16;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {

        double somaNumeros=0, media=0;
        int contador=1;
        Scanner scanner = new Scanner(System.in);

        while(contador<=5){
            contador++;
            System.out.println("Entre com um número: ");
            somaNumeros+= scanner.nextDouble();

            media= somaNumeros/5;


        }
        System.out.println("Soma dos números: "+somaNumeros+"\n" +
                "Média dos números: "+media);

    }
}
