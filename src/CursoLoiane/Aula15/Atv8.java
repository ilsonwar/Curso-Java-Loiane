package CursoLoiane.Aula15;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {

        double precoBanana, precoMaca, precoMelao;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o preço da banana? ");
        precoBanana = scan.nextDouble();
        System.out.println("Qual o preço da maçã? ");
        precoMaca = scan.nextDouble();
        System.out.println("Qual o preço do melão? ");
        precoMelao = scan.nextDouble();

        if(precoBanana<=precoMaca && precoBanana<=precoMelao){
            System.out.println("Compre a banana, pois está mais barata!");
        }

        if(precoMaca<=precoBanana && precoMaca<=precoMelao){
            System.out.println("Compre a maçã pois está mais barata!");
        }

        if(precoMelao<=precoBanana && precoMelao<=precoMaca){
            System.out.println("Compre o melão pois está  mais barato!");
        }

    }
}
