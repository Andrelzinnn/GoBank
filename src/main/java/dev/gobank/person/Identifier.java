package dev.gobank.person;

public class Identifier {
    private String name;
    private String lastName;
    private String cpf;

    public Identifier(){}

    public Identifier(String name, String lastName, String cpf) {
        this.name = name;
        this.lastName = lastName;
        this.cpf = cpf;
    }

    public String getKey() {
        return String.format("%s_%s_%s", name, lastName, cpf);
    }

}
