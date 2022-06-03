package CursoLoiane.Aula24.Atividades;

public class Atv2Main {
    public static void main(String[] args) {
        Atv2 livro = new Atv2();

        livro.anoPublicacao= 2000;
        livro.autor= "Loiane";
        livro.genero="programação";
        livro.titulo="Java";
        livro.qtdPaginas = 300;

        System.out.println("Titulo: "+ livro.titulo);
        System.out.println("Autor: "+ livro.autor);
        System.out.println("Genero: "+ livro.genero);
    }
}
