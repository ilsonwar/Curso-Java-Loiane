package CursoLoiane.Aula36;

public class ContatoMain {
    public static void main(String[] args) {


        Contato contato = new Contato();

        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        // contato.setTelefone("11 99999-9999");

        Endereco endereco = new Endereco();
        endereco.setNomeRua("Rua Game of Thrones");
        endereco.setNumero("9999999999999");
        endereco.setComplemento("mmmm");
        endereco.setCidade("Kings Landing");
        endereco.setEstado("Westeros");
        endereco.setCep("99999999");

        contato.setEndereco(endereco);
        System.out.println("\n\n"+endereco.toString()+"\n\n");

        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("48");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("48");
        telefone2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0]= telefone;
        telefones[1]= telefone2;

        contato.setTelefones(telefones);

        System.out.println(contato.getNome());


        if(contato!=null && contato.getEndereco()!= null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato!= null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
