package beginner;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        double A,a = 0,b = 0,c = 0;

        A = leitor.nextDouble();

        if (A >= 0 && A <= 400){
            c = 15;
            a = A * 0.15;
            b = A + a;
        }else if (A >= 400.01 && A <= 800){
            c = 12;
            a = A * 0.12;
            b = A + a;
        }else if (A >= 800.01 && A <= 1200){
            c = 10;
            a = A * 0.10;
            b = A + a;
        }else if (A >= 1200.01 && A <= 2000){
            c = 7;
            a = A * 0.07;
            b = A + a;
        } if (A >= 2000.01){
            c = 4;
            a = A * 0.04;
            b = A + a;
        }

        System.out.printf("Novo salario: %.2f\n",b);
        System.out.printf("Reajuste ganho: %.2f\n",a);
        System.out.printf("Em percentual: %.0f %%\n",c);
    }
}
