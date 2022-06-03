package CursoLoiane.Aula15;

import javax.swing.*;

public class Atv4 {
    public static void main(String[] args) {
   String letra= JOptionPane.showInputDialog("Entre com alguma letra: ");

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                JOptionPane.showMessageDialog(null,"Vogal"); break;
            default: JOptionPane.showMessageDialog(null, "Consoante");
        }

        }
    }

