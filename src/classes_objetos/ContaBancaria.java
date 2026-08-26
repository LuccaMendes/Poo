package classes_objetos;

public class ContaBancaria {

    String agencia;
    String numeroConta;
    String tipoConta;
    Double saldo;
    Cliente cliente;

    public void depositar(Double valorDeposito){
        saldo += valorDeposito;
    }

//    public void exibirDetalhes(){
//        System.out.println("Agencia: " + agencia);
//        System.out.println("Numero da conta: " + numeroConta);
//        System.out.println("Tipo de Conta: " + tipoConta);
//        System.out.println("Titular: " + cliente.titular);
//        System.out.println("Saldo: " + saldo);
//        System.out.println("Email: " + cliente.contatos.email);
//        System.out.println("Telefone: " + cliente.contatos.telefone);
//        System.out.println("Bairro: " + cliente.endereco.bairro);
//        System.out.println("Rua: " + cliente.endereco.rua);
//        System.out.println("Número: " + cliente.endereco.numero);
//        System.out.println("Complemento: " + cliente.endereco.complemento);
//        System.out.println("Referência: " + cliente.endereco.referencia);
//        System.out.println("Cidade: " + cliente.endereco.cidade);
//        System.out.println("Estado: " + cliente.endereco.estado);
//        System.out.println("Cep: " + cliente.endereco.cep);
//
//    }


    @Override
    public String toString() {
        return "**Conta Bancaria**: " +
                "\n Agencia: " + agencia +
                "\n NumeroConta: " + numeroConta +
                "\n TipoConta: " + tipoConta +
                "\n Saldo: " + saldo +
                "\n" + cliente;

    }
}
