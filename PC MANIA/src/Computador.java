public class Computador {

    String marca;
    float preco;
    MemoriaUSB memoria;
    SistemaOperacional sop = new SistemaOperacional();
    HardwareBasico[] hardware = new HardwareBasico[5];

    void mostraPCConfigs(){
        System.out.println("Configurações do PC " + marca + ":");
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional:");
        System.out.println(" - " + sop.nome);
        System.out.println(" - " + sop.tipo + " bits");
        System.out.println("Hardware básico:");
        for(HardwareBasico aux : hardware){
            if(aux != null)
                System.out.println(" - Componente: " + aux.nome + "; Capacidade: " + aux.capacidade + ";");
        }
        System.out.println("Memória conjunta da promoção: ");
        System.out.println(" - Tipo:" + memoria.nome + "; Capacidade: " + memoria.capacidade + ";\n");
    }
    void addMemoriaUSB(MemoriaUSB musb){
        memoria = musb;
    }

}
