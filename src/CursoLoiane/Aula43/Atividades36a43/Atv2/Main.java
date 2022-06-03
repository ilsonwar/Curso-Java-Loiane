package CursoLoiane.Aula43.Atividades36a43.Atv2;

public class Main {
    public static void main(String[] args) {


        PessoaFisica f1 = new PessoaFisica();
        f1.setCpf("12345567-32");
        f1.setRendaBruta(2000);
        f1.setNome("Ilson Warmling");

        PessoaJuridica j1 = new PessoaJuridica();
        j1.setCnpj("2345432-xx1");
        j1.setRendaBruta(10000);
        j1.setNome("Jussalena");

        PessoaFisica f2 = new PessoaFisica();
        f2.setCpf("45134141-32");
        f2.setRendaBruta(3000);
        f2.setNome("Nereu Warmling");

        PessoaJuridica j2 = new PessoaJuridica();
        j2.setCnpj("2231323-xx2");
        j2.setRendaBruta(12000);
        j2.setNome("Jusse");

        PessoaFisica f3 = new PessoaFisica();
        f3.setCpf("56437-32");
        f3.setRendaBruta(4000);
        f3.setNome("Sônia Heerdt Warmling");

        PessoaJuridica j3 = new PessoaJuridica();
        j3.setCnpj("243245532-xx3");
        j3.setRendaBruta(20000);
        j3.setNome("SoraiaLen");

    Contribuinte[] contribuintes = new Contribuinte[6];
    contribuintes[0] = f1;
    contribuintes[1] = j1;
    contribuintes[2] = f2;
    contribuintes[3] = j2;
    contribuintes[4] = f3;
    contribuintes[5] = j3;

        for (Contribuinte c : contribuintes){
        System.out.println(c.toString());
         }
    }
}