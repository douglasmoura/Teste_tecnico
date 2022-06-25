package questao3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor:");
        Double value = scanner.nextDouble();

        Double valorFinal = value + ICMS.calculaImposto(value) + IPI.calculaImposto(value) +COFINS.calculaImposto(value);
        System.out.println("ICMS: "+ICMS.calculaImposto(value));
        System.out.println("IPI: "+IPI.calculaImposto(value));
        System.out.println("COFINS: "+COFINS.calculaImposto(value));
        System.out.println("Valor final: "+ valorFinal);
        
        scanner.close();
    }
}
