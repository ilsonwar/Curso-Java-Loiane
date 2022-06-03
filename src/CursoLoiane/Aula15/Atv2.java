package CursoLoiane.Aula15;

import javax.swing.*;

public class Atv2 {
    public static void main(String[] args) {

        Double Num1= Double.parseDouble(JOptionPane.showInputDialog("Insira um número qualquer: "));

        if(Num1>0){
            JOptionPane.showMessageDialog(null, "Número positivo");

        }else {
            JOptionPane.showMessageDialog(null, "Número negativo");
        }
    }
}
