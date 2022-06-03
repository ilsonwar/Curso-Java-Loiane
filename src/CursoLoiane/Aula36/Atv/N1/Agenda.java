package CursoLoiane.Aula36.Atv.N1;

public class Agenda {
    private String nome;
    private Contatos[] contato;

    public Agenda(String nome) {
    }

    public Agenda() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeAgenda) {
        this.nome = nomeAgenda;
    }

    public Contatos[] getContato() {
        return contato;
    }

    public void setContato(Contatos[] contato) {
        this.contato = contato;
    }
    public String obterInfo(){
        String info= "Agenda= "+nome+"\n";

        if(contato!=null){
            for(Contatos c : contato){
                info += c.obterInfo();
            }
        }
        return info;
    }

}
