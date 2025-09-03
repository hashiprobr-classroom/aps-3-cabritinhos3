package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido(){
        this.likes = new HashMap<>();
    }

    public void darLike(Integer primeiro, Integer segundo){
        if(!likes.containsKey(primeiro)){
            List<Integer> like = new ArrayList<>();
            like.add(segundo);
            this.likes.put(primeiro, like);
        } else {
            List<Integer> lista = likes.get(primeiro);
            boolean flag = true;
            for(Integer index : lista){
                if(index.equals(primeiro)){
                    flag = false;
                }
            }
            if(flag){
                lista.add(primeiro);
            }
        }
    }

    public boolean deuMatch(Usuario primeiro, Usuario segundo){
        List<Integer> favoritos = this.likes.get(primeiro.getId());
        boolean flag = true;
        for(Integer index : favoritos){
            if(index.equals(primeiro.getId())){
                return true;
            }
        }
        return false;
    }

}
