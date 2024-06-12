package model;

public class Usuario {
    
    private String nome;
    private String email;
    public RedeSocial[] redes = new RedeSocial[5];

    public Usuario(String nome, String email, RedeSocial[] redesSociais){
        this.nome = nome;
        this.email = email;
        this.redes = redesSociais;
        for(int i=0; i<redesSociais.length; i++){
            if(redesSociais[i] != null){
                redes[i] = redesSociais[i];
            }else break;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}