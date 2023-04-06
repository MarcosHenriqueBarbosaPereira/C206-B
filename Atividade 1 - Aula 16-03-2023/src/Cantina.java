public class Cantina {

    String nome;
    Salgado[] salgado;

    void addSalgados(Salgado novoSalgado){
        for(int i=0; i<salgado.length; i++) {
            if(salgado[i] == null) {
                salgado[i] = new Salgado();
                salgado[i].nome = novoSalgado.nome;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("O estabelecimento " + nome + " oferece os seguintes salgados:");
        for(Salgado aux : this.salgado) {
            if(aux != null)
                System.out.println(aux.nome);
        }
    }

}
