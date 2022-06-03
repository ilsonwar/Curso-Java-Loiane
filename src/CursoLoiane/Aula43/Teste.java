package CursoLoiane.Aula43;

public class Teste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Sistemas de Informação");
        double[]notas= {10,9,8,7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "asdfasda";
        String s2= "asdfasda";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Ciências da computação");
        double[] notas2 = {5,9,8,7};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }
}
