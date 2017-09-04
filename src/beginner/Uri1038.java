package beginner;

import java.util.Scanner;

public class Uri1038 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        Double[] codes = {0.0,4.0,4.5,5.0,2.0,1.5};
        int n, i;
        n = leitor.nextInt();
        i = leitor.nextInt();
        System.out.printf("Total: R$ %.2f\n",codes[n]*i);
    }
}
