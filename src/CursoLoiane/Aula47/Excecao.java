package CursoLoiane.Aula47;

public class Excecao {

    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];
            System.out.println("Antes da exception");

            vetor[4] = 1;
            System.out.println("Não será impresso");

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um índece inexistente ");
        }

        System.out.println("Esse texto será impresso após a exception");
    }

}
