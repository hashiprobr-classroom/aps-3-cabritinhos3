package br.edu.insper.desagil.aps3.tindfy;

import java.util.Iterator;
import java.util.List;

public class Usuario extends Pessoa{

    private List<Musica> musicasFavoritas;

    public Usuario(int id, String nome, List<Musica> musicasFavoritas){
        super(id, nome);
        this.musicasFavoritas = musicasFavoritas;
    }

    public List<Musica> getMusicasFavoritas() {
        return musicasFavoritas;
    }

    public boolean jaAdicionou(Musica musica){
        Iterator<Musica> iterator = this.musicasFavoritas.iterator();
        while(iterator.hasNext()){
            Musica index = iterator.next();
            if(index.getArtista().getId() == musica.getArtista().getId() &&
                    index.getTitulo().equals(musica.getTitulo())) return true;
        }
        return false;
    }

    public void adiciona(Musica musica){
        if(!jaAdicionou(musica)) {
            this.musicasFavoritas.add(musica);
        }
    }
}
