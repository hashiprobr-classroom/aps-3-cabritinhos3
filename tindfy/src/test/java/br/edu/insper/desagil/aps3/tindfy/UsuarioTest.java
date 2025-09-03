package br.edu.insper.desagil.aps3.tindfy;

import br.edu.insper.desagil.aps3.tindfy.model.Artista;
import br.edu.insper.desagil.aps3.tindfy.model.Musica;
import br.edu.insper.desagil.aps3.tindfy.model.Usuario;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
    @Test
    public void naoAdiciona() {
        Artista a1 = new Artista(1, "Artista1");
        Musica m1 = new Musica(a1, "Musica1");
        Musica m2 = new Musica(a1, "Musica2");
        Musica m3 = new Musica(a1, "Musica3");

        List<Musica> musicas = new ArrayList<>();

        musicas.add(m1);
        musicas.add(m2);
        musicas.add(m3);

        Usuario u = new Usuario(10, "Carlos", new ArrayList<>(musicas));
        u.jaAdicionou(m1);

        assertEquals(3, u.getMusicasFavoritas().size());
    }

    @Test
    public void adiciona() {
        Artista a1 = new Artista(1, "Artista1");
        Musica m1 = new Musica(a1, "Musica1");
        Musica m2 = new Musica(a1, "Musica2");
        Musica m3 = new Musica(a1, "Musica3");
        Usuario u = new Usuario(10, "Carlos", new ArrayList<>(Arrays.asList(m1, m2, m3)));
        Musica m4 = new Musica(a1, "Musica4");

        u.adiciona(m4);

        u.jaAdicionou(m4);
        assertEquals(4, u.getMusicasFavoritas().size());
        assertTrue(u.jaAdicionou(m4));
    }
}
