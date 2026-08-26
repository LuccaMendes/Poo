package encapsulamento;

public class App {
    static void main() {

        Pessoa p1 = new Pessoa();
        p1.setNome("Jose");
        p1.setCpf("23232332132");
        p1.setTelefone("83993665686");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Cpf: " + p1.getCpf());
        System.out.println("Telefone: " + p1.getTelefone());

    }
}
