package beginner;

import java.util.Scanner;

public class Uri1041 {
    public static void main(String... args){
        Scanner s = new Scanner(System.in);
        double x,y;

        x = s.nextDouble();
        y = s.nextDouble();

        if ( x == 0 )
            if ( y == 0 )
                System.out.printf("Origem\n");
            else if ( y > 0 )
                System.out.printf("Eixo Y\n");
            else
                System.out.printf("Eixo Y\n");
        else if ( x > 0 )
            if ( y == 0 )
                System.out.printf("Eixo X\n");
            else if ( y > 0 )
                System.out.printf("Q1\n");
            else
                System.out.printf("Q4\n");
        else
            if ( y == 0 )
                System.out.printf("Eixo X\n");
            else if ( y > 0 )
                System.out.printf("Q2\n");
            else
                System.out.printf("Q3\n");
    }
}
