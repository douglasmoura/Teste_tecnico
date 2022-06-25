package questao3;

public class COFINS implements Imposto{


    public static Double calculaImposto(Double value){

        if (value > 17000) 
            return value * 0.08;

        else
            return + value;
    }   
}

