package beginner;

import java.util.Scanner;

public class Uri1017 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double x,y,d,z;
        x = leitor.nextInt();
        y = leitor.nextInt();
        d = x*y;
        z = d/12;
        System.out.printf("%.3f\n",z);
    }
}
