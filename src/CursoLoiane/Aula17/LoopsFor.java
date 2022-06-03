package CursoLoiane.Aula17;

public class LoopsFor {

    public static void main(String[] args) {
        for(int i=0;i<5 ;i++) {

        }
        for(int i=0 ,j=10 ;i<j ;i++ ,j--) {
            System.out.println("i= "+i+" j= "+j);
        }
        int count = 0;
        for(;count<10;) {
            System.out.println("Valor de cont: "+count);
            count++;
        }
        for(int cont=0; cont<10; cont+=2) {

        }
        int relogio=0;
        for(;;) {
            relogio++;
            System.out.println("Cronometro: "+relogio);

        }
    }

}

