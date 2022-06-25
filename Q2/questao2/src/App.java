import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            List<Integer> list = new ArrayList<>(Arrays.asList(2,4,6,8,10,12,14,16,18,55,55,18));
            List<Integer> listAcima10 = new ArrayList<>();
            List<Integer> listAcima50 = new ArrayList<>();

            listAcima10 = list.stream().distinct().filter(n -> n > 10).collect(Collectors.toList());
            listAcima50 = list.stream().distinct().filter(n -> n > 50).collect(Collectors.toList());

            Integer somaTotal=0;

                for (Integer soma : list) {
                    somaTotal += soma;
                }
        
                System.out.println("Número Maior: "+ Collections.max(list));
                System.out.println("Número Menor: "+ Collections.min(list));
                System.out.println("Média Aritmética: "+ somaTotal/list.size());
                System.out.print("Números acima de 10: "+ listAcima10.size()+"\nOs Números são: ");
                for (Integer integer : listAcima10) {
                    System.out.print(integer+"; ");
                }
                System.out.print("\nNúmeros acima de 50: "+ listAcima50.size()+"\nOs Números são: ");
                for (Integer integer : listAcima50) {
                    System.out.print(integer+"; ");
                }
                
            scanner.close();
    }
}
