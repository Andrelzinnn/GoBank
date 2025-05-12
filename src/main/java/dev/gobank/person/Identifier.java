package dev.gobank.person;

public class Identifier {
    private String cpf;

    public Identifier(){}

    public Identifier(String cpf) {
        this.cpf = cpf;
    }

    public String getKey() {
        return cpf;
    }

}
