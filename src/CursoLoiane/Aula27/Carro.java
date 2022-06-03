package CursoLoiane.Aula27;

public class Carro {
    //metodo com parâmetros '(...)'

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    //metodo simples
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombustivel + " km");
    }
    //metodo com retorno
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return capCombustivel * consCombustivel;
    }
    //metodo com parametros
    double calcularCombustivel(double km){
        double qtdCombustivel = km/consCombustivel;
        return consCombustivel;

    }

}