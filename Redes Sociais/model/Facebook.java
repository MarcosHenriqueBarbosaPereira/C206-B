package model;

import controller.Compartilhamento;
import controller.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("compartilhou uma publicação no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("abriu uma live no Facebook!");
    }

    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um vídeo no Facebook!");
    }   

    @Override
    public void postarComentario() {
        System.out.println("postou um comentário no Facebook!");
    }
    
}
