package beginner;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        String[] A1 = leitor.nextLine().split(" ");
        String[] A2 = leitor.nextLine().split(" ");

        int a1, b1, a2, b2;
        double c1, c2, v;

        a1 = Integer.valueOf(A1[0]);
        b1 = Integer.valueOf(A1[1]);
        c1 = Double.parseDouble(A1[2]);

        a2 = Integer.valueOf(A2[0]);
        b2 = Integer.valueOf(A2[1]);
        c2 = Double.parseDouble(A2[2]);

        v = (b1*c1)+(b2*c2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",v);
    }
}
