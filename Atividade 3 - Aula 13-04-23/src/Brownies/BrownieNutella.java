package Brownies;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor){
        super(nome,preco,sabor);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    public void addNutella(){
        System.out.println("Adicionando nutella extra no brownie.");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("O brownie de nutella foi adicionado ao carrinho de compras.\n");
    }
}
