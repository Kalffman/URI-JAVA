package beginner;

import java.util.Scanner;

public class Uri1011 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);

        double V,R,p = 3.14159;
        R = Double.valueOf(leitor.nextLine());
        V = (4.0/3.0)*p*(R*R*R);

        System.out.printf("VOLUME = %.3f\n",V);
    }
}
