public class Main {
    public static void main(String[] args) {

        Banda banda = new Banda("Pentakill", "PowerMetal");

        Empresario emp = new Empresario("Eu", 127647296);

        banda.empresarios[1] = emp;

        Membro membro1 = new Membro("Karthus", "Vocalista");
        Membro membro2 = new Membro("Kayle", "Vocalista");
        Membro membro3 = new Membro("Yorick", "Baixista");
        Membro membro4 = new Membro("Olaf", "Baterista");
        Membro membro5 = new Membro("Sona", "Tecladista");
        Membro membro6 = new Membro("Mordekaiser", "Guitarrista");

        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.addMembroNovo(membro3);
        banda.addMembroNovo(membro4);
        banda.addMembroNovo(membro5);
        banda.addMembroNovo(membro6);

        Musica musica1 = new Musica("Deathfire Grasp", 241);
        Musica musica2 = new Musica("Redemption", 256);
        Musica musica3 = new Musica("Edge of Night", 290);

        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMusicaNova(musica3);

        banda.mostraInfo();
    }
}