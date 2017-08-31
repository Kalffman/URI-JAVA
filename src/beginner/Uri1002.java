package beginner;

import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double N = 3.14159;
        double R;
        double A;
        R = Double.parseDouble(leitor.nextLine());
        A = N*(R*R);
        System.out.printf("A=%.4f\n",A);
    }
}
