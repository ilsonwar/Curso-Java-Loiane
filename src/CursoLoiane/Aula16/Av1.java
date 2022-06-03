package CursoLoiane.Aula16;

import javax.swing.*;

public class Av1 {
    public static void main(String[] args) {


       double nota;
       boolean validação= false;
        do {
           nota= Double.parseDouble(JOptionPane.showInputDialog("Dê uma nota entre 0 e 10: "));
           if(nota>=0 && nota <=10){
               validação = true;
               JOptionPane.showMessageDialog(null,"nota:" +nota);
           }else{
               JOptionPane.showMessageDialog(null, "Insira uma nota valida: ");
           }

        }while(!validação );
    }

}
