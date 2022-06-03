package CursoLoiane.Aula27;

public class CarroMain {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Uno";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: "+autonomia);
        System.out.println("A autonomia do carro é: "+van.obterAutonomia());

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);

        System.out.println("Para andar 10 km precisará: "+qtdCombustivel10+" litros");
        System.out.println("Para andar 15 km precisará: "+qtdCombustivel15+" litros");
    }
}
