package CursoLoiane.Aula15;

import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de horas mensais trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();

        System.out.println("Informe o valor de sua hora de trabalho: ");
        double valorHora = scan.nextDouble();

        double salario= valorHora*horasTrabalhadas;

            double INSS, FGTS, descontos,salarioLiquido, IR;
        if(salario<=900){
            INSS= (salario*10)/100;
            IR= (salario*0)/100;
            FGTS= (salario*11)/100;
            descontos= INSS;
            salarioLiquido= salario-descontos;
            System.out.println("Isento\n" +
                    "Salario Bruto:          R$ "+salario+"\n" +
                    "(-) IR (null):          R$ "+IR+"\n" +
                    "(-) INSS (10%):         R$ "+INSS+"\n" +
                    "FGTS (11%)              R$ "+FGTS+"\n" +
                    "Total de escontos:      R$ "+descontos+"\n" +
                    "Salário Liquido:        R$ "+salarioLiquido);
        }
        if(salario>900 && salario<=1500){
            INSS= (salario*10)/100;
            IR= (salario*5)/100;
            FGTS= (salario*11)/100;
            descontos= INSS+IR;
            salarioLiquido= salario-descontos;
            System.out.println(
                            "Salario Bruto:          R$ "+salario+"\n" +
                            "(-) IR (5%):            R$ "+IR+"\n" +
                            "(-) INSS (10%):         R$ "+INSS+"\n" +
                            "FGTS (11%)              R$ "+FGTS+"\n" +
                            "Total de escontos:      R$ "+descontos+"\n" +
                            "Salário Liquido:        R$ "+salarioLiquido);
        }
        if(salario>1500 && salario<=2500){
            INSS= (salario*10)/100;
            IR= (salario*10)/100;
            FGTS= (salario*11)/100;
            descontos= INSS+IR;
            salarioLiquido= salario-descontos;
            System.out.println(
                    "Salario Bruto:          R$ "+salario+"\n" +
                    "(-) IR (10%):           R$ "+IR+"\n" +
                    "(-) INSS (10%):         R$ "+INSS+"\n" +
                    "FGTS (11%)              R$ "+FGTS+"\n" +
                    "Total de escontos:      R$ "+descontos+"\n" +
                    "Salário Liquido:        R$ "+salarioLiquido);
        }
        if(salario>2500 ){
            INSS= (salario*10)/100;
            IR= (salario*20)/100;
            FGTS= (salario*11)/100;
            descontos= INSS+IR;
            salarioLiquido= salario-descontos;
            System.out.println(
                    "Salario Bruto:          R$ "+salario+"\n" +
                    "(-) IR (20%):           R$ "+IR+"\n" +
                    "(-) INSS (10%):         R$ "+INSS+"\n" +
                    "FGTS (11%)              R$ "+FGTS+"\n" +
                    "Total de escontos:      R$ "+descontos+"\n" +
                    "Salário Liquido:        R$ "+salarioLiquido);
        }

    }
}
