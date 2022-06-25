import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        Integer numeroUsuario;
        Integer numeroAleatorio;
            
        System.out.println("Digite um número: ");
        numeroUsuario = scanner.nextInt();
        Integer valorMinimo = 0;
        Integer valorMaximo = 10;
        Random aleatorio = new Random();
        numeroAleatorio = aleatorio.nextInt((valorMaximo - valorMinimo));
        while (numeroUsuario != numeroAleatorio){   
            System.out.println("Digite um número: ");
            numeroUsuario = scanner.nextInt();
            if(numeroUsuario == numeroAleatorio){
                System.out.println("Você acertou!!");
            }
        }
        scanner.close();
    }
}
