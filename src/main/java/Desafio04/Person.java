package Desafio04;

public class Person {
    private String nome;
    private Priority priority;

    public Person(String nome, Priority priority) {
        this.nome = nome;
        this.priority = priority;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
