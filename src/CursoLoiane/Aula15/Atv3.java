package CursoLoiane.Aula15;

import javax.swing.*;

public class Atv3 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("F - Feminino ou M - Masculino?");
        if(nome.equalsIgnoreCase("f")){
            JOptionPane.showMessageDialog(null,"Mulher");

        }else if(nome.equalsIgnoreCase("m")){
            JOptionPane.showMessageDialog(null, "Homem");
        }else{
            JOptionPane.showMessageDialog(null,"Sexo inválido");
        }
    }
}
