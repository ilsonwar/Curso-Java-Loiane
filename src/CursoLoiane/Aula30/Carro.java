package CursoLoiane.Aula30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consCombustivel = consCombustivel;
    }

    public Carro(){}

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor de 3 parâmetros");
    }

    public Carro(String marca, String modelo) {
       this("Fiat", "Ducato", 10);
        System.out.println("Chamando construtor de 2 parâmetros");
    }

    //metodo simples
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consCombustivel + " km");
    }
    //metodo com retorno
    double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consCombustivel;
    }
    //metodo com parametros
    double calcularCombustivel(double km){
        double qtdCombustivel = km/consCombustivel;
        return consCombustivel;
    }

}
