package br.edu.insper.desagil.aps3.tindfy.model;

public class Artista extends Pessoa{

    public Artista(int id, String nome){
        super(id, nome);
    }

    public int getId() {
        return super.getId();
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
    }
}
