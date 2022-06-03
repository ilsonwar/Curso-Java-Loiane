package CursoLoiane.Aula46.Atv.N1;

public class Main {
    public static void main(String[] args) {

        Quadrado f1 = new Quadrado();
        f1.setLado(2);
        f1.setNome("Quadrado");

        Triangulo f2 = new Triangulo();
        f2.setAltura(10);
        f2.setBase(50);
        f2.setNome("Triângulo");

        Circulo f3 = new Circulo();
        f3.setRaio(5);
        f3.setNome("Circulo");

        Cilindro f4 = new Cilindro();
        f4.setAltura(14);
        f4.setRaio(3);
        f4.setNome("Cilindro");

        Cubo f5 = new Cubo();
        f5.setLado(4);
        f5.setNome("Cubo");

        Piramide f6 = new Piramide();
        f6.setAltura(3);
        f6.setApotema(4);
        f6.setArestaBase(2);
        f6.setNumPoliBase(4);
        f6.setBase(f1);
        f6.setNome("Piramide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        figuras[5] = f6;


        for(FiguraGeometrica figura : figuras){
            System.out.println("-----------------");
            System.out.println(figura.getNome());

            if (figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                System.out.println("Area: "+f2d.calcularArea());
            }

            if (figura instanceof Figura3D){
                Figura3D f3d = (Figura3D) figura;
                System.out.println("Area: "+f3d.calcularArea());
                System.out.println("Volume: "+f3d.calcularVolume());
            }
        }
    }
}
