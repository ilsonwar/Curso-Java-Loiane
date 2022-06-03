package CursoLoiane.Aula19;

import javax.swing.*;

public class Atv1 {
    public static void main(String[] args) {
        double[] A = new double[5];
        double[] B = new double[5];

        for (int i=0; i<A.length; i++){

        A[i]= Double.parseDouble(JOptionPane.showInputDialog("De um valor aleatorio: "));

        B[i]=A[i];
        }

        System.out.println("Valores A: ");
        for(double valor: A){

        System.out.println("Valor A:"+valor+"\n" +
                "Valor B:"+valor);
        }

    }
}
