package beginner;

import java.util.Scanner;

public class Uri1060 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int c = 0;
        double[] a = new double[6];

        for (int i = 0 ; i< a.length ; i++) {
            a[i] = leitor.nextDouble();
            if (a[i] >= 0){
                c++;
            }
        }

        System.out.printf("%d valores positivos\n",c);
    }
}
