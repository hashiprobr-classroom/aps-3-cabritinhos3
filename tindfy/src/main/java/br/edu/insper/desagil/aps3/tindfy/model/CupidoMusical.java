package br.edu.insper.desagil.aps3.tindfy.model;

public class CupidoMusical extends Cupido{
    @Override
    public boolean deuMatch(Usuario u1, Usuario u2) {
        boolean matchBasico = super.deuMatch(u1, u2);
        if (matchBasico) {
            return false;
        }
        for (Musica m : u1.getMusicasFavoritas()) {
            if (u2.jaAdicionou(m)) {
                return true;
            }
        }
        return false;
    }
}
