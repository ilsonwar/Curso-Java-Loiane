package CursoLoiane.Aula15;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {

        double num1=0, num2=0, num3=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        num1 = scan.nextDouble();
        System.out.println("Insira o segundo numero: ");
        num2 = scan.nextDouble();
        System.out.println("Insira o tereceiro numero: ");
        num3 = scan.nextDouble();

        if(num1<num2 && num1<num3 && num2<num3){ //3,2,1
            System.out.println("Ordem númerica: "+num3+"  -  "+num2+"  -  "+num1);
        }
        if(num1<num2 &&num1<num3 && num3<num2 ){ //2,3,1
            System.out.println("Ordem númerica: "+num2+"  -  "+num3+"  -  "+num1);
        }

        if(num2<num1 && num2<num3 && num3<num1){//1,3,2
            System.out.println("Ordem númerica: "+num1+"  -  "+num3+"  -  "+num2);
        }
        if(num2<num1 && num2<num3 && num1<num3){//3,1,2
            System.out.println("Ordem númerica: "+num3+"  -  "+num1+"  -  "+num2);
        }
        if(num3<num1 && num3<num2 && num1<num2){//2,1,3
            System.out.println("Ordem númerica: "+num2+"  -  "+num1+"  -  "+num3);
        }
        if(num3<num1 && num3<num2 && num2<num1){//1,2,3
            System.out.println("Ordem númerica: "+num1+"  -  "+num2+"  -  "+num3);
        }



    }
}
