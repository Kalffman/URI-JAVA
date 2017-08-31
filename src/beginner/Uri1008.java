package beginner;

import java.util.Scanner;

public class Uri1008 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int A,B;
        double C,RESULT;
        A = Integer.valueOf(leitor.nextLine());
        B = Integer.valueOf(leitor.nextLine());
        C = Double.parseDouble(leitor.nextLine());
        RESULT = B*C;
        System.out.printf("NUMBER = %d\n",A);
        System.out.printf("SALARY = U$ %.2f\n", RESULT);
    }
}
