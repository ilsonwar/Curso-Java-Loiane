package CursoLoiane.Aula24;

public class CarroMain {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "modelo";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca= new Carro();
        van.marca = "Volkswagen";
        van.modelo = "modelo";
        van.numPassageiros = 4;
        van.capCombustivel = 30;
        van.consCombustivel = 0.15;

    }
}
