package CursoLoiane.Aula19;

import javax.swing.*;

public class Atv8 {
    public static void main(String[] args) {
        int[] vetorA= new int[10];
        int[] vetorB= new int[10];
        int[] vetorC= new int[10];

        for(int i=0; i<vetorA.length; i++) {
            vetorA[i]=Integer.parseInt(JOptionPane.showInputDialog("Valor inteiro para vetorA: "));

        }
        for (int i=0; i<vetorB.length; i ++){
            vetorB[i]=Integer.parseInt(JOptionPane.showInputDialog("Valor inteiro para vetorB"));
            vetorC[i]=vetorA[i]*vetorB[i];
        }
        for(int i=0; i< vetorC.length; i++){

            JOptionPane.showMessageDialog(null,"Valor de VetorC"+(i+1)+" é:5 "+vetorC[i]);
        }

    }
}


