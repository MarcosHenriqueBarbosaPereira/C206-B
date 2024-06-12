import Brownies.*;

public class Main {
    public static void main(String[] args) {

        BrownieCafe bc = new BrownieCafe("Jorge", 15.25, "Café");
        BrownieNutella bn = new BrownieNutella("Jorgina", 11.99, "Nutella");
        BrownieDoceDeLeite bd = new BrownieDoceDeLeite("Jorgenilson", 18.75, "Doce de Leite");

        bc.addCafe();
        bn.addNutella();
        bd.addDoceDeLeite();

        bc.addCarrinhoDeCompras();
        bc.mostraInfo();
        bc.calculaValorTotalDaCompra();

        bn.addCarrinhoDeCompras();
        bn.mostraInfo();
        bn.calculaValorTotalDaCompra();

        bd.addCarrinhoDeCompras();
        bd.mostraInfo();
        bd.calculaValorTotalDaCompra();
    }
}