package CursoLoiane.Aula43.Atividades36a43.Atv2;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public double calcularImposto() {
        return this.getRendaBruta()*0.1;
    }

    @Override
    public String toString() {
        String s = "Pessoa Física[";
        s += super.toString();
        s += " ;cnpj: " + cnpj;
        s += " ;imposto a ser pago: " + calcularImposto();
        s += "]";
        return s;
    }
}
