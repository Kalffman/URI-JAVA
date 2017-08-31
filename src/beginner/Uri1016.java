package beginner;

import java.util.Scanner;

public class Uri1016 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int km,dy;
        km = Integer.valueOf(leitor.nextLine());
        dy = 2*km;
        System.out.printf("%d minutos\n",dy);
    }
}
