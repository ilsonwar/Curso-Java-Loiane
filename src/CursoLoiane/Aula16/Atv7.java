package CursoLoiane.Aula16;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {

        double maior = 0, numero = 0;
        int contador = 1;
        Scanner scan = new Scanner(System.in);

        while (contador <= 5) {
            contador++;
            System.out.println("Isira uma número qualquer: ");
            numero = scan.nextDouble();
            if (numero > maior) {
                maior = numero;
            }

        }
            System.out.println("Maior número escrito: " + maior);

    }
}

