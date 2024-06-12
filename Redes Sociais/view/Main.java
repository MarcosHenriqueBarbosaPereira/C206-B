package view;

import model.*;

public class Main{

    public static void main(String[] args) {
        
        RedeSocial[] redes = new RedeSocial[4];
        
        redes[0] = new Facebook("SenhaFace123", 11);
        redes[1] = new GooglePlus("SenhaGPlus123", 5);
        redes[2] = new Instagram("SenhaInsta123", 543);
        redes[3] = new Twitter("SenhaTwitter123", 666);

        Usuario user = new Usuario("Marcos", "marcos.redesocial@gmail.com", redes);


        System.out.print(user.getNome() + " ");
        ((Facebook)user.redes[0]).fazStreaming();
        System.out.print(user.getNome() + " ");
        ((Facebook)user.redes[0]).compartilhar();
        System.out.print(user.getNome() + " ");
        ((Facebook)user.redes[0]).curtirPublicacao();
        System.out.println();

        System.out.print(user.getNome() + " ");
        ((Instagram)user.redes[2]).postarFoto();
        System.out.print(user.getNome() + " ");
        ((Instagram)user.redes[2]).postarVideo();
        System.out.print(user.getNome() + " ");
        ((Instagram)user.redes[2]).postarComentario();




    }
}