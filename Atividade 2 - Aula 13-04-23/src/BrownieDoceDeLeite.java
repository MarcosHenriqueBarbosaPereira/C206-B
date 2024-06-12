public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor){
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
    public void addDoceDeLeite(){
        System.out.println("Adicionando doce de leite extra no brownie.");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("O brownie de doce de leite foi adicionado ao carrinho de compras.\n");
    }
}
