package beginner;

import java.util.Scanner;

public class Uri1012 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double A,B,C,pi = 3.14159;
        String[] v = leitor.nextLine().split(" ");
        A = Double.parseDouble(v[0]);
        B = Double.parseDouble(v[1]);
        C = Double.parseDouble(v[2]);

        System.out.printf("TRIANGULO: %.3f\n",(A*C)/2);
        System.out.printf("CIRCULO: %.3f\n",pi*C*C);
        System.out.printf("TRAPEZIO: %.3f\n",((A+B)*C)/2);
        System.out.printf("QUADRADO: %.3f\n",B*B);
        System.out.printf("RETANGULO: %.3f\n",A*B);
    }
}
