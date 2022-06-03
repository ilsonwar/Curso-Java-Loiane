package CursoLoiane.Aula39;

public class Aluno extends Pessoa {


    private String curso;
    private String notas;

    public void verificarAcesso(){
        super.nomeVisibiidade = "Maria";
        this.nomeVisibiidade= "Zézinho";
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso, String notas) {
        super(nome, endereco, telefone);
        this.curso = curso;
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public  boolean verificarAprovado(){
        return true;
    }

    public  void metodoQualquer(){
    }
}
