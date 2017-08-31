package beginner;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);

        int X;
        double Y;

        X = Integer.valueOf(leitor.nextLine());
        Y = Double.parseDouble(leitor.nextLine());

        System.out.printf("%.3f km/l\n",X/Y);
    }
}
