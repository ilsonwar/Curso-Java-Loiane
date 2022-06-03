package CursoLoiane.Aula30.Atividades28a33;

import javax.swing.*;

public class BancoMain {
    public static void main(String[] args) {

        Banco banco = new Banco();

        banco.setAgencia("12344");
        banco.setNumero("1233455678");
        banco.setSaldo(50000);
        banco.setEspecial(true);
        banco.setLimiteEspecial(500);

        int variavelParada = 0;
        boolean parar = true;

        do {
            banco.opcao();

            switch (banco.getOpcao()) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo atual: " + banco.getSaldo());
                    variavelParada = JOptionPane.showConfirmDialog(null, "Deseja fazer outra operação? ", "Bradesco",
                            JOptionPane.YES_NO_OPTION);
                    if (variavelParada == 0) {
                        parar = false;

                    } else {
                        parar = true;
                    }
                    break;


                case 2:
                    banco.realizarSaque();
                    banco.consultarSaldo();
                    variavelParada = JOptionPane.showConfirmDialog(null, "Deseja fazer outra operação? ", "Bradesco",
                            JOptionPane.YES_NO_OPTION);
                    if (variavelParada == 0) {
                        parar = false;

                    } else {
                        parar = true;
                    }
                    break;

                case 3:
                    banco.depositar();
                    banco.consultarSaldo();
                    variavelParada = JOptionPane.showConfirmDialog(null, "Deseja fazer outra operação? ", "Bradesco",
                            JOptionPane.YES_NO_OPTION);
                    if (variavelParada == 0) {
                        parar = false;

                    } else {
                        parar = true;
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Estado do cheque especial: " + banco.verificarUsoChequeEspecial());
                    variavelParada = JOptionPane.showConfirmDialog(null, "Deseja fazer outra operação? ", "Bradesco",
                            JOptionPane.YES_NO_OPTION);
                    if (variavelParada == 0) {
                        parar = false;

                    } else {
                        parar = true;
                    }
                    break;

                case 5:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    variavelParada = JOptionPane.showConfirmDialog(null, "Deseja fazer outra operação? ", "Bradesco",
                            JOptionPane.YES_NO_OPTION);
                    if (variavelParada == 0) {
                        parar= false;

                    } else {
                        parar = true;
                    }
            }
        } while (parar != true);
    }
}




