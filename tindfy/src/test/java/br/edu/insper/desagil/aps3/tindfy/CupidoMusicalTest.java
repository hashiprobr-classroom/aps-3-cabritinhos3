package br.edu.insper.desagil.aps3.tindfy;

import br.edu.insper.desagil.aps3.tindfy.Artista;
import br.edu.insper.desagil.aps3.tindfy.CupidoMusical;
import br.edu.insper.desagil.aps3.tindfy.Musica;
import br.edu.insper.desagil.aps3.tindfy.Usuario;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CupidoMusicalTest {
    @Test
    public void semLikesComMusicas() {
        Artista a = new Artista(1, "Artista");
        Musica m = new Musica(a, "Hit");

        List<Musica> musicas = new ArrayList<>();

        musicas.add(m);

        Usuario u1 = new Usuario(1, "A", musicas);
        Usuario u2 = new Usuario(2, "B", musicas);

        CupidoMusical c = new CupidoMusical();

        assertFalse(c.deuMatch(u1, u2));
    }

    @Test
    public void comLikesSemMusicas() {
        Artista a = new Artista(1, "Artista");
        Musica m1 = new Musica(a, "Hit1");
        Musica m2 = new Musica(a, "Hit2");

        List<Musica> musicas = new ArrayList<>();

        musicas.add(m1);
        musicas.add(m2);

        Usuario u1 = new Usuario(1, "A", musicas);
        Usuario u2 = new Usuario(2, "B", musicas);

        CupidoMusical c = new CupidoMusical();
        c.darLike(u1.getId(), u2.getId());
        c.darLike(u2.getId(), u1.getId());

        assertFalse(c.deuMatch(u1, u2));
    }

    @Test
    public void comLikesComMusicas() {
        Artista a = new Artista(1, "Artista");
        Musica m = new Musica(a, "Hit");

        List<Musica> musicas = new ArrayList<>();
        musicas.add(m);

        Usuario u1 = new Usuario(1, "A", musicas);
        Usuario u2 = new Usuario(2, "B", musicas);

        CupidoMusical c = new CupidoMusical();
        c.darLike(u1.getId(), u2.getId());
        c.darLike(u2.getId(), u1.getId());

        assertTrue(c.deuMatch(u1, u2));
    }
}
