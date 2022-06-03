package CursoLoiane.Aula50.Atv;

public class AgendaCheiaExeption extends Exception{

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
