package CursoLoiane.Aula15;

import javax.swing.*;

public class Atv1 {
    public static void main(String[] args) {

        Double Num1= Double.parseDouble(JOptionPane.showInputDialog("Insira um número qualquer: "));
        Double Num2= Double.parseDouble(JOptionPane.showInputDialog("Insira um número qualquer: "));

        if(Num1>Num2){
            JOptionPane.showMessageDialog(null, "Primeiro número é maior");

        }else{
            JOptionPane.showMessageDialog(null, "Segundo número é maior");
        }
    }

}
