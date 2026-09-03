package ecessoes.personalizadas;

import java.util.Scanner;

public class Cadastro {

    public void cadastrar(String nome, String cpf){
       if(nome.isBlank()){
           throw new CadastroInvalidoException("O nome não pode ser nulo ou vazio");
       }

       if(cpf.length()<11){
           throw new CadastroInvalidoException("CPF invalido");
       }

        System.out.println("Cadastro do usuário " + nome + " - CPF: " + cpf + " realizado com sucesso!");
    }
}
