package classes_objetos;

public class Cliente {

    String titular;
    String rg;
    String cpf;
    Contatos contatos;
    Endereco endereco;

    @Override
    public String toString() {
        return "**Cliente**: " +
                "\n Titular: " + titular +
                "\n Rg: " + rg +
                "\n Cpf: " + cpf +
                "\n" + contatos +
                "\n" + endereco;
    }
}
