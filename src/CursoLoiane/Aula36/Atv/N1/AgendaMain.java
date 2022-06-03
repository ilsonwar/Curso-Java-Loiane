package CursoLoiane.Aula36.Atv.N1;

import javax.swing.*;

public class AgendaMain {
    public static void main(String[] args) {


        Agenda agenda = new Agenda();
        String nome= JOptionPane.showInputDialog("De um nome a sua agenda: ");
        agenda.setNome(nome);

        Contatos [] contatos = new Contatos[3];

        for(int i=0; i<3; i++) {
            JOptionPane.showMessageDialog(null,"Entre com as informações do contato " + (i + 1));
            Contatos c = new Contatos();

            String nomeC= JOptionPane.showInputDialog("Entre com o nome: ");
            c.setNome(nomeC);

            String telefone= JOptionPane.showInputDialog("Entre com o número de telefone: ");
            c.setTelefone(telefone);

            String email= JOptionPane.showInputDialog("Entre com o email: ");
            c.setEmail(email);

            contatos[i]= c;
        }

        agenda.setContato(contatos);
    if(agenda!=null){
        JOptionPane.showMessageDialog(null,agenda.obterInfo());
       }
    }
}
