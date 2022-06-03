package CursoLoiane.Aula43.Atividades36a43.Atv1;

public class ContaBancaria {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public ContaBancaria() {

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
        }



        public boolean sacar(double valor){
        if((saldo-valor)>=0){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor){
        valor+=saldo;
    }

    public void mostrarSaldo() {
        System.out.println(getSaldo());
    }
}
