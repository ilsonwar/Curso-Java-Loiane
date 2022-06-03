package CursoLoiane.Aula25;

public class Carro {

    //Método Simples sem retorno ou parametro

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    //metodos:

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+capCombustivel*consCombustivel+" km");
    }

}
