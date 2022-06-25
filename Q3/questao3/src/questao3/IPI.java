package questao3;

public class IPI implements Imposto {

    public static Double calculaImposto(Double value){

        if (value < 25000) 
            return value * 0.05;

        else
            return+ value * 0.10;
    }
}
