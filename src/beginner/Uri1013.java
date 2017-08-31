package beginner;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String... args){

        Scanner leitor = new Scanner(System.in);
        String[] v = leitor.nextLine().split(" ");
        int a,b,c,maiorAb;

        a = Integer.valueOf(v[0]);
        b = Integer.valueOf(v[1]);
        c = Integer.valueOf(v[2]);

        if (a >= b && a >= c)
            System.out.printf("%d eh o maior\n",a);
        else if (b >= a && b >= c)
            System.out.printf("%d eh o maior\n",b);
        else if (c >= a && c >= b)
            System.out.printf("%d eh o maior\n",c);
    }
}
