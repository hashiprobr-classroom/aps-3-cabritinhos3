package br.edu.insper.desagil.aps3.tindfy;

import br.edu.insper.desagil.aps3.tindfy.model.Artista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArtistaTest {

    @Test
    public void constroi() {
        Artista a = new Artista(0, "Teste");
        assertEquals(0, a.getId());
        assertEquals("Teste", a.getNome());
    }

    @Test
    public void mudaNome() {
        Artista a = new Artista(0, "Teste");
        a.setNome("Novo");
        assertEquals(0, a.getId());
        assertEquals("Novo", a.getNome());
    }

}
