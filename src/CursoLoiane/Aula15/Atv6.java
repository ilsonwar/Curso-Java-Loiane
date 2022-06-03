package CursoLoiane.Aula15;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Insira o primeiro numero: ");
        num1 = scan.nextDouble();

        System.out.println("Insira o segundo numero: ");
        num2 = scan.nextDouble();

        System.out.println("Insira o terceiro numero: ");
        num3 = scan.nextDouble();

        if(num1>num2 && num1>num3) {
            System.out.println("Primeiro número é maior: " + num1);
        }
            if(num2>num1 && num2>num3){
                System.out. println("Segudo número é maior: "+num2);

            }
            if(num3>num1 && num3>num2)
                System.out. println("Terceiro número é maior: "+num3);
            }
        }


