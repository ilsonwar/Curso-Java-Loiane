package CursoLoiane.Aula15;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Em qual turno você estuda?\n" +
                "V - Vespertino;\n" +
                "N - Noturno;\n" +
                "M - Matutino;");
        String turno = scan.next();

        switch (turno){
            case "v":
            case "V":System.out.println("Bom Dia!");break;
            case "m":
            case "M":System.out.println("Boa Tarde!");break;
            case "n":
            case "N":System.out.println("Boa Noite!");break;
            default: System.out.println("Valor invalido!");
        }

    }
}
