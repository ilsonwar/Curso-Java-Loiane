package CursoLoiane.Aula29;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    Carro(){
        System.out.println("Casse carro foi instanciada");
        numPassageiros=4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros= numPassageiros_;
        capCombustivel= capCombustivel_;
        consCombustivel= consCombustivel_;
    }

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
