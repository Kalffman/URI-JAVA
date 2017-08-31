package beginner;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double A,B,C,MEDIA;
        A = Double.parseDouble(leitor.nextLine());
        B = Double.parseDouble(leitor.nextLine());
        C = Double.parseDouble(leitor.nextLine());
        MEDIA = (A*2+B*3+C*5)/(2+3+5);
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}
