package heranca;

public class App {

    static void main() {

        PessoaJuridica pj = new PessoaJuridica();
        pj.setEndereco(new Endereco("Rua J", "500", "Centro", "Cajazeiras"));
        pj.setContato(new Contato("8399366-5686", "luccaadl17cz@gmail.com"));

    }
}
