import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean flag = true;    //Flag para o loop de compra
        int escolha;            //Auxiliar para entrada do pedido

        //Criando o cliente --------------------------------------------------------------------------------------------
        Cliente cliente = new Cliente();
        cliente.nome = "Dom Quixote";
        cliente.cpf = 12345678910L;

        //Iniciando as memórias ----------------------------------------------------------------------------------------
        MemoriaUSB musb1 = new MemoriaUSB();
        MemoriaUSB musb2 = new MemoriaUSB();
        MemoriaUSB musb3 = new MemoriaUSB();

        musb1.nome = "Pen-drive";
        musb1.capacidade = 16;

        musb2.nome = "Pen-drive";
        musb2.capacidade = 32;

        musb3.nome = "HD Externo";
        musb3.capacidade = 1;

        //Iniciando as promocoes de computadores -----------------------------------------------------------------------
        Computador promo1 = new Computador();
        Computador promo2 = new Computador();
        Computador promo3 = new Computador();

        //Promocao 1
        promo1.marca = "Positivo";
        promo1.preco = 2300;
        promo1.sop.nome = "Linux Ubunto";
        promo1.sop.tipo = 32;
        promo1.hardware[0] = new HardwareBasico();
        promo1.hardware[0].nome = "Pentium Core i3";
        promo1.hardware[0].capacidade = 2200;
        promo1.hardware[1] = new HardwareBasico();
        promo1.hardware[1].nome = "Memória RAM";
        promo1.hardware[1].capacidade = 8;
        promo1.hardware[2] = new HardwareBasico();
        promo1.hardware[2].nome = "HD";
        promo1.hardware[2].capacidade = 0.5F;
        promo1.addMemoriaUSB(musb1);

        //Promocao 2
        promo2.marca = "Acer";
        promo2.preco = 5800;
        promo2.sop.nome = "Windows 8";
        promo2.sop.tipo = 64;
        promo2.hardware[0] = new HardwareBasico();
        promo2.hardware[0].nome = "Pentium Core i5";
        promo2.hardware[0].capacidade = 3370;
        promo2.hardware[1] = new HardwareBasico();
        promo2.hardware[1].nome = "Memória RAM";
        promo2.hardware[1].capacidade = 16;
        promo2.hardware[2] = new HardwareBasico();
        promo2.hardware[2].nome = "HD";
        promo2.hardware[2].capacidade = 1;
        promo2.addMemoriaUSB(musb2);

        //Promocao 3
        promo3.marca = "Vaio";
        promo3.preco = 1800;
        promo3.sop.nome = "Windows 10";
        promo3.sop.tipo = 64;
        promo3.hardware[0] = new HardwareBasico();
        promo3.hardware[0].nome = "Pentium Core i7";
        promo3.hardware[0].capacidade = 4500;
        promo3.hardware[1] = new HardwareBasico();
        promo3.hardware[1].nome = "Memória RAM";
        promo3.hardware[1].capacidade = 32;
        promo3.hardware[2] = new HardwareBasico();
        promo3.hardware[2].nome = "HD";
        promo3.hardware[2].capacidade = 2;
        promo3.addMemoriaUSB(musb3);

        //Loop de compra -----------------------------------------------------------------------------------------------
        System.out.println("Bem vindo à semana do PC Mania, caro cliente.");
        System.out.println("Fique a vontade para fazer suas compras com as nossas incríveis promoções.");
        System.out.println("A seguir estão listados os PCs a venda:\n");
        System.out.println("Promoção 1:");
        promo1.mostraPCConfigs();
        System.out.println("Promoção 2:");
        promo2.mostraPCConfigs();
        System.out.println("Promoção 3:");
        promo3.mostraPCConfigs();

        Scanner entrada = new Scanner(System.in);

        while(flag){

            System.out.println("Para adicionar um produto ao seu carrinho, digite o número referente a promoção desejada.");
            System.out.println("Para fechar o carrinho, entre com o valor 0.\n");

            escolha = entrada.nextInt();

            switch(escolha){

                case 0:
                    flag = false;
                    System.out.println("Carrinho de compras fechado.\n");
                    break;

                case 1:
                    for(int i=0; i<cliente.computadores.length; i++) {
                        if(cliente.computadores[i] == null) {
                            cliente.computadores[i] = promo1;
                            System.out.println("Promoção 1 adicionada ao carrinho.\n");
                            break;
                        }
                    }
                    break;

                case 2:
                    for(int i=0; i<cliente.computadores.length; i++) {
                        if(cliente.computadores[i] == null) {
                            cliente.computadores[i] = promo2;
                            System.out.println("Promoção 2 adicionada ao carrinho.\n");
                            break;
                        }
                    }
                    break;

                case 3:
                    for(int i=0; i<cliente.computadores.length; i++) {
                        if(cliente.computadores[i] == null) {
                            cliente.computadores[i] = promo3;
                            System.out.println("Promoção 3 adicionada ao carrinho.\n");
                            break;
                        }
                    }
                    break;

                default:
                    break;
            }
        }

        System.out.print("Prezado(a) " + cliente.nome + " o total de sua compra foi de: R$");
        System.out.printf("%.2f",cliente.calculaTotalCompra());
    }
}