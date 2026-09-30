package colecoes;

import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private String cpf;
    private int idade;
    private char genero;

    public Pessoa(String nome, String cpf, int idade, char genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return
                "\n Nome: " + nome +
                        "\n Cpf: " + cpf +
                        "\n Idade: " + idade +
                        "\n Genero: " + genero;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.cpf.compareTo(o.cpf);
    }
}

