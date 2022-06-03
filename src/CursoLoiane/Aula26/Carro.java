package CursoLoiane.Aula26;

public class Carro {
    //metodo com retorno return

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+capCombustivel*consCombustivel+" km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consCombustivel;
    }

}
