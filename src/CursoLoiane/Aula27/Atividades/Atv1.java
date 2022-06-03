package CursoLoiane.Aula27.Atividades;

import javax.swing.*;

public class Atv1 {

    String tipoLuminaria;
    boolean aceso = true;


    void acender(){
        if(aceso != true){
            aceso= true;
            JOptionPane.showMessageDialog(null, "Luz está acesa");
        }else{
          JOptionPane.showMessageDialog(null, "Luz já esta acesa");

        }

        }
        void apagar(){
        if(aceso != false){
            JOptionPane.showMessageDialog(null, "Luz está apagada");
        }else{
            JOptionPane.showMessageDialog(null, "Luz já está apagada");
        }

    }

}
