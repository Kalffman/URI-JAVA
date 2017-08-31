package beginner;

import java.util.Scanner;

public class Uri1017 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int x,y,d;
        double z;
        x = Integer.valueOf(leitor.nextLine());
        y = Integer.valueOf(leitor.nextLine());
        d = x*y;
        z = d/12;
        System.out.printf("%.3f\n",z);
    }
}
