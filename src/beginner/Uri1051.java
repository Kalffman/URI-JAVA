package beginner;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double a;
        a = leitor.nextDouble();

        if ( a >= 0 && a <= 2000 ){
            System.out.printf("Isento\n");
        }else if ( a >= 2000.01 && a <= 3000 ){
            a = a*0.08;
            System.out.printf("R$ %.2f\n",a);
        }else if ( a >= 3000.01 && a <= 4500 ){

            a = a*0.18;
            System.out.printf("R$ %.2f\n",a);
        }else if ( a > 4500 ){
            a = a*0.28;
            System.out.printf("R$ %.2f\n",a);
        }
    }
}
