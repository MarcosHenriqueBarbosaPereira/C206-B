package model;

import controller.Compartilhamento;
import controller.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicação no GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("abriu uma live no GooglePlus!");
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no GooglePlus!");
    }   

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no GooglePlus!");
    }
    
}
