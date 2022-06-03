package CursoLoiane.Aula43.Atividades36a43.Atv1;

public class ContaMain {
    public static void main(String[] args) {
        System.out.println("###Conta Bancaria###");
        ContaBancaria banco = new ContaBancaria();
        banco.setNumConta("Ilson Warmling");
        banco.setNumConta("11111111111");
        banco.setSaldo(15000);

        banco.depositar(100);
        banco.mostrarSaldo();
        banco.sacar(50);
        banco.mostrarSaldo();
        System.out.println(banco);

        System.out.println("###Conta Poupança###");
        ContaPoupança poupanca = new ContaPoupança();
        poupanca.setNomeCliente("José Alberto");
        poupanca.setNumConta("2222222222");
        poupanca.setDiaRendimento(3);

        poupanca.depositar(100);
        poupanca.mostrarSaldo();
        poupanca.sacar(1000);
        poupanca.mostrarSaldo();
        poupanca.sacar(500);
        poupanca.mostrarSaldo();

        if (poupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo é de = " + poupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }

        System.out.println(poupanca);

        System.out.println("###Conta Especial###");
        ContaEspecial especial = new ContaEspecial();
        especial.setNomeCliente("Bruno Cardoso");
        especial.setNumConta("33333333333");
        especial.setLimite(50);

        especial.depositar(100);
        especial.sacar(1000);
        especial.mostrarSaldo();
        especial.depositar(50);
        especial.mostrarSaldo();
        especial.sacar(14200);
        especial.mostrarSaldo();

        System.out.println(especial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
}