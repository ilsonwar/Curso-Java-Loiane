package CursoLoiane.Aula43.Atividades36a43.Atv1;

import java.util.Calendar;

public class ContaPoupança extends ContaBancaria {

    private double diaRendimento;


    public ContaPoupança(String nomeCliente, String numConta, double saldo) {
        super(nomeCliente, numConta, saldo);
    }

    public ContaPoupança() {

    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {
        Calendar hoje = Calendar.getInstance();
        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}