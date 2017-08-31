package beginner;

import java.util.Scanner;

public class Uri1007 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int A,B,C,D,DIFERENCA;
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();
        DIFERENCA = A*B - C*D;
        System.out.printf("DIFERENCA = %d\n",DIFERENCA);
    }
}
