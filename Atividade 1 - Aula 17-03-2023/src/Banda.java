public class Banda {

    String nome;
    String genero;

    Empresario[] empresarios = new Empresario[2];
    Musica[] musicas = new Musica[20];
    Membro[] membros = new Membro[6];

    public Banda(String nome,String genero){
        this.nome = nome;
        this.genero = genero;
    }

    void mostraInfo(){
        System.out.println("A seguir seguem informacoes sobre a banda " +nome+ ":");
        System.out.println("Genero: " + this.genero);
        System.out.println("Integrantes:");
        for(Membro aux : membros){
            if(aux != null)
                System.out.println(" - " + aux.nome + " - " + aux.funcao);
        }
        System.out.println("Lista de musicas:");
        for(Musica aux : musicas){
            if(aux != null)
                System.out.println(" - " + aux.nome + " - " + aux.duracao + " segundos");
        }
        System.out.println("Empresarios:");
        for(Empresario aux: empresarios){
            if(aux != null){
                System.out.println(" - " + aux.nome + " - CNPJ: " + aux.cnpj);
            }
        }

    }
    void addMusicaNova(Musica musica){
        for(int i=0; i<musicas.length; i++){
            if(musicas[i] == null) {
                musicas[i] = musica;
                break;
            }
        }
    }

    void addMembroNovo(Membro membro){
        for(int i=0; i<membros.length; i++){
            if(membros[i] == null) {
                membros[i] = membro;
                break;
            }
        }
    }
}
