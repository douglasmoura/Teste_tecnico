package q1;

public class Caixa {
    
    public static Double calculaValorFinal(Produto produto, Integer quantidade){

        if(produto.getTipe() == 1)
        return (produto.getValue() * quantidade) * 0.90;

        if(produto.getTipe() == 2)
        return (produto.getValue() * quantidade) * 0.80;

        if(produto.getTipe() == 3 && quantidade > 5)
        return (produto.getValue() * quantidade) * 0.90;

        return produto.getValue() * quantidade;
    }
}
