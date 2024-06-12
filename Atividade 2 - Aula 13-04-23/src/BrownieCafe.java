public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor){
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
    public void addCafe(){
        System.out.println("Adicionando cafe extra no brownie.");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("O brownie de café foi adicionado ao carrinho de compras.\n");
    }
}
