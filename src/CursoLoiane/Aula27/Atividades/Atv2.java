package CursoLoiane.Aula27.Atividades;

import javax.swing.*;

public class Atv2 {

    String nomePropritario;
    int numConta;
    double saldo= 20000;
    int especial ;
    boolean validacao = true;
    double sacar;
    void saque() {
        do {
            if (sacar < 0 && sacar > saldo) {
               JOptionPane.showMessageDialog(null, "Valor invalido");
                validacao = false;
            } else {
                sacar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de saque: "));
                validacao= true;
            }
        }while(!validacao);

    }
}
