package CursoLoiane.Aula30.Atividades28a33;

import javax.swing.*;

public class Banco {

    private String numero;
    private String agencia;
    private double saldo;
    private boolean especial;
    private double limiteEspecial ;
    private double quantiaSacar;
    private double valorDeposito;
    private int opcao;
    public Banco() {

    }

    public Banco(String numero, String agencia, double saldo, boolean especial, double limiteEspecial, double quantiaSacar, double valorDeposito, int opcao) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.quantiaSacar = quantiaSacar;
        this.valorDeposito = valorDeposito;
        this.opcao = opcao;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getQuantiaSacar() {
        return quantiaSacar;
    }

    public void setQuantiaSacar(double quantiaSacar) {
        this.quantiaSacar = quantiaSacar;
    }


    public void realizarSaque(){
       quantiaSacar= Double.parseDouble(JOptionPane.showInputDialog("Informe a quantia desejada: "));
        if(saldo>=quantiaSacar){
            saldo= saldo-quantiaSacar;

        }else{
            if(especial){
                double limite = limiteEspecial + saldo;
                if(limite>= quantiaSacar){
                    saldo= saldo - quantiaSacar;

                }else{
                    JOptionPane.showMessageDialog(null,"Quantia desejada insuficiente");
                }
            }else{
              JOptionPane.showMessageDialog(null,"Quantia insisuficiente, usando crédito especial...");
            }
        }
    }

    public void depositar (){
        valorDeposito =Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito: "));

        saldo= saldo + valorDeposito;
    }

    public  void consultarSaldo(){
        JOptionPane.showMessageDialog(null,"Seu saldo atual é: "+saldo);
    }

    public boolean verificarUsoChequeEspecial(){
        return saldo < 0;


    }
    public void opcao() {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo: \n" +
                "1- Consultar saldo \n" +
                "2- Realizar saque \n" +
                "3- Fazer um depósito\n" +
                "4- Verificar uso de cheque especial \n" +
                "5- Sair"));
    }

}
