package encapsulamento;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private int idade;
    public static final Double PI = 3.14;
    public static final Double ICMS = 0.28;

    public Pessoa(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }
    public Pessoa(String nome, String cpf, String telefone, String email, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
    }

    //get -> retornar o valor do atributo
    //set -> altera o valor do atributo


    public String getNome() {
        if(nome == null) {
            return "Nenhum Pessoa";
        }
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() < 2) {
            System.out.println("Nome deve ter no minimo 2 caracteres");
            return;
        }
        this.nome = nome;
    }

    public String getCpf() {
        if(cpf == null) {
            return "CPF Invalido!";
        }
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() != 11) {
            System.out.println("CPF deve ter 11 caracteres");
            return;
        }
        this.cpf = cpf;
    }

    public String getTelefone() {
        if (telefone == null) {
            return "Telefone Invalido!";
        }
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone.length() != 11) {
            System.out.println("Telefone deve ter 11 caracteres");
            return;
        }
        this.telefone = telefone;
    }

    public String getEmail() {
        if(Objects.isNull(email)) {
            return "Email Invalido!";
        }
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        if(!email.contains("@gmail.com") || !email.contains("@hotmail.com") || !email.contains("outlook.com")) {
            System.out.println("Email Invalido!");
            return;
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return  "\n Nome: " + nome +
                "\n Cpf: " + cpf +
                "\n Telefone: " + telefone +
                "\n Email: " + email ;
    }

}
