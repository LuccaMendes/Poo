package encapsulamento;

public class App {
    static void main() {


        Pessoa p1 = new Pessoa("José", "17283282383", "83992939293", "luccaadl17cz@gmail.com");
        Pessoa p2 = new Pessoa("Maria", "82682334228", "83973738292", "maria@hotmail.com");
        Pessoa p3 = new Pessoa("Joao", "98765432101", "83998765432", "joao@outlook.com", 40);
//        p1.setNome("José");
//        p1.setCpf("23232332513");
//        p1.setTelefone("83995664568");
//        p1.setEmail("luccaadl17cz@gmail.com");

        System.out.println(p1.toString());
//        System.out.println("Nome: " + p1.getNome());
//        System.out.println("Cpf: " + p1.getCpf());
//        System.out.println("Telefone: " + p1.getTelefone());
//        System.out.println("Email: " + p1.getEmail());

        System.out.println("________________");

        System.out.println(p2.toString());
//        System.out.println("Nome: " + p2.getNome());
//        System.out.println("Cpf: " + p2.getCpf());
//        System.out.println("Telefone: " + p2.getTelefone());
//        System.out.println("Email: " + p2.getEmail());
        System.out.println("________________");

        System.out.println(p3.toString());


    }
}
