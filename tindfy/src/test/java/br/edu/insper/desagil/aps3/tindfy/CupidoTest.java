package br.edu.insper.desagil.aps3.tindfy;

import br.edu.insper.desagil.aps3.tindfy.model.Artista;
import br.edu.insper.desagil.aps3.tindfy.model.CupidoMusical;
import br.edu.insper.desagil.aps3.tindfy.model.Musica;
import br.edu.insper.desagil.aps3.tindfy.model.Usuario;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CupidoTest {
    @Test
    public void semLikesComMusicas() {
        Artista a = new Artista(1, "Artista");
        Musica m = new Musica(a, "Hit");

        Usuario u1 = new Usuario(1, "A", new ArrayList<>(Arrays.asList(m)));
        Usuario u2 = new Usuario(2, "B", new ArrayList<>(Arrays.asList(m)));

        CupidoMusical c = new CupidoMusical();

        assertFalse(c.deuMatch(u1, u2));
    }

    @Test
    public void comLikesSemMusicas() {
        Artista a = new Artista(1, "Artista");
        Musica m1 = new Musica(a, "Hit1");
        Musica m2 = new Musica(a, "Hit2");

        Usuario u1 = new Usuario(1, "A", new ArrayList<>(Arrays.asList(m1)));
        Usuario u2 = new Usuario(2, "B", new ArrayList<>(Arrays.asList(m2)));

        CupidoMusical c = new CupidoMusical();
        c.darLike(u1.getId(), u2.getId());
        c.darLike(u2.getId(), u1.getId());

        assertFalse(c.deuMatch(u1, u2));
    }

    @Test
    public void comLikesComMusicas() {
        Artista a = new Artista(1, "Artista");
        Musica m = new Musica(a, "Hit");

        Usuario u1 = new Usuario(1, "A", new ArrayList<>(Arrays.asList(m)));
        Usuario u2 = new Usuario(2, "B", new ArrayList<>(Arrays.asList(m)));

        CupidoMusical c = new CupidoMusical();
        c.darLike(u1.getId(), u2.getId());
        c.darLike(u2.getId(), u1.getId());

        assertTrue(c.deuMatch(u1, u2));
    }
}
