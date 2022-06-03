package CursoLoiane.Aula16;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validacao = false;
        String senha;
        String nome;

        do{
           System.out.println("Usuário: ");
           nome = scan.next();
           System.out.println("Senha: ");
           senha = scan.next();

           if(nome.equalsIgnoreCase(senha)){
               validacao = false;
               System.out.println("A senha não pode ser seu nome");
           }else{
               System.out.println("Senha e usuario validados");
               validacao = true;
           }
        }while (!validacao);

    }

}
