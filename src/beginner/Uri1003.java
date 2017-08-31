package beginner;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int A,B,SOMA;
        A = leitor.nextInt();
        B = leitor.nextInt();
        SOMA = A + B;
        System.out.printf("SOMA = %d\n",SOMA);
    }
}
