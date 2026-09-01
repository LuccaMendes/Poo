package heranca;

public class App {

    static void main() {

        PessoaJuridica pj = new PessoaJuridica();
        pj.setEndereco(new Endereco("Rua J", "500", "Centro", "Cajazeiras"));
        pj.setContato(new Contato("8399366-5686", "luccaadl17cz@gmail.com"));
        pj.setNome("Space X");
        pj.setCnpj("568452000182");

        PessoaFisica pf = new PessoaFisica("Lucca", new Endereco("Rua J", "450", "Centro", "Cajazeiras"),
                new Contato("83993665686", "luccaadl17cz@gmail.com"), "82393273482");

        System.out.println(pf);
        System.out.println(pj);
    }

}
