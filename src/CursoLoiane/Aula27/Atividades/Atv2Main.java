package CursoLoiane.Aula27.Atividades;

import javax.swing.*;

public class Atv2Main {
    public static void main(String[] args) {

        Atv2 conta = new Atv2();

        conta.numConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de sua conta: "));
        conta.nomePropritario= JOptionPane.showInputDialog("Nome de úsuario: ");
        conta.especial = JOptionPane.showConfirmDialog(null, "Crédito especial? ", "Especial ", JOptionPane.YES_NO_OPTION);

        conta.saque();
    }
}
