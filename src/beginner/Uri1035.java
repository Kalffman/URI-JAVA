package beginner;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int A,B,C,D;
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();

        leitor.close();

        if((B > C)&&
           (D > A)&&
           (C + D > A + B)&&
           (C%1 >= 0)&&
           (D%1 >= 0)&&
           (A%1 >= 0)){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
