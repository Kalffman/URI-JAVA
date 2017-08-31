package beginner;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String... args){
        Scanner leitor = new Scanner(System.in);
        int A;
        Integer[] v = new Integer[7];
        A = Integer.valueOf(leitor.nextLine());
        if (A > 0 && A < 1000000){
            int aux = A;
            v[0] = 0;
            while( aux - 100 >= 0){
                v[0]++;
                aux -= 100;
            }
            v[1] = 0;
            while ( aux - 50 >= 0){
                v[1]++;
                aux -= 50;
            }
            v[2] = 0;
            while ( aux - 20 >= 0){
                v[2]++;
                aux -= 20;
            }
            v[3] = 0;
            while ( aux - 10 >= 0){
                v[3]++;
                aux -= 10;
            }
            v[4] = 0;
            while ( aux - 5 >= 0){
                v[4]++;
                aux -= 5;
            }
            v[5] = 0;
            while ( aux - 2 >= 0){
                v[5]++;
                aux -= 2;
            }
            v[6] = 0;
            while ( aux - 1 >= 0){
                v[6]++;
                aux-= 1;
            }

            System.out.printf("%d\n",A);
            System.out.printf("%d nota(s) de R$ 100,00\n",v[0]);
            System.out.printf("%d nota(s) de R$ 50,00\n",v[1]);
            System.out.printf("%d nota(s) de R$ 20,00\n",v[2]);
            System.out.printf("%d nota(s) de R$ 10,00\n",v[3]);
            System.out.printf("%d nota(s) de R$ 5,00\n",v[4]);
            System.out.printf("%d nota(s) de R$ 2,00\n",v[5]);
            System.out.printf("%d nota(s) de R$ 1,00\n",v[6]);
        }
    }
}
