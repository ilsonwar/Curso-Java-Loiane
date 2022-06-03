package CursoLoiane.Aula19;

public class Arrays {
    public static void main(String[] args) {
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do dia 3 é: "+temperaturas);
        System.out.println("O tamabho od arrey: "+ temperaturas.length);
        System.out.println("Vetores do arrey: ");

        for(int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia"+ (i+1)+" é: "+temperaturas);

        }
        for(double temp: temperaturas){
            System.out.println(temp);

        }

    }

}
