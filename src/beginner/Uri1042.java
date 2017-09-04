package beginner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Uri1042 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] vetor = new int[3];
        int[] clone = new int[3];


        vetor[0] = s.nextInt();
        vetor[1] = s.nextInt();
        vetor[2] = s.nextInt();

        clone[0] = vetor[0];
        clone[1] = vetor[1];
        clone[2] = vetor[2];

        Arrays.sort(clone);
        for (Integer V : clone) System.out.println(V);
        System.out.println();
        for (Integer v : vetor) System.out.println(v);
    }
}
