package beginner;
/**
 * Ainda nao aceito no Uri
 */
import java.util.Scanner;

public class Uri1037 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double N;
        N = Double.parseDouble(leitor.next());

        if (N >= 0 && N <= 50){
            System.out.println("Intervalo [0,25]");
        }else if (N > 25 && N <= 50){
            System.out.println("Intervalo (25,50]");
        }else if (N > 50 && N <= 75){
            System.out.println("Intervalo (50,75]");
        }else if (N > 75 && N <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
