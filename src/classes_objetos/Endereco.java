package classes_objetos;

public class Endereco {

    String bairro;
    String rua;
    String numero;
    String complemento;
    String referencia;
    String cidade;
    String estado;
    String cep;

    @Override
    public String toString() {
        return "**Endereco**: " +
                "\n Bairro: " + bairro +
                "\n Rua: " + rua +
                "\n Numero: " + numero +
                "\n Complemento : " + complemento  +
                "\n Referencia: " + referencia +
                "\n Cidade: " + cidade +
                "\n Estado: " + estado +
                "\n Cep:" + cep ;

    }
}
