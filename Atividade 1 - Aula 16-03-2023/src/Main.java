import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        Salgado aux = new Salgado();
        Salgado[] salgado = new Salgado[10];

        cantina.salgado = salgado;

        cantina.nome = "Cantina da Neide";

        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<cantina.salgado.length; i++){
            aux.nome = entrada.nextLine();
            if(aux.nome != "") {
                cantina.addSalgados(aux);
            }
            else break;
        }

        cantina.mostraInfo();

        entrada.close();
    }
}