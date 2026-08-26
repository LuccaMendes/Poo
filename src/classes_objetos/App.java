package classes_objetos;

public class App {
    static void main() {

        ContaBancaria cbMaria = new ContaBancaria();
        cbMaria.cliente = new Cliente();
        cbMaria.cliente.endereco = new Endereco();
        cbMaria.cliente.contatos = new Contatos();

        cbMaria.cliente.titular = "Maria";
        cbMaria.cliente.cpf = "123.456.789-00";
        cbMaria.cliente.rg = "424.323.9";
        cbMaria.cliente.contatos.email = "maria@gmail.com";
        cbMaria.cliente.contatos.telefone = "992379475";
        cbMaria.cliente.endereco.bairro = "Centro";
        cbMaria.cliente.endereco.rua= "Rua Joaquim Tavares";
        cbMaria.cliente.endereco.numero = "27";
        cbMaria.cliente.endereco.complemento = "Casa";
        cbMaria.cliente.endereco.referencia = "Art Choperia";
        cbMaria.cliente.endereco.cidade = "Cajazeiras";
        cbMaria.cliente.endereco.estado = "PB";
        cbMaria.cliente.endereco.cep = "58900-000";
        cbMaria.tipoConta = "Conta Corrente";
        cbMaria.agencia = "234-X";
        cbMaria.numeroConta = "5412-6";
        cbMaria.saldo = 1527.00;

        ContaBancaria cbJose = new ContaBancaria();
        cbJose.cliente = new Cliente();
        cbJose.cliente.endereco = new Endereco();
        cbJose.cliente.contatos = new Contatos();

        cbJose.cliente.titular = "Jose";
        cbJose.cliente.cpf = "123.456.789-00";
        cbJose.cliente.rg = "932.320.8";
        cbJose.cliente.contatos.email = "jose@gmail.com";
        cbJose.cliente.contatos.telefone = "993667632";
        cbJose.cliente.endereco.bairro = "Centro";
        cbJose.cliente.endereco.rua= "Rua Amâncio Santana";
        cbJose.cliente.endereco.numero = "89";
        cbJose.cliente.endereco.complemento = "Casa";
        cbJose.cliente.endereco.referencia = "Clube da Sinuca";
        cbJose.cliente.endereco.cidade = "Cajazeiras";
        cbJose.cliente.endereco.estado = "PB";
        cbJose.cliente.endereco.cep = "58900-000";
        cbJose.tipoConta = "Conta Corrente";
        cbJose.agencia = "234-X";
        cbJose.numeroConta = "7238-9";
        cbJose.saldo = 2575.00;

        System.out.println("Saldo inicial conta de Maria: " + cbMaria.saldo);
        System.out.println("Saldo inicial conta de Jose: " + cbJose.saldo);

        cbMaria.depositar(500.0);;
        cbJose.depositar(750.0);

        System.out.println(cbMaria);
//        cbJose.exibirDetalhes();
        System.out.println("________________________");
//        cbMaria.exibirDetalhes();
        System.out.println(cbJose);
    }
}
