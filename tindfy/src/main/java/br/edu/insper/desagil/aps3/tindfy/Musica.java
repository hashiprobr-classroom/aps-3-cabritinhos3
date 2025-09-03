package br.edu.insper.desagil.aps3.tindfy;

import br.edu.insper.desagil.aps3.tindfy.model.Artista;

public class Musica {

    private br.edu.insper.desagil.aps3.tindfy.model.Artista artista;

    private String titulo;

    public Musica(Artista artista, String titulo){
        this.artista = artista;
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }
}