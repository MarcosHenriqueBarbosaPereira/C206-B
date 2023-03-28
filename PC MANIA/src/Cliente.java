public class Cliente {

    String nome;
    long cpf;
    Computador[] computadores = new Computador[10];

    float calculaTotalCompra(){
        float total = 0;

        for(Computador aux : computadores){
            if(aux != null)
                total += aux.preco;
            else break;
        }
        return total;
    }
}
