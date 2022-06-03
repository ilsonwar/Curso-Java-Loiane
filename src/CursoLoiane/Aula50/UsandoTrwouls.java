package CursoLoiane.Aula50;

import java.util.Scanner;

public class UsandoTrwouls {
    public static void main(String[] args) {

        System.out.println("ENTRE COM UM NÚMERO DECIMAL");
        try {
            double num = leNumero();
            System.out.println("Você digitou "+num);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }
    }
            public static double leNumero () throws  Exception{
                Scanner scan = new Scanner(System.in);
                double num = scan.nextDouble();
                return num;
            }
        }


