package beginner;

import java.util.Scanner;

public class Uri1004 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        Integer A,B,PROD;
        A = leitor.nextInt();
        B = leitor.nextInt();
        PROD = A*B;
        System.out.printf("PROD = %d",PROD);
    }
}
