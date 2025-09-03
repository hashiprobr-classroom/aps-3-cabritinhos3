package br.edu.insper.desagil.aps3.tindfy.model;

public abstract class Pessoa {
    private int id;

    private String nome;

    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
