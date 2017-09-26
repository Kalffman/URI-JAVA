package beginner;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double N;
        N = leitor.nextDouble();

        if (N >= 0D && N <= 25D){
            System.out.printf("%s\n","Intervalo [0,25]");
        }else if (N > 25D && N <= 50D){
            System.out.printf("%s\n","Intervalo (25,50]");
        }else if (N > 50D && N <= 75D){
            System.out.printf("%s\n","Intervalo (50,75]");
        }else if (N > 75D && N <= 100D){
            System.out.printf("%s\n","Intervalo (75,100]");
        }else{
            System.out.printf("%s\n","Fora de intervalo");
        }
    }
}
