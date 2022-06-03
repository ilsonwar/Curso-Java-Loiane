package CursoLoiane.Aula24.Atividades;

public class Atv1Main {
    public static void main(String[] args) {
        Atv1 lampada = new Atv1();
        lampada.tipoLampada= "Led";
        lampada.cor= "branca";
        lampada.luminosidade=300;
        lampada.kw = 30;
        lampada.vidaUtil= 3;
        lampada.preço = 15.00;

        System.out.println("Lampada: "+ lampada.tipoLampada+"\n" +
                "Cor: "+ lampada.cor+"\n" +
                "Taxa de luminosidade: "+ lampada.luminosidade+"\n" +
                "Kw: "+ lampada.kw+"\n" +
                "Vida útil: "+ lampada.vidaUtil+"\n" +
                "Preço: R$"+ lampada.preço);


    }
}
