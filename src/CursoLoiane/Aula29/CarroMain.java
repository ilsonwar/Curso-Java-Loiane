package CursoLoiane.Aula29;

public class CarroMain {




    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Uno";
        //van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.2;

        System.out.println(van.numPassageiros);

        Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);
        van2.modelo = "Ducato";
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consCombustivel);


    }
}
