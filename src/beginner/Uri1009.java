package beginner;

import java.util.Scanner;

public class Uri1009 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        String N;
        double A,B,C;
        N = leitor.nextLine();
        A = Double.parseDouble(leitor.nextLine());
        B = Double.parseDouble(leitor.nextLine());
        C = A + (B*0.15);
        System.out.printf("TOTAL = R$ %.2f\n",C);
    }
}
