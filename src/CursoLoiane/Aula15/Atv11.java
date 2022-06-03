package CursoLoiane.Aula15;

import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o seu salário: ");
        double salario = scan.nextDouble();

        double reajuste , valorAumento;
        if (salario <= 280.00 && salario>0) {
            reajuste = (salario * 20) / 100;
            reajuste = reajuste+salario;
            valorAumento = reajuste-salario;
            System.out.println("Salaro antes do reajuste: R$ " + salario + "\n" +
                    "Percentual aplicado: 20%\n" +
                    "Valor do aumento: R$ " + valorAumento + "\n" +
                    "Novo salário: R$ " + reajuste);
        }
        if (salario > 280 && salario <= 700) {
            reajuste = (salario * 15) / 100;
            reajuste = reajuste+salario;
            valorAumento =  reajuste-salario;
            System.out.println("Salaro antes do reajuste: R$ " + salario + "\n" +
                    "Percentual aplicado: 15%\n" +
                    "Valor do aumento: R$ " + valorAumento + "\n" +
                    "Novo salário: R$ " + reajuste);
        }
        if (salario > 700 && salario <= 1500) {
            reajuste = (salario * 10) / 100;
            reajuste = reajuste+salario;
            valorAumento =  reajuste-salario;
            System.out.println("Salaro antes do reajuste: R$ " + salario + "\n" +
                    "Percentual aplicado: 10%\n" +
                    "Valor do aumento: R$ " + valorAumento + "\n" +
                    "Novo salário: R$ " + reajuste);
        }
        if (salario > 1500) {
            reajuste = (salario * 5) / 100;
            reajuste = reajuste+salario;
            valorAumento = reajuste-salario;
            System.out.println("Salaro antes do reajuste: R$ " + salario + "\n" +
                    "Percentual aplicado: 5%\n" +
                    "Valor do aumento: R$ " + valorAumento + "\n" +
                    "Novo salário: R$ " + reajuste);

        }else{
            System.out.println("Valor invalido, sem aumento disponivel!");
        }
    }
}