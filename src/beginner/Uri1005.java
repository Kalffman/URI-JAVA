package beginner;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double A;
        double B;
        double MEDIA;
        A = Double.parseDouble(leitor.nextLine());
        B = Double.parseDouble(leitor.nextLine());
        MEDIA = (A*3.5 + B*7.5)/(3.5+7.5);
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}
