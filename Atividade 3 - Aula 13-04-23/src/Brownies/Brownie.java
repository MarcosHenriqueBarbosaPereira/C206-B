package Brownies;

public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor){
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoDeCompras(){
        System.out.println("Este brownie foi adicionado ao carrinho de compras.\n");
    }

    public void calculaValorTotalDaCompra(){
        System.out.println("A compra do brownie " + this.nome + " de sabor " + this.sabor + " é igual à: " + this.preco + "R$\n");
    }

    public void mostraInfo(){
        System.out.println("Nome do Brownies.Brownie: " + this.nome);
        System.out.println("Sabor: " + this.sabor + "\n");
    }


}
