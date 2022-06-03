package CursoLoiane.Aula34.Atv;

public class ContadorMain {
static void imprimirValor(){
    System.out.println(Contador.obterValor());
}
    public static void main(String[] args) {
        Contador.incrementar();
        imprimirValor();
        Contador.incrementar();
        imprimirValor();
        Contador.zerar();
        imprimirValor();
    }


}
